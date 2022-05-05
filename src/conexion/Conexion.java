package conexion;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Felix
 */
public class Conexion {

    private DB db;
    private DBCollection coleccionEmpleados;
    private DBCollection coleccionChecks;

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

    public int genId() {
        int id = (int) (Math.random() * 100000);
        return id;
    }

    public String[] getEmpleados() {
        DBCursor cursor = coleccionEmpleados.find();
        String datos = "";
        while (cursor.hasNext()) {
            datos = datos + cursor.next().toString() + "\n";
        }
        String[] arr = datos.split("\n");
        return arr;
    }

    public void addEmpleados(String nombre, String puesto, String foto) {
        BasicDBObject document = new BasicDBObject();
        int id = 0;
        String[] arr = getEmpleados();
        for (String x : arr) {
            Gson g = new Gson();
            Empleados em = g.fromJson(x, Empleados.class);
            int idno = em.Id;
            do {
                id = genId();
            } while (id == em.Id);
        }
        document.put("Id", id);
        document.put("Nombre", nombre);
        document.put("Puesto", puesto);
        document.put("Foto", foto);
        coleccionEmpleados.insert(document);
        JOptionPane.showMessageDialog(null, "se agrego correctamente");
    }

    public void updateEmpleados(int id, String nombre, String puesto, String foto) {
        BasicDBObject newDatos = new BasicDBObject();
        BasicDBObject filtro = new BasicDBObject();
        BasicDBObject update = new BasicDBObject();

        newDatos.append("Nombre", nombre);
        newDatos.append("Puesto", puesto);
        newDatos.append("Foto", foto);
        update.append("$set", newDatos);

        filtro.append("Id", id);
        coleccionEmpleados.updateMulti(filtro, update);
        JOptionPane.showMessageDialog(null, "se edito correctamente");
    }

    public void deleteEmpleados(int id) {
        BasicDBObject document = new BasicDBObject();
        document.append("Id", id);
        coleccionEmpleados.remove(document);
        JOptionPane.showMessageDialog(null, "se elimino correctamente");
    }

    public String[] getCheck() {
        DBCursor cursor = coleccionChecks.find();
        String datos = "";
        while (cursor.hasNext()) {
            datos = datos + cursor.next().toString() + "\n";
        }
        String[] arr = datos.split("\n");
        return arr;
    }

    public void addCheckIn(int idEmpleado) {
        BasicDBObject document = new BasicDBObject();
        int id = 0;
        String[] arr = getCheck();
        for(String x : arr){
            Gson g = new Gson();
            Checks ch = g.fromJson(x, Checks.class);
            int idno = ch.IdCheck;
            do{
                id = genId();
            }while(id == ch.IdCheck);
        }
        document.put("IdCheck", id);
        document.put("IdEmpleado", idEmpleado);
        document.put("Entrada", getFecha());
        document.put("Salida", " ");
        coleccionChecks.insert(document);
        JOptionPane.showMessageDialog(null, "Listo check-in generado");

    }
    
    public void addCheckOut(int idempleado){
        BasicDBObject newDatos = new BasicDBObject();
        BasicDBObject filtro = new BasicDBObject();
        BasicDBObject update = new BasicDBObject();
        int idCheck = 0;
        newDatos.append("Salida", getFecha());
        update.append("$set", newDatos);
        String[] datos = getCheck();
        for(String x : datos){
            Gson g = new Gson();
            Checks ch = g.fromJson(x, Checks.class);
            if (ch.IdEmpleado == idempleado && ch.Salida.equalsIgnoreCase(" ")) {
                idCheck = ch.IdCheck;
            }
        }
        filtro.append("IdCheck", idCheck);
        coleccionChecks.updateMulti(filtro,update);
        JOptionPane.showMessageDialog(null, "Listo check-out generado");
    }
    
    public String getFecha(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        String fecha = formato.format(LocalDateTime.now());
        return fecha;
    }
}
