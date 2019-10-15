package GUI;

import BusinessLogic.ShapeManager;
import DbManager.ShapetoFile;
import model.Ishape;
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
        Ishape obj1 = new bol(5.0 );
        Ishape obj2 = new blok(20, 10, 12);
        Ishape obj3 = new cilinder(10, 5);
        shapemanager.addShape(obj1);
        shapemanager.addShape(obj2);
        shapemanager.addShape(obj3);
        System.out.println(shapemanager.getshape()); // print de hele lijst


        SwingUtilities.invokeLater(new MainPanel(shapemanager, shapemanager.getShapesLijst()));

        ShapetoFile shFile = new ShapetoFile();
        shFile.writeShapeToObjectFile("shapeProftaak.obj",obj1 );

        bol ishape = (bol) shFile.readFromObjectFile("shapeProftaak.obj");
        System.out.print(ishape.toString());


    }

}
