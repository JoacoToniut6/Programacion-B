public class Punto12 {
    public static void main(String args[]){
        Motor motor1=new Motor(200, "Electrico");
        Automovil auto1= new Automovil("ADF123", "Joaquin Toniut",motor1);
        Motor motor2=new Motor(450, "Naftero");
        Automovil auto2=new Automovil("FGY542", "Pedro Martinez", motor2);
        Motor motor3=new Motor(150, "Diesel");
        Automovil auto3=new Automovil("HBV871", "Roman Riquelme", motor3);
        Automovil[] autos =new Automovil[3];
        autos[0]=auto1;
        autos[1]=auto2;
        autos[2]=auto3;
        for (Automovil auto:autos){
            System.out.println(auto.Mensaje());
        }

    }

}
