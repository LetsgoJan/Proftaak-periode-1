package BusinessLogic;

import model.ShapeType;

import java.util.ArrayList;

public class ShapeTypeManager {
    private ArrayList<ShapeType> ShapeTypes;

    public ShapeTypeManager(ArrayList<ShapeType> ShapeTypes) {
        this.ShapeTypes = ShapeTypes;
    }

    public ArrayList<ShapeType> getShapeTypes() {
        return ShapeTypes;
    }

    public void addShapeType(ShapeType shapeType){
        ShapeTypes.add(shapeType);
    }

    public void deleteShapeType(ShapeType shapeType){
        ShapeTypes.remove(shapeType);
    }
}
