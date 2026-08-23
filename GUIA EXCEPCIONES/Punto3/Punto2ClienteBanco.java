package Punto2y3;
public class Punto2ClienteBanco {
private String nombre;
 private String PIN;
 private double saldo;

 public Punto2ClienteBanco(String nombre,String PIN, double saldo){
    this.setNombre(nombre);
    this.setPIN(PIN);
    this.setSaldo(saldo);
 }

 public String getNombre() {
    return nombre;
 }

 public void setNombre(String nombre) {
   this.nombre = nombre;
}

 public void setPIN(String pIN) {
   PIN = pIN;
 }

 public void setSaldo(double saldo) {
   this.saldo = saldo;
 }

 public double getSaldo() {
    return saldo;
 }
 public void verificarPin(String pin) throws PinIncorrectoException{
   if(!PIN.equals(pin)){
      throw new PinIncorrectoException();
   }
 }

 public void Depositar(double amount) throws MontoInvalidoException{
    if (amount<=0){
      throw new MontoInvalidoException("El monto a depositar deber ser positivo");
    }
    saldo+=amount;
 }

 public void Retirar(double amount) throws SaldoInsuficienteException,MontoInvalidoException{
    if(amount<=0){
      throw new MontoInvalidoException("El monto a retirar debe ser positivo");
    }
    if(amount>saldo){
      throw new SaldoInsuficienteException();
    }
      saldo-=amount;
 } 
 
}
