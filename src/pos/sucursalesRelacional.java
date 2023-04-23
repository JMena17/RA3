
package modelo;

import dao.sucursalesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import pos.Sucursales;
import modelo.conexion;

public class sucursalesRelacional implements sucursalesDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
    
    String sql; 
    
    @Override
    public LinkedList<Sucursales> listar() {
        try {
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Sucursales obtener(int codigo) {
        try {
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void crear(Sucursales sucursal) {
        
        //Base de datos de referencia, ya que aun sigo teniendo problemas con XAMPP
        String sql = "insert into usuarios(codigo, nombre, apellido, telefono, direccion, \n" +
"            correo, dob, pass, role) values(?,?,?,?,?,?,?,?,?);";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, sucursal.getCodigo());
            ps.setString(2, sucursal.getDepartamento());
            ps.setString(3, sucursal.getDireccion());
            ps.setInt(4, sucursal.getTelefono());
            ps.setString(5, sucursal.getCorreo());
            ps.executeUpdate();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void actualizar(Sucursales sucursal) {
        
        String sql = "update usuarios set nombre=?, apellido=?, telefono=?, direccion=?, correo=?, dob=? where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, sucursal.getCodigo());
            ps.setString(2, sucursal.getDepartamento());
            ps.setString(3, sucursal.getDireccion());
            ps.setInt(4, sucursal.getTelefono());
            ps.setString(5, sucursal.getCorreo());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "delete from usuarios where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
        } catch(Exception e){
            
        }
    }
    
}
