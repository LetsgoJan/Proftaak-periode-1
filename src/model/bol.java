package model;

import java.io.Serializable;

public class bol implements Ishape, Serializable {
    private double straal;

    public bol(double straal) {
        this.straal = straal;
    }

    @Override
    public double shapeInhoud() {
        System.out.println("inside");//test
        return 2;
    }

    @Override
    public double getStraal() {
        return this.straal;
    }

    @Override
    public double getHoogte() {
        return 0;
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

    }

    @Override
    public void setStraal(double straal) {
        this.straal = straal;
    }


}
