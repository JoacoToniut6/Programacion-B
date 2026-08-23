package Punto5y6;

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
            if(j==null) continue;
            suma += j.getRanking();
        }
         return suma; 
     }
     public double getEdadPromedio(){
       int suma=0;
       int count=0;
        for(Jugador j:jugadores){
            if(j==null) continue;
            try{
                suma += j.getEdad();
                count++;
            }catch(Exception e){
                System.out.println(e.getMessage());
                // skip invalid ages
            }
        }
        return count==0?0.0:(double)suma/count;
     }
    public Jugador[] getJugadores() {
     return jugadores;
    }

     @Override
     public String toString() {
       String cad="Equipo: "+nombreEquipo+"\n";
       for(Jugador j:jugadores){
                if(j==null) continue;
                cad += j + "\n";
       }
       return cad;
     }
     

}
