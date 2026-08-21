public class Automovil2 {
private String patente;
 private String dueño;
 private Motor motor;
 private int kilometraje;
 
public Automovil2(String patente, String dueño, Motor motor) {
    this.patente = patente;
    this.dueño = dueño;
    this.motor = motor;
    this.kilometraje = kilometraje;
}

public String getPatente() {
    return patente;
}

 public void setPatente(String patente) {
    this.patente = patente;
 }

 public int getKilometraje() {
   return kilometraje;
}

 public void setKilometraje(int kilometraje) {
   this.kilometraje = kilometraje;
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

}
