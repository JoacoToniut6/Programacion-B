package Punto5y6;
import java.io.*;

public class torneoTenis {
    public static void main(String args[]) throws IOException{
        int i,cantJugadoresInv=0,cantJugadoresTot=0;
        File archivo = new File("Punto5y6/TorneoTenis.txt");
        if (!archivo.exists()) {
            archivo = new File("TorneoTenis.txt");
        }
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        File logFile = new File("Punto5y6/invalid_ages.log");
        BufferedWriter log = new BufferedWriter(new FileWriter(logFile));
        String linea=br.readLine();
        Torneo torneo= new Torneo(linea);
        System.out.println(torneo.getNombre());
        while((linea=br.readLine()) !=null ){
            String [] datos = linea.split(";");
            Equipo equipo=new Equipo(datos[0]);
            for(i=1;i<=4;i++){
                   cantJugadoresTot++;             
                   String [] jugador = datos[i].split(",");
                   String nombre=jugador[0].trim();
                   int ranking =Integer.parseInt(jugador[1].trim());
                   int edad= Integer.parseInt(jugador[2].trim());
                   Jugador j = new Jugador(nombre, ranking, edad);
                   try{
                       j.getEdad(); // valida edad; lanza EdadInvalida si corresponde
                   }catch(EdadInvalida e){
                       System.out.println("Equipo: "+equipo.getNombreEquipo()+" - Jugador descartado: "+nombre+" Edad: "+edad+" Motivo: "+e.getMessage());
                       j.setEdad(-1);
                       cantJugadoresInv++;
                       log.write("Equipo: "+equipo.getNombreEquipo()+" - Jugador descartado: "+nombre+" Edad: "+edad+" Motivo: "+e.getMessage());
                       log.newLine();
                   }catch(NumberFormatException | ArrayIndexOutOfBoundsException ex){
                   log.write("Linea con formato inválido: "+linea+" -> "+ex.getMessage());
                   log.newLine();
               }
               equipo.agregarJugador(j,i-1);
            }
            torneo.AgregarEquipos(equipo);
        }
       br.close();
       log.close();
       torneo.ListarEquipos();
       torneo.listarRanking();
       torneo.listarJugadoresRanking();
       System.out.println(cantJugadoresInv+" "+cantJugadoresTot);
       System.out.println("Porcentaje de jugadores invalidados="+(double)100*cantJugadoresInv/cantJugadoresTot+"%");
    }

}
