public class Empleados extends Persona {
    double sueldo;
    public Empleados(String nombre, String fechaNacimiento, double sueldo){
        super(nombre,fechaNacimiento);
        this.sueldo=sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
   @Override
   public String toString(){
    return super.toString()+" Sueldo:"+sueldo;
   }
}
