package conexion;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Felix
 */
public class Conexion {

    DB db;
    DBCollection coleccionEmpleados;
    DBCollection coleccionChecks;

    public Conexion() {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            db = mongo.getDB("Empleados");
            coleccionEmpleados = db.getCollection("Empleados");
            coleccionChecks = db.getCollection("Check-in-out");
        } catch (UnknownHostException ex) {
            JOptionPane x = new JOptionPane();
            x.showMessageDialog(null, "Hubo un error de conexion; \n" + ex.getMessage());
        }
    }
    public int genId(){
        int id = (int) (Math.random()*100000);
        return id;
    }
    public String[] getEmpleados(){
        DBCursor cursor = coleccionEmpleados.find();
        String datos = "";
        while(cursor.hasNext()){
            datos = datos + cursor.next().toString() + "\n";
        }
        String[] arr = datos.split("\n");
        return arr;
    }
    public String[] getCheck(){
        DBCursor cursor = coleccionChecks.find();
        String datos = "";
        while(cursor.hasNext()){
            datos = datos + cursor.next().toString() + "\n";
        }
        String[] arr = datos.split("\n");
        return arr;
    }
    public void addEmpleados(String nombre, String puesto,String foto){
        BasicDBObject document = new BasicDBObject();
        document.put("Id", genId());
        document.put("Nombre", nombre);
        document.put("Puesto", puesto);
        document.put("Foto", foto);
        coleccionEmpleados.insert(document);
    }
    public void updateEmpleados(int id, String nombre, String puesto, String foto){
        BasicDBObject newDatos = new BasicDBObject();
        BasicDBObject filtro = new BasicDBObject();
        BasicDBObject update = new BasicDBObject();
        
        newDatos.append("Id", id);
        newDatos.append("Nombre", nombre);
        newDatos.append("Puesto", puesto);
        newDatos.append("Foto", foto);
        update.append("$set", newDatos);
        
        filtro.append("Id", id);
        coleccionEmpleados.updateMulti(filtro, update);
    }
    public void deleteEmpleados(int id){
        BasicDBObject document = new BasicDBObject();
        document.append("Id", id);
        coleccionEmpleados.remove(document);
    }
    
}
