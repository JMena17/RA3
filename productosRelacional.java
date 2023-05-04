
package modelo;

import dao.productosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Productos;
import modelo.conexion;

public class productosRelacional implements productosDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
    LinkedList<Productos> lista = new LinkedList<>();
    String sql;
    private int codigo;
    
    @Override
    public DefaultTableModel listar() {
        try {
            
            sql = "Select * from productos";
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            // Muestra la base de datos
            String cProductos[] = {"codigo", "nombre", "descripcion", "cantidad", "precio"};
            DefaultTableModel tabProductos = new DefaultTableModel(null, cProductos); 
            
            while (rs.next()) {                
                
                int codigo = rs.getInt(1);
                String name = rs.getString(2);
                String desc = rs.getString(3);
                int cantidad = rs.getInt(4);
                int precio = rs.getInt(5);
                
                Object[] rowP = {codigo, name, desc, cantidad, precio};
                tabProductos.addRow(rowP);
            }
            return tabProductos;
            
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
    public Productos obtener(int codigo) {
        String sql = "select from productos where codigo=?;";

            try {
                // Conecta
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);
                ps.executeUpdate(); 

                while (rs.next()) {                

                    lista.add(new Productos((rs.getInt(1)), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));

                }

            } catch (Exception e) {
            }
            return null;    
    }

    @Override
    public void crear(Productos producto) {
        String sql = "insert into productos(nombre, descripcion, cantidad, precio) values(?,?,?,?);";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setInt(4, producto.getPrecio());
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
    public void actualizar(Productos producto) {
        String sql = "update productos set nombre=?, descripcion=?, cantidad=?, precio=? where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setInt(4, producto.getCantidad());
            ps.setInt(5, producto.getPrecio());
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
        String sql = "delete from productos where codigo=?;";
        
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
