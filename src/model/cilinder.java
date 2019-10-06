package model;

public class cilinder implements Ishape{
    private double straal;
    private double hoogte;

    public cilinder(double straal, double hoogte) {
        this.straal = straal;
        this.hoogte = hoogte;
    }

    @Override
    public double shapeInhoud() {
        return 3;
    }

    @Override
    public double getStraal() {
        return this.straal;
    }

    @Override
    public double getHoogte() {
        return this.hoogte;
    }

    @Override
    public double getBreedte() {
        return 0;
    }

    @Override
    public double getLengte() {
        return 0;
    }

    @Override
    public void setBreedte(double breedte) {

    }

    @Override
    public void setLengte(double lengte) {

    }

    @Override
    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    @Override
    public void setStraal(double straal) {
        this.straal = straal;

    }


}
