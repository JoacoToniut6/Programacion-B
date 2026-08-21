public class Circulo extends Elipse{
    public Circulo(double radio) {
        super(radio,radio);
    }
    public double getRadio(double radio){
        radio=SMA=SME;
        return SMA;
    }
    @Override
    public double getPerimetro() {
        return 2*3.14*getRadio(SMA);
    }

    @Override
    public double getArea() {
        return 3.14*getRadio(SMA)*getRadio(SMA);
    }

    @Override
    public String getInfoAtributo() {
        return "Radio:"+getRadio(SMA);
    }

    @Override
    public String getTipoFigura() {
        return "Circulo";
    }
}
