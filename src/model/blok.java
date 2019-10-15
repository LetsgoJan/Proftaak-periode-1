package model;

import java.io.Serializable;

public class blok implements Ishape, Serializable {

    private double breedte;
    private double lengte;
    private double hoogte;

    public blok(double breedte, double lengte, double hoogte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.hoogte = hoogte;
    }

    @Override
    public double shapeInhoud() {
        return 1;
    }

    @Override
    public double getStraal() {
        return 0;
    }

    @Override
    public double getHoogte() {
        return this.hoogte;
    }

    @Override
    public double getBreedte() {
        return this.breedte;
    }

    @Override
    public double getLengte() {
        return this.lengte;
    }

    @Override
    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    @Override
    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    @Override
    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    @Override
    public void setStraal(double straal) {

    }

}
