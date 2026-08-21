public class Equipo implements Comparable<Equipo> {
    private String nombreEquipo;   
     private ListaJugadores jugadores;
     public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        jugadores= new ListaJugadores();
    }

     public String getNombreEquipo() {
         return nombreEquipo;
     }

     public void setNombreEquipo(String nombreEquipo) {
         this.nombreEquipo = nombreEquipo;
     }

     public void agregarJugador(Jugador j){
       jugadores.AgregaJugador(j);
       j.setEquipo(this);
     }
     
     public int getRankingEquipo(){
        int suma=0;
        for(Jugador j:jugadores.getJugadores()){
            suma += j.getRanking();
        }
         return suma; 
     }
     public double getEdadPromedio(){
       int suma=0;
        for(Jugador j:jugadores.getJugadores()){
            suma += j.getEdad();
        }
        return (double)suma/jugadores.getJugadores().size();
     }
    public ListaJugadores getJugadores() {
     return jugadores;
    }

     @Override
     public String toString() {
       String cad="Equipo: "+nombreEquipo+"\n";
       for(Jugador j:jugadores.getJugadores()){
        cad += j + "\n";
       }
       return cad;
     }
     public int compareTo(Equipo otro) {
        return this.nombreEquipo.compareTo(otro.nombreEquipo);
    }

}
