public class Main {
    public static void main(String[] args){
     Atleta atleta1=new Atleta("Sergio", "Mayor");
     Atleta atleta2=new Atleta("Pedro", "Juvenil");
     Atleta atleta3=new Atleta("Julian", "Profesional");
     Atleta atleta4=new Atleta("Enzo", "Niño");
     
     Atleta  atletas[]=new Atleta[4]; 
         
     atletas[0]=atleta1;
     atletas[1]=atleta2;
     atletas[2]=atleta3;
     atletas[3]=atleta4;
     for(Atleta atl:atletas){
        atl.VerDatos();
     }
     NADADOR [] nadadores=new NADADOR[4];
     nadadores[0]=new Triatleta("Alberto","Mayor");
     nadadores[1]=new Delfin("Skeepy","Mamifero");
     nadadores[2]=new Triatleta("Juan","Juvenil");
     nadadores[3]=new Delfin("Flipper","Mamifero");
     for( NADADOR nada:nadadores){
        nada.Nadar();
     }

    }
}
