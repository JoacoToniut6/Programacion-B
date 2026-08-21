import java.util.Scanner;
public class Punto2 {

    public static void main(String args[]){
     Scanner sc1= new Scanner(System.in);
     Scanner sc2=new Scanner(System.in);
     System.out.print("Ingresar primera cadena:");
     String cad1=sc1.nextLine();
     System.out.print("Ingresar segunda cadena:"); 
     String cad2=sc2.nextLine();  
     if (Esigual(cad1,cad2)==1)
        System.out.println("Son iguales");
      else
        System.out.println("Son diferentes");
    sc1.close();
    sc2.close();
    }


    private static  int Esigual(String cad1, String cad2){
    if (cad1.equals(cad2)==true)
        return 1;
    else
        return 0;

    } 
    //Main pertenece a la clase, no al objeto.   Un metodo no estatico pertenece a un objeto.

}
