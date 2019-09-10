package com.company;

import model.Ishape;
import model.Shapes;

public class Main {

    public void main(String[] args) {
	// write your code here
        Shapes shapemaker = new Shapes();
        Ishape bol1 = shapemaker.getShape("bol");

        bol1.setStraal(2.0);
        double inhoud = bol1.getBlokInhoud();
        System.out.println(inhoud);
    }
}
