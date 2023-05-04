
package modelo;

import dao.vendedoresDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Clientes;
import pos.Vendedor;

public class vendedoresRelacional implements vendedoresDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
    LinkedList<Vendedor> lista3 = new LinkedList<>();
    String sql;
    private int codigo;
    
    @Override
    public DefaultTableModel listar() {
    try {
        sql = "SELECT * FROM vendedores";
        con = acceso.Conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        String cVendedor[] = {"codigo", "nombre", "caja", "ventas", "genero"};
        DefaultTableModel tabVendedor = new DefaultTableModel(null, cVendedor); 
        
        while (rs.next()) {                
            int codigo = rs.getInt(1);
            String name = rs.getString(2);
            int caja = rs.getInt(3);
            int ventas = rs.getInt(4);
            String genero = rs.getString(5);
            
            Object[] rowV = {codigo, name, caja, ventas, genero};
            tabVendedor.addRow(rowV);
        }
        return tabVendedor;
        
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
    public Vendedor obtener(int codigo) {
        String sql = "select from vendedores where codigo=?;";
        
        try {
            // Conecta
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate(); 
            
            while (rs.next()) {                
               
                lista3.add(new Vendedor(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
                
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void crear(Vendedor vendedor) {
        
        String sql = "insert into vendedores(nombre, caja, ventas, genero, pass) values(?,?,?,?,?);";
        
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, vendedor.getNombre());
            ps.setInt(2, vendedor.getCaja());
            ps.setInt(3, vendedor.getVentas());
            ps.setString(4, vendedor.getGenero());
            ps.setString(5, vendedor.getPass());
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
    public void actualizar(Vendedor vendedor) {
        
        String sql = "update vendedores set nombre=?, caja=?, ventas=?, genero=?, pass=? where codigo=?;";
        
        try {
            
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, vendedor.getCodigo());
            ps.setString(2, vendedor.getNombre());
            ps.setInt(3, vendedor.getCaja());
            ps.setInt(4, vendedor.getVentas());
            ps.setString(5, vendedor.getGenero());
            ps.setString(6, vendedor.getPass());
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
        String sql = "delete from vendedores where codigo=?;";
        
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
