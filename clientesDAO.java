
package dao;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Clientes;

public interface clientesDAO {
    
    public DefaultTableModel listar();
    
    public Clientes obtener(int codigo);
    
    public void crear(Clientes clientes);
    
    public void actualizar(Clientes clientes);
    
    public void eliminar(int codigo);
}
