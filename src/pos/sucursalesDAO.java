
package dao;

import java.util.LinkedList;
import modelo.sucursalesRelacional;
import pos.Sucursales;


public interface sucursalesDAO {
    
    public LinkedList<Sucursales> listar();
    
    public Sucursales obtener(int codigo);
    
    public void crear(Sucursales sucursal);
    
    public void actualizar(Sucursales sucursal);
    
    public void eliminar(int codigo);
    
}

