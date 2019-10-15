package BusinessLogic;

import DbManager.ShapeDbManager;
import model.Ishape;
import model.blok;
import model.bol;
import model.cilinder;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
ShapeManager maakt een lijst van de objecten en geeft de hele lijst terug
toevoegen- vinden - verwijderen- wijzigen is mogelijk
 */
public class ShapeManager implements Serializable {

    ShapeDbManager dbshape = new ShapeDbManager();

    List<Ishape> shapesLijst = new ArrayList<>();

    public void addShape(Ishape eenShape){
        shapesLijst.add(eenShape);
        addShapeDatabase(eenShape);
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

    public void addShapeDatabase(Ishape eenshape){
        dbshape.connectToDatabase();
        PreparedStatement statement = null;
        dbshape.createTable();

        try{
            statement = dbshape.getConnection().prepareStatement("INSERT INTO proftaakdb (straal, breedte, hoogte, lengte, vorm, inhoud) VALUES (?,?,?,?,?,?)");
            if(eenshape instanceof bol){
                statement.setDouble(1, eenshape.getStraal());
                statement.setDouble(2, 0);
                statement.setDouble(3, 0);
                statement.setDouble(4, 0);
                statement.setString(5, "bol");
            } else if(eenshape instanceof blok){
                statement.setDouble(1, 0);
                statement.setDouble(2, eenshape.getBreedte());
                statement.setDouble(3, eenshape.getHoogte());
                statement.setDouble(4, eenshape.getLengte());
                statement.setString(5, "blok");
            }else if(eenshape instanceof cilinder){
                statement.setDouble(1, eenshape.getStraal());
                statement.setDouble(2, 0);
                statement.setDouble(3, eenshape.getHoogte());
                statement.setDouble(4, 0);
                statement.setString(5, "cilinder");
            }
            statement.setDouble(6, eenshape.shapeInhoud());

            System.out.println(statement);
            dbshape.insert(statement);
            dbshape.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbshape.closeConnection();

    }



}
