public class Delfin extends Animal implements NADADOR {
    public Delfin(String especie, String grupo){
        super(especie,grupo);
    }
    @Override
    public void Nadar(){
        System.out.println(super.getEspecie()+", Delfin nadando");
    }

}
