public class Rectangulo extends Figura{
    double base;
    double alt;
    public Rectangulo(double base, double alt) {
        this.base = base;
        this.alt = alt;
    }

    public double getAlt() {
        return alt;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return base*alt;
    }

    @Override
    public double getPerimetro() {
        return 2*base + 2*alt;
    }

    @Override
    public String getInfoAtributo() {
        return "Base:"+base+" Altura:"+alt;
    }

    @Override
    public String getTipoFigura() {
        return "Rectangulo";
    }

}
