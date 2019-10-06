package BusinessLogic;

import model.Ishape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
ShapeManager maakt een lijst van de objecten en geeft de hele lijst terug
toevoegen- vinden - verwijderen- wijzigen is mogelijk
 */
public class ShapeManager {

    List<Ishape> shapesLijst = new ArrayList<>();

    public void addShape(Ishape eenShape){
        shapesLijst.add(eenShape);
    }

    public double totalInhoud(){
        double total =0.0;
        for(Ishape eenShape: shapesLijst){
            total += eenShape.shapeInhoud();
        }
        return total;
    }

    public HashMap<Ishape, Integer> getshape(){
        HashMap<Ishape, Integer> shapeCount = new HashMap<>();

        for(Ishape eenShape : shapesLijst){
            if(shapeCount.containsKey(eenShape)){
                int freq = shapeCount.get(eenShape);
                shapeCount.put(eenShape, freq+1);
            }else{
                shapeCount.put(eenShape, 1);
            }
        }
        return shapeCount;
    }



    public List<Ishape> getShapesLijst() {
        return shapesLijst;
    }


}
