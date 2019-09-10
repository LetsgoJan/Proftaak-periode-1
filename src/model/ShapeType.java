package model;

import java.util.ArrayList;

public class ShapeType {
    private String name;
    private String formule;
    private ArrayList<Attribute> attributes;
    private int id;

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public int getId() {
        return id;
    }

    public ShapeType(String name, String formule, ArrayList<Attribute> attributes, int id) {
        this.name = name;
        this.formule = formule;
        this.attributes = attributes;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }
}
