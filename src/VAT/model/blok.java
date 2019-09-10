package VAT.model;

public class blok implements Ishape {

    private double breedte;
    private double lengte;
    private double hoogte;

    private blok(double breedte, double lengte, double hoogte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.hoogte = hoogte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    @Override
    public double getBlokInhoud() {
        double inhoud = this.breedte * this.lengte * this.hoogte;
        return inhoud;
    }
}
