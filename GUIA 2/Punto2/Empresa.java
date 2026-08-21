import java.util.ArrayList;

public class Empresa {
 private ArrayList<Empleados> listaEmpleado;
 private ArrayList<Cliente> listaCliente;
 public Empresa() {
    this.listaCliente = new ArrayList<Cliente>();
    this.listaEmpleado = new ArrayList<Empleados>();
 }
 public void agregar(Empleados empleado){
   listaEmpleado.add(empleado);
 }
 public void agregar(Cliente cliente){
    listaCliente.add(cliente);
 }
 public void listarClientes(Cliente Cliente){
    for(Cliente cliente:listaCliente){
        System.out.println(cliente);
    }
 }
 public void listarEmpleados(Empleados Empleados){
    for(Empleados empleado:listaEmpleado){
        System.out.println(empleado);
    }
 }
 public ArrayList<Empleados> getListaEmpleado() {
    return listaEmpleado;
 }
 public void setListaEmpleado(ArrayList<Empleados> listaEmpleado) {
    this.listaEmpleado = listaEmpleado;
 }
 public ArrayList<Cliente> getListaCliente() {
    return listaCliente;
 }
 public void setListaCliente(ArrayList<Cliente> listaCliente) {
    this.listaCliente = listaCliente;
 }

}
