package VAT.model;

public class Shapes {
    //use getShape method to get object of type shape
    public Ishape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType == "blok"){
            return new blok();
        }
        return null;
    }
}