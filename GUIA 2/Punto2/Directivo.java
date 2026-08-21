import java.util.ArrayList;
public class Directivo  extends Empleados{
 private String areaACargo;
private ArrayList<Empleados> empleadosACargo;
 public Directivo(String nombre, String fechaNacimiento, double sueldo, String areaACargo) {
    super(nombre, fechaNacimiento, sueldo);  
    this.areaACargo = areaACargo;
    this.empleadosACargo=new ArrayList<Empleados>();
 }
 public String getAreaACargo() {
    return areaACargo;
 }

 public void setAreaACargo(String areaACargo) {
    this.areaACargo = areaACargo;
 }
 public ArrayList<Empleados> getEmpleadosACargo() {
    return empleadosACargo;
}
 public void setEmpleadosACargo(ArrayList<Empleados> empleadosACargo) {
    this.empleadosACargo = empleadosACargo;
 }

 public void agregarEmpleado(Empleados empleado){
    empleadosACargo.add(empleado);
 }

 @Override
 public String toString(){
    String listaEmpleados="";
    for(Empleados empleado:empleadosACargo){
        if(!listaEmpleados.isEmpty()){
            listaEmpleados+=", ";
        }
        listaEmpleados+=empleado.getNombre();
    }
    return super.toString()+" Area: "+areaACargo+"   DIRECTIVO   Empleados a cargo: "+listaEmpleados;
 }
 
}
