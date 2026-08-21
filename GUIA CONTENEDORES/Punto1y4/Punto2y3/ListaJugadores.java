import java.util.ArrayList;
import java.util.Iterator;
public class ListaJugadores implements Iterable<Jugador> {
   private ArrayList<Jugador> jugadores;

   public ListaJugadores(){
    jugadores= new ArrayList<>();
   }

   public void AgregaJugador(Jugador j){
    jugadores.add(j);
   }

   public ArrayList<Jugador> getJugadores(){
    return jugadores;
   }
    @Override
    public Iterator<Jugador> iterator() {
        return jugadores.iterator();
    }

}
