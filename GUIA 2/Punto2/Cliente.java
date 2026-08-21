public class Cliente extends Persona {
    private String telefono;
    private double deuda;
    public Cliente(String nombre, String fechaNacimiento, String telefono, double deuda) {
        super(nombre, fechaNacimiento);
        this.telefono = telefono;
        this.deuda = deuda;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public double getDeuda() {
        return deuda;
    }
    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    public String toString(){
        return super.toString() + " Telefono:"+telefono+" Deuda:"+deuda;
    }

}
