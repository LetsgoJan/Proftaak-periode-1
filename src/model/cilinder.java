package model;

public class cilinder implements Ishape{
    private double straal;
    private double hoogte;

    public cilinder(double straal, double hoogte) {
        this.straal = straal;
        this.hoogte = hoogte;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    @Override
    public double shapeInhoud() {
        return 3;
    }
}
