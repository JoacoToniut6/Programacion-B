
public class Equipo {
     private String nombreEquipo;   
     private Jugador[] jugadores;
     public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        jugadores= new Jugador[4];
    }

     public String getNombreEquipo() {
         return nombreEquipo;
     }

     public void setNombreEquipo(String nombreEquipo) {
         this.nombreEquipo = nombreEquipo;
     }

     public void agregarJugador(Jugador j, int pos){
        jugadores[pos]=j;
        j.setEquipo(this);
     }
     
     public int getRankingEquipo(){
        int suma=0;
        for(Jugador j:jugadores){
            suma += j.getRanking();
        }
         return suma; 
     }
     public double getEdadPromedio(){
       int suma=0;
        for(Jugador j:jugadores){
            suma += j.getEdad();
        }
        return (double)suma/jugadores.length;
     }
    public Jugador[] getJugadores() {
     return jugadores;
    }

     @Override
     public String toString() {
       String cad="Equipo: "+nombreEquipo+"\n";
       for(Jugador j:jugadores){
        cad += j + "\n";
       }
       return cad;
     }
     

}
