public class Punto11 {
    public static void main(String args[]){
        Hora hora3= new Hora();
        Hora hora2=new Hora(12, 40, 21);
        Hora hora= new Hora(15, 22, 40);
        hora2.MuestraHora();
        System.out.println(" ");
        hora3.SumaHora(hora, hora2);
        hora3.MuestraHora();
    }

}
