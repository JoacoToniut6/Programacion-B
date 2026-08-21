public  class Atleta {
    private String nombre;
    private String Categoria;
    public Atleta(String nombre,String Categoria){
       this.Categoria=Categoria;
       this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return Categoria;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCategoria(String Categoria){
        this.Categoria=Categoria;
    }
    public  void Correr(){
        System.out.println("El atleta "+nombre+" esta corriendo");
    }
    public void cargarDatos(String nombre,String Categoria){
       this.Categoria=Categoria;
       this.nombre=nombre;
    }
    public void VerDatos(){
        System.out.println("Nombre:"+nombre+" Categoria:"+Categoria);
    }
}
