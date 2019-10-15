package model;

public interface Ishape {
    double shapeInhoud();

    double getStraal();
    double getHoogte();
    double getBreedte();
    double getLengte();

    void setBreedte(double breedte);
    void setLengte(double lengte);
    void setHoogte(double hoogte);
    void setStraal(double straal);
}
