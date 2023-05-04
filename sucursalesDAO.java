
package dao;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import modelo.sucursalesRelacional;
import pos.Sucursales;


public interface sucursalesDAO {
    
    public DefaultTableModel listar();
    
    public Sucursales obtener(int codigo);
    
    public void crear(Sucursales sucursal);
    
    public void actualizar(int codigo, Sucursales sucursal);
    
    public void eliminar(int codigo);
    
}

