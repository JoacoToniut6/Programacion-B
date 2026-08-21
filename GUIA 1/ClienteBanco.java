public class ClienteBanco {
 private String nombre;
 private String PIN;
 private double saldo;

 public ClienteBanco(String nombre,String PIN, double saldo){
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
 public String getPIN() {
    return PIN;
 }
 public void setPIN(String PIN) {
    this.PIN=PIN;
 }
 public double getSaldo() {
    return saldo;
 }
 public void setSaldo(double saldo) {
    this.saldo = saldo;
 }

 public void Depositar(double amount){
    if (amount>0)
    saldo+=amount;
    else
       saldo+=amount*-1; 
 }
 public void MostrarEstado(){
    System.out.println("Saldo actualizado:"+saldo);
 }
 public void Retirar(double amount){
    if (saldo>=amount)
    {
      if (amount>0)
        saldo-=amount;
       else
        saldo-=amount*-1;
    }
    else
        System.out.println("Se intento retirar un monto mayor al que hay en la cuenta");
 } 
}
