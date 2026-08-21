import java.util.Scanner;
public class Punto10 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Ingresar pin:");
      String num=sc.nextLine();
      ClienteBanco cliente= new ClienteBanco("Joaquin","193636",15000);
      if (num.equals(cliente.getPIN()))
      {
        System.out.println("Nombre del cliente:"+cliente.getNombre()+" ");
        System.out.print("Ingresar opcion a realizar 1-Depositar 2-Retirar:");
        int opcion=sc.nextInt();
        while(opcion==1 || opcion==2){
          if (opcion==1)
            cliente.Depositar(-5000);
          else
            if (opcion==2)
                cliente.Retirar(2000);  
        System.out.print("Ingresar opcion a realizar 1-Depositar 2-Retirar:");
        opcion=sc.nextInt();
        }


        cliente.MostrarEstado();
      }
      else
        System.out.println("PIN INVALIDO");


    sc.close();
    
    }

}
