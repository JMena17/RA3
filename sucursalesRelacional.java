
package modelo;

import dao.sucursalesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Sucursales;
import modelo.conexion;

public class sucursalesRelacional implements sucursalesDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = conexion.getInstance();
    LinkedList<Sucursales> lista = new LinkedList<>();
    
    String sql; 
    private int codigo;

    
    @Override
    public DefaultTableModel listar() {
        try {
            
            sql = "Select * from sucursales";
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Muestra la base de datos
            String cSucursal[] = {"Código", "Departamento", "Dirección", "Correo", "Teléfono"};
            DefaultTableModel tabSucursal = new DefaultTableModel(null, cSucursal); 
            
            while (rs.next()) {                
                
                int codigo = rs.getInt(1);
                String dep = rs.getString(2);
                String dire = rs.getString(3);
                String correo = rs.getString(4);
                int tel = rs.getInt(5);
                
                Object[] rows = {codigo, dep, dire, correo, tel};
                tabSucursal.addRow(rows);
            }
            return tabSucursal;
            
        } catch (Exception e) {
        } finally {
            try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Sucursales obtener(int codigo) {
        
        String sql = "select from sucursales where codigo=?;";
        
        try {
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate(); 
            
            while (rs.next()) {                
               
                lista.add(new Sucursales((rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
                
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void crear(Sucursales sucursal) {
        
        String sql = "insert into sucursales( departamento, direccion, telefono, correo) values(?,?,?,?);";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
        //    ps.setInt(1, sucursal.getCodigo());
            ps.setString(1, sucursal.getDepartamento());
            ps.setString(2, sucursal.getDireccion());
            ps.setInt(3, sucursal.getTelefono());
            ps.setString(4, sucursal.getCorreo());
            ps.executeUpdate();
            
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
    }

    @Override
    public void actualizar(int codigo, Sucursales sucursal) {
        
        String sql = "update sucursales set departamento=?, direccion=?, telefono=?, correo=? where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, sucursal.getDepartamento());
            ps.setString(2, sucursal.getDireccion());
            ps.setInt(3, sucursal.getTelefono());
            ps.setString(4, sucursal.getCorreo());
            ps.setInt(5, codigo);
            ps.executeUpdate();
            
        } catch (Exception e) {
        } finally {
            try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
            } catch (SQLException ex) {
            ex.printStackTrace();
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "delete from sucursales where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
        } catch(Exception e){
            
        }
    }
    
}
