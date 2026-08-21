//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figura rectangulo=new Rectangulo(2,3);
        Figura Elipse=new Elipse(3,7);
        Figura cuadrado=new Cuadrado(3.5);
        Figura circulo=new Circulo(2);
        Figura cuadrado2=new Cuadrado(6);
        Figura[] figuras={rectangulo,Elipse,cuadrado,circulo,cuadrado2};
        for (Figura f:figuras){
            System.out.println("Tipo figura:"+f.getTipoFigura());
            System.out.println("Atributos:"+f.getInfoAtributo());
            System.out.println("Area:"+f.getArea());
            System.out.println("Perimetro:"+f.getPerimetro());
        }


    }
}