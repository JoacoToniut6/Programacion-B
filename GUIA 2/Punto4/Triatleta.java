 public class Triatleta extends Atleta implements NADADOR,CICLISTA {

    public Triatleta(String nombre, String Categoria) {
        super(nombre, Categoria);
    }
    @Override
    public void Andar(){
        System.out.println("El triatleta "+super.getNombre()+" esta andando en bicicleta");
    }
    @Override
    public void Nadar(){
        System.out.println(super.getNombre()+", triatleta nadando");
    }

}
