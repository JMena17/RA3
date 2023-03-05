package pos;

import java.awt.Component;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juancho
 */

public class Pos extends JFrame {
    
    /*public void tablainfo() {
        
        String columnas[] = {"Codigo", "Nombre", "Caja", "Ventas", "Genero"};
        DefaultTableModel tab1 = new DefaultTableModel(null, columnas);
        
        for(vendedores lista : )
        
    }*/
    
    public static void login() {
        NewJFrame form = new NewJFrame();
        //form.setSize(545, 295);
        form.setVisible(true);
    }
    public static void tabla(){
        Tabla form = new Tabla();
        //form.setSize(545, 295);
        form.setVisible(true);
    }
    public static void vendedor1() {
        VistasVendedor1 form = new VistasVendedor1();
        form.setSize(545, 295);
        form.setVisible(true);
    }
    public static void vendedor2() {
        VistasVendedor2 form = new VistasVendedor2();
        form.setVisible(true);
    }
    public static void modulo() {
        ModuloVendedores form = new ModuloVendedores();
        form.setSize(675, 550);
        form.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Pos.login();
    }
    
}
