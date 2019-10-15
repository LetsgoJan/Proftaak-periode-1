package GUI;

import BusinessLogic.ShapeManager;
import DbManager.ShapeDbManager;
import model.blok;
import model.bol;
import model.cilinder;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        ShapeManager shapemanager = new ShapeManager();
        /*
        test
        */
        shapemanager.addShape(new bol(5.0 ));
        shapemanager.addShape(new blok(20, 10, 12));
        shapemanager.addShape(new cilinder(10, 5));
        System.out.println(shapemanager.getshape()); // print de hele lijst


        SwingUtilities.invokeLater(new MainFrame());

        new ShapeDbManager();


    }

}
