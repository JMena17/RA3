
package dao;

import java.util.LinkedList;
import pos.Vendedor;

public interface vendedoresDAO {
    
    public LinkedList<Vendedor> listar(); 
    
    public Vendedor obtener(int codigo);
    
    public void crear(Vendedor vendedor);
    
    public void actualizar(Vendedor vendedor);
    
    public void eliminar(Vendedor vendedor);
    
}
