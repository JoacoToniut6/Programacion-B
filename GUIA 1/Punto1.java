import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Punto1 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Ingresar nombre:");
    String nombre=sc.nextLine();
    while (nombre.isEmpty()){
        System.out.print("Ingresa tu nombre:"); 
         nombre=sc.nextLine();

     }
     System.out.println("Hola "+nombre);
     LocalDateTime ahora= LocalDateTime.now();
     System.out.println(ahora);
     DateTimeFormatter formatter= DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy HH:mm");
     String FechaActual=ahora.format(formatter);
     System.out.println(FechaActual);
     sc.close();
    }

}
