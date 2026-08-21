public class Jugador {
    private String nombre;
    private int ranking;
    private int edad;
    private Equipo equipo;
    public Jugador(String nombre, int ranking, int edad) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.edad = edad;
    }
     public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
public String toString() {
    return "Jugador: " + nombre + " Ranking: " + ranking +" Edad: " + edad;
}
    
}
