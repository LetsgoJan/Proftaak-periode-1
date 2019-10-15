package DbManager;

import model.Ishape;
import java.io.*;


public class ShapetoFile {

    public void writeShapeToObjectFile(String filename, Ishape ishape){
        try{
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(ishape);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Ishape readFromObjectFile(String filename){

        ObjectInputStream objectInputStream = null;

        try{
            objectInputStream = new ObjectInputStream((new FileInputStream(filename)));
//            System.out.println(objectInputStream.getClass().);
//            if(objectInputStream instanceof ){
//                return null;
//            }
            return (Ishape)objectInputStream.readObject();
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
