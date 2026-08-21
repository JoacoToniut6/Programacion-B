package Punto7;

public class Calculadora {
    public double sumar(double a, double b){
        return a+b;
    }
    public double restar(double a,  double b){
        return a-b;
    }

    public double Multiplicacion(double a,double b){
        return a*b;
    }

    public double Dividir(double a,double b){
        if(b==0)
            throw new ArithmeticException("Division por cero no permitida");
        return a/b;
    }
      

}
