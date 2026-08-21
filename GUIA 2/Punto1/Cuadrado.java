public class Cuadrado extends Rectangulo{
    public Cuadrado(double lado) {
        super(lado,lado);
    }
    public double getLado(double lado){
        lado=base=alt;
        return lado;
    }
    @Override
    public double getArea() {
        return getLado(base)*getLado(base);
    }

    @Override
    public double getPerimetro() {
        return 4*getLado(base);
    }

    @Override
    public String getInfoAtributo() {
        return "Lado:"+base;
    }

    @Override
    public String getTipoFigura() {
        return "Cuadrado";
    }


}
