import java.util.Scanner;
public class Punto9 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Ingrese un numero para calcular su raiz cuadrada:");
    double num=sc.nextDouble();
    if (num<0)
        System.out.println("No se puede calcular raiz cuadrada de un numero negativo");
    else
    {
        int raiz=(int)Math.sqrt(num);
        if (Math.sqrt(num)>=raiz+0.5)
         System.out.println("Raiz cuadrada:"+(raiz+1));
        else
           System.out.println("Raiz cuadrada:"+raiz); 
    }
    sc.close();
    }

}
