package Punto2y3;
import java.util.Scanner;
public class BancoIU {
  public static void main(String [] args){
    int opcion;
    Scanner sc= new Scanner(System.in);
    Punto2ClienteBanco cliente= new Punto2ClienteBanco("Joaquin", "193636", 15000);
    try{
      System.out.print("Ingresar PIN: ");
      String pin = sc.nextLine();
      cliente.verificarPin(pin);
      System.out.println("Bienvenido "+cliente.getNombre());
      System.out.print("1-Depositar 2-Retirar: ");
      opcion = sc.nextInt();
      while(opcion == 1 || opcion ==2){
        if(opcion == 1)
          cliente.Depositar(5000);
        else
          if(opcion == 2)
            cliente.Retirar(-2000);
        System.out.print("1-Depositar 2-Retirar: ");
        opcion = sc.nextInt();
      }
      System.out.println("Saldo actualizado:"+cliente.getSaldo());
    }catch(PinIncorrectoException e){
      System.out.println(e.getMessage());
    }catch(MontoInvalidoException e){
      System.out.println(e.getMessage());
    }catch(SaldoInsuficienteException e){
      System.out.println(e.getMessage());
    }
    sc.close();
}

}
