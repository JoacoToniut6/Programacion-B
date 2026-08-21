public class Automovil {
 private String patente;
 private String dueño;
 private Motor motor;
 
public Automovil(String patente, String dueño, Motor motor) {
    this.patente = patente;
    this.dueño = dueño;
    this.motor = motor;
}

public String getPatente() {
    return patente;
}

 public void setPatente(String patente) {
    this.patente = patente;
 }

 public String getDueño() {
    return dueño;
 }

 public void setDueño(String dueño) {
    this.dueño = dueño;
 }

 public Motor getMotor() {
    return motor;
 }

 public void setMotor(Motor motor) {
    this.motor = motor;
 }

 public String Mensaje(){
   return "Patente:"+patente+" Dueño:"+dueño+" Cilindrado:"+motor.getCilindrada()+" Tipo:"+motor.getTipo();
 }

}
