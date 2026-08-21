import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main  {
    public static void main(String[] args) throws Exception {
      Motor motor1 = new Motor(2000,TipoMotor.Nafta);
      Motor motor2 = new Motor(1500, TipoMotor.Diesel);
      Motor motor3 = new Motor(2500, TipoMotor.Electrico);

        Automovil2 auto1 = new Automovil2("MGA123", "juan", motor1); //inciso A
        Automovil2 auto2 = new Automovil2("MGA456", "Maria", motor2);
        Automovil2 auto3 = new Automovil2("BLT123", "juan", motor3);
        Automovil2 auto4 = new Automovil2("CDA132", "juan", motor1);
        Automovil2 auto5 = new Automovil2("MLT123", "Dario", motor2);
        Automovil2 auto6 = new Automovil2("TJW123", "Dario", motor3);
        Automovil2 auto7 = new Automovil2("UTL789", "Alfredo", motor1);
        Automovil2 auto8 = new Automovil2("MFT123", "Lucas", motor2);
        Automovil2 auto9 = new Automovil2("LPW789", "Mario", motor3);
        Automovil2 auto10 = new Automovil2("ABC123", "Maria", motor2);

        ArrayList<Automovil2> ListaAutomovil= new ArrayList<>();
        ListaAutomovil.add(auto1);
        ListaAutomovil.add(auto2);
        ListaAutomovil.add(auto3);
        ListaAutomovil.add(auto4);
        ListaAutomovil.add(auto5);
        ListaAutomovil.add(auto6);
        ListaAutomovil.add(auto7);
        ListaAutomovil.add(auto8);
        ListaAutomovil.add(auto9);
        ListaAutomovil.add(auto10); //Inciso B
        for(Automovil2 auto:ListaAutomovil){
            System.out.println("Patente:"+auto.getPatente()+" Dueño:"+auto.getDueño());
        }

        Scanner scanner2= new Scanner(System.in);
        System.out.print("Ingrese ordenamiento:");
        String ordenamiento = scanner2.nextLine(); //incisoD

        if (ordenamiento.equalsIgnoreCase("patente")){ // se fija que el ordenamiento sea por patente
           Collections.sort(ListaAutomovil,new Comparator<Automovil2>(){ // comprara la lista
            public int compare(Automovil2 auto1,Automovil2 auto2){
                return auto1.getPatente().compareTo(auto2.getPatente());
            }
           });
           for(Automovil2 automovil:ListaAutomovil){ // muestra lista ordenada
            System.out.println("Patente: " + automovil.getPatente() + ", Dueño: " + automovil.getDueño());
           }
        }
        else
            if(ordenamiento.equalsIgnoreCase("duenio")){ //ordenamiento por dueño
                Collections.sort(ListaAutomovil,new Comparator<Automovil2>(){
                    public int compare(Automovil2 auto1,Automovil2 auto2){
                        return auto1.getDueño().compareToIgnoreCase(auto2.getDueño());
                    }
                });
                for(Automovil2 automovil:ListaAutomovil){ // muestra lista ordenada
                  System.out.println("Dueño: " + automovil.getDueño()+", Patente: " + automovil.getPatente());
           }
         }
         else
            System.out.println("Ordenamiento invalido");
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingresar patente a evaluar:");
        String pat=scanner.nextLine();

        HashMap<String, Automovil2> mapaAutomoviles = new HashMap<>();
        for (Automovil2 auto:ListaAutomovil){
            mapaAutomoviles.put(auto.getPatente(),auto);
        }
        Automovil2 automovilEncontrado=mapaAutomoviles.get(pat);
        if(automovilEncontrado != null){
            System.out.println("Automovil encontrado");
            System.out.println("Patente: " + automovilEncontrado.getPatente() + ", Dueño: " + automovilEncontrado.getDueño());
        }
        else
            System.out.println("No se encontro ningun auto con patente "+pat);
   

        System.out.println("TIENEN DIESEL:"); //inciso E
        for(Automovil2 auto:ListaAutomovil){
            if(auto.getMotor().getTipo().equals(TipoMotor.Diesel))
                System.out.println("Patente: " + auto.getPatente() + ", Dueño: " + auto.getDueño());
        }
        Iterator<Automovil2> iterador= ListaAutomovil.iterator(); //inciso F
        while(iterador.hasNext()){
            Automovil2 auto= iterador.next();
            if(auto.getPatente().startsWith("M"))
                iterador.remove();
        }
        for(Automovil2 autos:ListaAutomovil){
            System.out.println("Dueño:"+autos.getDueño()+" Patente:"+autos.getPatente()+" Cilindrada del motor:"+autos.getMotor().getCilindrada()+" Tipo motor:"+autos.getMotor().getTipo());
        }

        Map<String,Automovil2> mapaAutos=new HashMap<>();
        for(Automovil2 auto:ListaAutomovil){
            mapaAutos.put(auto.getPatente(), auto);
        }
        String patAct="ABC123";
        int kilomNuevo=35000;

        if(mapaAutos.containsKey(patAct)){
          Automovil2 autoact= mapaAutos.get(patAct);
          autoact.setKilometraje(kilomNuevo);
        }
        else
        {
          Automovil2 autonuevo= new Automovil2(patAct,"Sin dueño",new Motor(0, TipoMotor.Desconocido));
          autonuevo.setKilometraje(kilomNuevo);
          mapaAutos.put(patAct, autonuevo);
        }
        for(Automovil2 auto:mapaAutos.values()){
         System.out.println("Patente: " + auto.getPatente() + ", Dueño: " + auto.getDueño() + ", Kilometraje: " + auto.getKilometraje());
        }

    }
}
