package pos;

import java.util.LinkedList;

public class Sucursales {
    
    private int codigo;
    private String departamento;
    private String direccion;
    private String correo;
    private int telefono;
    
    
    public Sucursales(int codigo, String departamento, String direccion, String correo, int telefono) {
    
        this.codigo = codigo;
        this.departamento = departamento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    
    }
    
    public static LinkedList<Sucursales> listaSucursales = new LinkedList<Sucursales>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
