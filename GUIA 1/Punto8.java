import java.util.Scanner;
public class Punto8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingresar un numero del 1 al 7 segun el dia de la semana que quieras ver:");
        int dia=sc.nextInt();;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
               break;
            case 3:
                System.out.println("Miercoles");
               break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
        }
        sc.close();
        // si sacamos el break, el programa ejecuta todas las sentencias una vez entres al primer case, si ingresas 5, va a imprimir,viernes,sabado,domingo y dia no valido
    }

}
