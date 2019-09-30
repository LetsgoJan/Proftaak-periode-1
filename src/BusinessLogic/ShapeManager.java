package BusinessLogic;

import model.Ishape;
import model.bol;

import java.util.ArrayList;
/*
ShapeManager maakt een lijst van de objecten en geeft de hele lijst terug
toevoegen- vinden - verwijderen- wijzigen is mogelijk
 */
public class ShapeManager {
    private ArrayList<Ishape> shapes;

    public ShapeManager(){
         shapes = new ArrayList<>();
    }

    public ArrayList<Ishape> getShapes() {

        return shapes;
    }

    public void setShapes(ArrayList<Ishape> shapes) {

        this.shapes = shapes;
    }

    public void addShape(Ishape eenShape){
        shapes.add(eenShape);
    }
}
