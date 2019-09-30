package model;

public class bol implements Ishape {
    private double straal;

    public bol(double straal) {
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }


    @Override
    public double shapeInhoud() {
        System.out.println("inside");//test
        return 2;
    }
}
