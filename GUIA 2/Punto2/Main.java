import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
      Empresa empresa=new Empresa();
      Cliente cliente1=new Cliente("Carlos","14/01/1990","996991992",900.0);
      Cliente cliente2=new Cliente("Juan","22/12/1995","225447411",0.0);

      Empleados empleado1 = new Empleados("Fernando", "12/11/1986", 11111.0);
      Empleados empleado2 = new Empleados("Andrea","12/11/1955", 22222.0);
      Empleados empleado3 = new Empleados("Mario", ":01/11/1986",44444.0);

      empresa.agregar(cliente1);
      empresa.agregar(cliente2);

      empresa.agregar(empleado1);
      empresa.agregar(empleado2);
      empresa.agregar(empleado3);

      Directivo directivo1 = new Directivo("Macherano", "30/08/1960",  33333.0 , "Desarrollo");
	  Directivo directivo2 = new Directivo("Clara", "12/12/197", 55555.0, "Gerencia");

      directivo1.agregarEmpleado(empleado1);
      directivo1.agregarEmpleado(empleado2);
      directivo2.agregarEmpleado(empleado3);

      ArrayList<Persona> listaPersonas=new ArrayList<>();
      listaPersonas.add(cliente1);
      listaPersonas.add(cliente2);
      listaPersonas.add(empleado1);
      listaPersonas.add(empleado2);
      listaPersonas.add(empleado3);
      listaPersonas.add(directivo1);
      listaPersonas.add(directivo2);
	   
   // Mostrar información dividida por tipo
      System.out.println("CLIENTES");
      for (Persona persona :  listaPersonas) {
          if (persona instanceof Cliente) {
              System.out.println(persona.toString());
          }
      }

      System.out.println("\nEMPLEADOS");
      for (Persona persona : listaPersonas) {
          if (persona instanceof Empleados || (persona instanceof Directivo)) {
              System.out.println(persona.toString());
          }
      } 

    }
}
