package GUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        MainPanel window = new MainPanel();
        window.setVisible(true);

/*
test object:
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
