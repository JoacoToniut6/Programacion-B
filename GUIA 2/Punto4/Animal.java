public class Animal {
    private String especie;
    private String grupo;
    public Animal(String especie, String grupo) {
        this.especie = especie;
        this.grupo = grupo;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public void cargar(String especie, String grupo){
        this.especie = especie;
        this.grupo = grupo;
    }
    public void Ver(){
        System.out.println("El animal de especie "+especie+" es del grupo "+grupo);
    }

}
