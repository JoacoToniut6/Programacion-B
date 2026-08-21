
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas=0;
        this.minutos=0;
        this.segundos=0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {          
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void MuestraHora(){
        System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);       
    }
    public void SumaHora(Hora hora, Hora hora2){
       horas=hora.horas+hora2.horas;
       minutos=hora.minutos + hora2.minutos;
       segundos=hora.segundos+hora2.segundos;
       if (segundos>=60)
       {
        minutos+=1;
        segundos-=60;
       }
       if (minutos>=60)
       {
        horas+=1;
        minutos-=60;
       }
       if (horas>=24)
        horas-=24;
    }

}
