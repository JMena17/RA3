
package dao;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Productos;

public interface productosDAO {
    
    public DefaultTableModel listar();
    
    public Productos obtener(int codigo);
    
    public void crear(Productos producto);
    
    public void actualizar(Productos producto);
    
    public void eliminar(int codigo);
}
