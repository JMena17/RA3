package pos;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Juancho
 */
public class Vendedor {
    
    private int codigo;
    private String nombre;
    private int caja;
    private int ventas;
    private String genero;
    private String pass;
    
    // Se crea los objetos para el CRUD
    public Vendedor(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.pass = pass;
        
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCaja(){
        return caja;
    }
    
    public void setCaja(int caja) {
        this.caja = caja;
    }
    
    public int getVentas(){
        return ventas;
    }
    
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public static LinkedList<Vendedor> listaVendedores = new LinkedList<Vendedor>();
    
/* Intente crearlo desde aca, pero no supe como implementarlo en las otras clases.     
    public void crearVendedor(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        Vendedor salesman = new Vendedor(codigo, (Integer.parseInt(nombre)), caja, ventas, (Integer.parseInt(genero)), (Integer.parseInt(pass)));
        
        listaVendedores.add(salesman);
    }
    
    public void actualizarVendedor(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        for (Vendedor salesman : listaVendedores) {
            if (salesman.getCodigo() == codigo) {
                salesman.setNombre(nombre);
                salesman.setCaja(caja);
                salesman.setVentas(ventas);
            } 
        }
    } 
    
    public void eliminarVendedor(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        
        Iterator<Vendedor> iterator = listaVendedores.iterator();
        while (iterator.hasNext()) {
            Vendedor salesman = iterator.next();
            if (salesman.getCodigo() == codigo) {
                iterator.remove();
            } 
        }

    } */
}
