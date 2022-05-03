package test;

import com.google.gson.Gson;
import conexion.Conexion;
import conexion.Empleados;

/**
 *
 * @author betoto21
 */
public class Test {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.deleteEmpleados(17340);
        String[] arr = con.getEmpleados();
        String[] arr2 = con.getCheck();
        Gson g = new Gson();
        for (String x : arr) {
//            System.out.println(x);
            Empleados em = g.fromJson(x, Empleados.class);
            System.out.println(em.Nombre + " ");
        }
        System.out.println("---------------------------");
        
        for(String x : arr2){
            System.out.println(x);
        }
    }
}
