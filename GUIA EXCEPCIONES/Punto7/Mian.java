package Punto7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mian {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese el primer numero:");
            double num1=sc.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            double num2=sc.nextDouble();
           
            Calculadora calculadora= new Calculadora();
            System.out.println("Suma="+calculadora.sumar(num1, num2));
            System.out.println("Resta="+calculadora.restar(num1, num2));
            System.out.println("Multiplicacion="+calculadora.Multiplicacion(num1, num2));
            System.out.println("Division="+calculadora.Dividir(num1, num2));
        }catch(InputMismatchException  e){
            System.err.println("Error: Ingreso de caracteres no numéricos.");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
