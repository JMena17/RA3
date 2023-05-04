package pos;

import java.util.LinkedList;

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
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public static LinkedList<Vendedor> listaVendedores = new LinkedList<Vendedor>();
    
}
