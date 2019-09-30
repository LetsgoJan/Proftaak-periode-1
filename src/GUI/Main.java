package GUI;

import BusinessLogic.ShapeManager;
import BusinessLogic.ShapesType;
import model.Ishape;
import model.bol;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        viewControl window = new viewControl();
        window.setVisible(true);

/*
test:
        ShapeManager shapeLijst = new ShapeManager();
        ShapesType shapeVorm = new ShapesType();

        Ishape eenBol = shapeVorm.getShape("BOL", 0, 0, 0, 5 );// make a shape
        System.out.print(eenBol.shapeInhoud()+"\n"); // print de inhoud
        shapeLijst.addShape(eenBol); // add to de lijst
        shapeLijst.addShape(eenBol); // add to de lijst
        shapeLijst.addShape(eenBol); // add to de lijst
        System.out.print(shapeLijst.getShapes()); // print de hele lijst
 */

    }

}
