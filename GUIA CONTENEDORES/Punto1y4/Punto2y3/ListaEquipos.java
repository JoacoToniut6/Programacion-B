import java.util.Iterator;
import java.util.TreeSet;
public class ListaEquipos implements Iterable<Equipo>{
    private TreeSet<Equipo> equipos;

    public ListaEquipos(){
        equipos= new TreeSet<>();
    }
    public void agregar(Equipo e){
        equipos.add(e);
    }
    public TreeSet<Equipo> getEquipos(){
        return equipos;
    }
    @Override
    public Iterator<Equipo> iterator() {
        return equipos.iterator();
    }
    

}
