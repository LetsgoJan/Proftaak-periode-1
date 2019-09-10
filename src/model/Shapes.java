package model;

import model.Ishape;
import model.bol;

public class Shapes {
    //use getShape method to get object of type shape
    public Ishape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType == "bol"){
            return new bol();
        }
        return null;
    }
}
