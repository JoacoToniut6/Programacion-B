package Punto1y4;
public class PracticaExcepciones {
   private double resultado;
    public static double dividir(int dividendo,int divisor) throws DivisioPorCero{
        if (divisor == 0)
             throw new DivisioPorCero();
        return (double) dividendo/divisor;
    }
    public double getResultado(){
        return resultado;
    } 
    public static void main(String args[]){
        try{          
            System.out.println("Division entre 10 y 2="+ dividir(10,2));          
            System.out.println("Division entre 10 y 0="+ dividir(10,0));  
        }
        catch(DivisioPorCero e){
            System.out.println(e.getMessage());
        }
         
    }

}
