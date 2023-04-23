package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class conexion {
    // Variables que se utilizaron para conectar la db
    Connection con;
    String url = "jdbc:mysql://localhost:3306/evalti";
    String user = "root";
    String pass = "";
    
    // Se configura la api
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
    DefaultTableModel model;
    
    // Se establece la conexion a la db
    public Connection Conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.out.println("Error ");
            System.out.println(e);
        }
        
        return con;
    }
}
