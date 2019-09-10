package model;

public class Shapes {
    private String name;
    private ShapeType shapeType;
    private int id;

    public Shapes(String name, ShapeType shapeType, int id) {
        this.name = name;
        this.shapeType = shapeType;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
}
