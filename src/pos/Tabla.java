package pos;

import java.awt.PopupMenu;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static pos.Vendedor.listaVendedores;



public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
        mostrarTabla();
        
    }

    public void mostrarTabla() {
        // Muestra la tabla de los Vendedores
        String columnas[] = {"Código", "Nombre", "Caja", "Ventas", "Genero"};
        DefaultTableModel tablas = new DefaultTableModel(null, columnas);
        
        for (Vendedor vendedores : Vendedor.listaVendedores) {
            
            Object lista[] = new Object[5];
            lista[0] = vendedores.getCodigo();
            lista[1] = vendedores.getNombre();
            lista[2] = vendedores.getCaja();
            lista[3] = vendedores.getVentas();
            lista[4] = vendedores.getGenero();
            tablas.addRow(lista);
            
        }
        // Muestra la tabla de los Clientes
        String cClientes[] = {"Código", "Nombre", "NIT", "Correo", "Género"};
        DefaultTableModel tabClientes = new DefaultTableModel(null, cClientes );
        
        for ( Clientes clientes : Clientes.listasClientes) {
            
            Object lista[] = new Object[5];
            lista[0] = clientes.getCodigo();
            lista[1] = clientes.getNombre();
            lista[2] = clientes.getNit();
            lista[3] = clientes.getCorreo();
            lista[4] = clientes.getGenero();
            tabClientes.addRow(lista);
            
        }
        // Muestra la tabla de los Productos
        String cProductos[] = {"Código", "Nombre", "Descripción", "Cantidad", "Precio"};
        DefaultTableModel tabProductos = new DefaultTableModel(null, cProductos);
        for (Productos productos : Productos.listaProductos) {
            
            Object lista[] = new Object[5];
            lista[0] = productos.getCodigo();
            lista[1] = productos.getNombre();
            lista[2] = productos.getDescripcion();
            lista[3] = productos.getCantidad();
            lista[4] = productos.getPrecio();
            tabProductos.addRow(lista);
            
        }
        // Muestra la tabla de las Sucursales
        String cSucursal[] = {"Código", "Departamento", "Dirección", "Correo", "Teléfono"};
        DefaultTableModel tabSucursal = new DefaultTableModel(null, cSucursal);      
        for (Sucursales sucursal : Sucursales.listaSucursales) {
            
            Object lista[] = new Object[5];
            lista[0] = sucursal.getCodigo();
            lista[1] = sucursal.getDepartamento();
            lista[2] = sucursal.getDireccion();
            lista[3] = sucursal.getCorreo();
            lista[4] = sucursal.getTelefono();
            tabSucursal.addRow(lista);
            
        }
        // Mostrar las tablas. 
        Table.setModel(tablas);
        Table1.setModel(tabClientes);
        Table2.setModel(tabProductos);
        Table3.setModel(tabSucursal);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        btnActualizar3 = new javax.swing.JButton();
        btnCrear3 = new javax.swing.JButton();
        btnEliminar3 = new javax.swing.JButton();
        btnCargar3 = new javax.swing.JButton();
        btnPdf3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        btnActualizar2 = new javax.swing.JButton();
        btnCrear2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnCargar2 = new javax.swing.JButton();
        btnPdf2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        btnActualizar1 = new javax.swing.JButton();
        btnCrear1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnCargar1 = new javax.swing.JButton();
        btnPdf1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Table3);

        btnActualizar3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizar3.setText("Actualizar");
        btnActualizar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar3ActionPerformed(evt);
            }
        });

        btnCrear3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCrear3.setText("Crear");
        btnCrear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear3ActionPerformed(evt);
            }
        });

        btnEliminar3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar3.setText("Eliminar");
        btnEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar3ActionPerformed(evt);
            }
        });

        btnCargar3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCargar3.setText("Carga Masiva");

        btnPdf3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPdf3.setText("Exportar PDF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnPdf3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrear3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdf3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        tab.addTab("Sucursales", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(545, 295));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Table2);

        btnActualizar2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizar2.setText("Actualizar");
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });

        btnCrear2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCrear2.setText("Crear");
        btnCrear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear2ActionPerformed(evt);
            }
        });

        btnEliminar2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnCargar2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCargar2.setText("Carga Masiva");

        btnPdf2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPdf2.setText("Exportar PDF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnPdf2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCrear2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdf2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        tab.addTab("Productos", jPanel2);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Table1);

        btnActualizar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        btnCrear1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCrear1.setText("Crear");
        btnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear1ActionPerformed(evt);
            }
        });

        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnCargar1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCargar1.setText("Carga Masiva");

        btnPdf1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPdf1.setText("Exportar PDF");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnPdf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCrear1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        tab.addTab("Clientes", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(545, 395));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCargar.setText("Carga Masiva");

        btnPdf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPdf.setText("Exportar PDF");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        tab.addTab("Vendedores", jPanel4);

        btnLogOut.setBackground(new java.awt.Color(255, 51, 51));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogOut.setText("Cerrar Sesión");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        NewJFrame inicio = new NewJFrame();
        inicio.show();
        dispose();
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Actualizar Vendedor
        if(Table.getSelectedRow() > 0 ) {
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila.");
        } else {
            VistasVendedor2 actualizar = new VistasVendedor2();
            actualizar.mostrar(Table.getSelectedRow());
            Vendedor.listaVendedores.remove(Table.getSelectedRow());
            actualizar.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        VistasVendedor1 crear = new VistasVendedor1();
        crear.show();
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Eliminar Vendedor
        // Se crea un array tomando los valores de Table para poder eliminar la fila seleccionada. 
        
        int[] eliminar = Table.getSelectedRows();
        // La unica manera que pude encontrar para poder tomar los datos de la tabla.
        DefaultTableModel tablas = (DefaultTableModel) this.Table.getModel();
        
        // Se crea un for para tomar el valor seleccionado y luego eliminar la fila.
        for(int i = 0; i < eliminar.length; i++) {
                tablas.removeRow(eliminar[i]-i);
                JOptionPane.showMessageDialog(null, "El vendedor ha sido eliminado.");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        // Actualizar Cliente
        if(Table1.getSelectedRow() > 0 ) {
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila.");
        } else {
            
            ActualizarCliente actualizar = new ActualizarCliente();
            actualizar.mostrar(Table1.getSelectedRow());
            Clientes.listasClientes.remove(Table1.getSelectedRow());
            actualizar.setVisible(true);
            dispose();
            
        }
        
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear1ActionPerformed
        // Crear Cliente
        AgregarCliente nuevo = new AgregarCliente();
        nuevo.show();
    }//GEN-LAST:event_btnCrear1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // Eliminar Cliente
        
        int[] eliminar = Table1.getSelectedRows();
        
        DefaultTableModel tabs = (DefaultTableModel) this.Table1.getModel();
        
        for(int i = 0; i < eliminar.length; i++) {
                tabs.removeRow(eliminar[i]-i);
                
                JOptionPane.showMessageDialog(null, "El Cliente ha sido eliminado.");
        }
        
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        // Actualizar Producto
        if(Table2.getSelectedRow() < 0 ) {
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila.");
        } else {
            ActualizarProducto actualizar = new ActualizarProducto();
            actualizar.mostrar(Table2.getSelectedRow());
            Productos.listaProductos.remove(Table2.getSelectedRow());
            actualizar.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void btnCrear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear2ActionPerformed
        // Crear Producto
        CrearProductos nuevo = new CrearProductos();
        nuevo.show();
        
    }//GEN-LAST:event_btnCrear2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // Eliminar Producto
        
        int[] eliminar = Table2.getSelectedRows();
        
        DefaultTableModel tabs = (DefaultTableModel) this.Table2.getModel();
        
        for(int i = 0; i < eliminar.length; i++) {
                tabs.removeRow(eliminar[i]-i);
                JOptionPane.showMessageDialog(null, "El Producto ha sido eliminado.");
        }
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnActualizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar3ActionPerformed
        // Actualizar Sucursal
        if(Table3.getSelectedRow() > 0 ) {
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila.");
        } else {
            // Muestra los nuevos datos
            Actualizar_Sucursal actualizar = new Actualizar_Sucursal();
            actualizar.mostrar(Table3.getSelectedRow());
            // Elimina la fila anterior 
            Sucursales.listaSucursales.remove(Table3.getSelectedRow());
            actualizar.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnActualizar3ActionPerformed

    private void btnCrear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear3ActionPerformed
        // Crear Sucursal
        Agregar_Sucursal crear = new Agregar_Sucursal();
        crear.show();
    }//GEN-LAST:event_btnCrear3ActionPerformed

    private void btnEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar3ActionPerformed
        // Eliminar Sucursal
        int[] eliminar = Table3.getSelectedRows();
        
        DefaultTableModel tabs = (DefaultTableModel) this.Table3.getModel();
        
        for(int i = 0; i < eliminar.length; i++) {
                tabs.removeRow(eliminar[i]-i);
                JOptionPane.showMessageDialog(null, "La Sucursal ha sido eliminado.");
        }
    }//GEN-LAST:event_btnEliminar3ActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCargar1;
    private javax.swing.JButton btnCargar2;
    private javax.swing.JButton btnCargar3;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrear1;
    private javax.swing.JButton btnCrear2;
    private javax.swing.JButton btnCrear3;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminar3;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnPdf1;
    private javax.swing.JButton btnPdf2;
    private javax.swing.JButton btnPdf3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables

}
