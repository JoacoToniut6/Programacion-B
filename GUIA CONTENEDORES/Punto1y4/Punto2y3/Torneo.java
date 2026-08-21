import java.util.ArrayList;
import java.util.Comparator;

public class Torneo {
    private String NombreTorneo;
    private ListaEquipos equipos;
     public Torneo(String nombreTorneo){
        this.NombreTorneo=nombreTorneo;
        equipos= new ListaEquipos();
     }
     public String getNombre(){
        return NombreTorneo;
     }
     public void setNombre(String nombreTorneo){
        this.NombreTorneo=nombreTorneo;
     }
   public void AgregarEquipo(Equipo e){
    equipos.agregar(e);
   }
   public void ListarEquipos( ){
    for(Equipo e:equipos){
        System.out.println(e.toString());
    }
   }

 public void listarRanking() {
       equipos.getEquipos().sort(Comparator.comparingInt(Equipo::getRankingEquipo));

    for (Equipo e : equipos.getEquipos()) {
        System.out.println("Equipo: " + e.getNombreEquipo());
        System.out.println("Ranking: " + e.getRankingEquipo());
        System.out.println("Edad promedio: " + e.getEdadPromedio());
        System.out.println();
    }
    }
    public void listarJugadoresRanking() {
    ArrayList<Jugador> lista = new ArrayList<>();

    for (Equipo e : equipos.getEquipos()) {
        for (Jugador j : e.getJugadores()) {
            lista.add(j);
        }
    }

    lista.sort(Comparator.comparingInt(Jugador::getRanking));
    

    for (Jugador j : lista) {
        System.out.println(
            j.getNombre() + " (" +
            j.getRanking() + "º) - " +
            j.getEquipo().getNombreEquipo()
        );
    }
}

}
