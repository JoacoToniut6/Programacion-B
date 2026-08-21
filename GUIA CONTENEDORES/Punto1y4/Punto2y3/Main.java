import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        int i;
        BufferedReader br= new BufferedReader(new FileReader("TorneoTenis.txt"));
        String linea=br.readLine();
        Torneo torneo= new Torneo(linea);
        System.out.println(torneo.getNombre());
        while((linea=br.readLine()) !=null ){
            String [] datos = linea.split(";");
            Equipo equipo=new Equipo(datos[0]);
            for(i=1;i<=4;i++){
               String [] jugador = datos[i].split(",");
               String nombre=jugador[0].trim();
               int ranking =Integer.parseInt(jugador[1].trim());
               int edad= Integer.parseInt(jugador[2].trim());                 
               equipo.agregarJugador(new Jugador(nombre,ranking,edad));
            }
            torneo.AgregarEquipo(equipo);
        }
       br.close();
       torneo.ListarEquipos();
       torneo.listarRanking();
       torneo.listarJugadoresRanking();

    }

}
