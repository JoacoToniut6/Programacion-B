public class Punto5 {
    public static void main(String args[]){
       int a=2;
       int b=5;
       System.out.println(Devuelve(a, b));
    }
    private  static String Devuelve(int a, int b){
        int suma=a+b;
        int resta=a-b;
        int multi=a*b;
        return "Suma:"+suma+" Resta:"+resta+" Multiplicacion:"+multi;
    } 

}
