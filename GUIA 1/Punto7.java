public class Punto7 {
    public static void main(String args[]){
      GetProperty();

    }
    private static void GetProperty(){
        System.out.println("El sistema operativo es:"+System.getProperty("os.name"));
        System.out.println("Java version:"+System.getProperty("java.version"));
        System.out.println("Version sistema:"+System.getProperty("os.version"));
    }

}
