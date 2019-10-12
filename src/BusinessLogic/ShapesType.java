package BusinessLogic;

import model.Ishape;
import model.blok;
import model.bol;
import model.cilinder;

/*
ShapesType maakt en returneert een nieuwe vorm
 */
public class ShapesType {
    public Ishape getShape(String typeShape, double breedte, double hoogte, double lengte, double straal ){
        if(typeShape == null){
            return null;
        }
        if(typeShape.equals("BOL")){
            return new bol(straal);
        }else if(typeShape.equals("CILINDER")){
            return new cilinder(straal, hoogte);
        }else if(typeShape.equals("BLOK")){
            return  new blok(breedte, lengte, hoogte);
        }
        return null;
    }
}
