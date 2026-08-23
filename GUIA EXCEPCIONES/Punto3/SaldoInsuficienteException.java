package Punto2y3;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super("No hay saldo suficiente");
    }

}
