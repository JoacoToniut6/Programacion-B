public class Elipse extends Figura {
    double SMA;
    double SME;

    public Elipse(double SME, double SMA) {
        this.SME = SME;
        this.SMA = SMA;
    }
     public double getSMA(){
        return SMA;
    }

    public double getSME(){
        return SME;
    }

    @Override
    public double getArea() {
        return 3.14*SMA*SME;
    }

    @Override
    public double getPerimetro() {
        return 3.14*(3*(SMA+SME)-Math.sqrt((3*SMA+SME)*(SMA+3*SME)));
    }

    @Override
    public String getTipoFigura() {
        return "Elipse";
    }

    @Override
    public String getInfoAtributo() {
        return "Semieje Mayor:"+SMA+" Semieje Menor:"+SME;
    }
}
