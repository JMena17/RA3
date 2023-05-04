
package dao;

import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import pos.Vendedor;

public interface vendedoresDAO {
    
    public DefaultTableModel listar(); 
    
    public Vendedor obtener(int codigo);
    
    public void crear(Vendedor vendedor);
    
    public void actualizar(Vendedor vendedor);
    
    public void eliminar(int codigo);
    
}
