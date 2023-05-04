
package modelo;

import com.mysql.cj.xdevapi.Table;
import dao.clientesDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Clientes;
import pos.Productos;
import pos.Tabla;

public class clientesRelacional implements clientesDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
    LinkedList<Clientes> lista = new LinkedList<>();
    String sql;
    private int codigo;

    @Override
    public DefaultTableModel listar() {
        try {
            sql = "SELECT * FROM clientes";
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Muestra la base de datos
            String cClientes[] = {"codigo", "nombre", "nit", "correo", "genero"};
            DefaultTableModel tabClientes = new DefaultTableModel(null, cClientes); 
            
            
            while (rs.next()) {                
                
                int codigo = rs.getInt(1);
                String name = rs.getString(2);
                int nit = rs.getInt(3);
                String correo = rs.getString(4);
                String genero = rs.getString(5);
                
                Object[] rowC = {codigo, name, nit, correo, genero};
                tabClientes.addRow(rowC);
            }
            return tabClientes;
            
        } catch (Exception e) {
            e.printStackTrace();
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
    public Clientes obtener(int codigo) {
        
        String sql = "select from clientes where codigo=?;";
        
        try {
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate(); 
            
            while (rs.next()) {                
               
                lista.add(new Clientes((rs.getInt(1)), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
                
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void crear(Clientes clientes) {
        String sql = "insert into clientes(nombre, nit, correo, genero) values(?,?,?,?);";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, clientes.getNombre());
            ps.setInt(2, clientes.getNit());
            ps.setString(3, clientes.getCorreo());
            ps.setString(4, clientes.getGenero());
            ps.executeUpdate();
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void actualizar(Clientes clientes) {
        String sql = "update clientes set nombre=?, nit=?, correo=?, genero=? where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, clientes.getCodigo());
            ps.setString(2, clientes.getNombre());
            ps.setInt(3, clientes.getNit());
            ps.setString(4, clientes.getCorreo());
            ps.setString(5, clientes.getGenero());
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
        String sql = "delete from clientes where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            
        } catch(Exception e){
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

    
    
}
