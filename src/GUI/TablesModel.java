package GUI;

import BusinessLogic.ShapesType;
import model.Ishape;
import model.bol;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TablesModel extends AbstractTableModel {

    private List<Ishape> shapesLijst = new ArrayList();
    private String[] columnNames = {"Vorm", "Straal", "Breedte", "Hoogte", "Lengte"};

    public TablesModel(List<Ishape> lijst) {
        this.shapesLijst = lijst;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return shapesLijst.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

/*
test object:
        ShapeManager shapeLijst = new ShapeManager();
        ShapesType shapeVorm = new ShapesType();

        Ishape eenBol = shapeVorm.getShape("BOL", 0, 0, 0, 5 );// make a shape
        System.out.print(eenBol.shapeInhoud()+"\n"); // print de inhoud

        shapeLijst.addShape(eenBol); // add to de lijst
        shapeLijst.addShape(eenBol); // add to de lijst
        shapeLijst.addShape(eenBol); // add to de lijst

        System.out.print(shapeLijst.getShapes()); // print de hele lijst
 */
        Ishape eenShape = shapesLijst.get(rowIndex);
        return null;

    }


}
