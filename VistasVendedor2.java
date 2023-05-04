package pos;

import javax.swing.JOptionPane;
import static pos.Vendedor.listaVendedores;

public class VistasVendedor2 extends javax.swing.JFrame {

    private Vendedor codigo;
    private Vendedor nombre;
    private Vendedor caja;
    private Vendedor ventas;
    private Vendedor genero;
    private Vendedor pass;
    
    public VistasVendedor2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelCaja = new javax.swing.JLabel();
        labelVentas = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textCaja = new javax.swing.JTextField();
        textVentas = new javax.swing.JTextField();
        textGenero = new javax.swing.JTextField();
        btnActualizarV = new javax.swing.JButton();
        pwdField = new javax.swing.JPasswordField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(176, 231, 243));
        jPanel1.setPreferredSize(new java.awt.Dimension(415, 346));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Vendedor");

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código");

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");

        labelCaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCaja.setText("Caja");

        labelVentas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelVentas.setText("Ventas");

        labelGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelGenero.setText("Género");

        labelPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPassword.setText("Password");

        textCodigo.setEnabled(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCajaActionPerformed(evt);
            }
        });

        textVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVentasActionPerformed(evt);
            }
        });

        textGenero.setEnabled(false);
        textGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGeneroActionPerformed(evt);
            }
        });

        btnActualizarV.setText("Actualizar");
        btnActualizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnActualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCaja)
                    .addComponent(textCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVentas)
                    .addComponent(textVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero)
                    .addComponent(textGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        
    }//GEN-LAST:event_textCodigoActionPerformed
        
    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        
    }//GEN-LAST:event_textNombreActionPerformed

    private void textCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCajaActionPerformed
        
    }//GEN-LAST:event_textCajaActionPerformed

    private void textVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVentasActionPerformed
        
    }//GEN-LAST:event_textVentasActionPerformed

    private void textGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGeneroActionPerformed
        
    }//GEN-LAST:event_textGeneroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        textNombre.setText(" ");
        textCaja.setText(" ");
        textVentas.setText(" ");
        pwdField.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVActionPerformed
  
        listaVendedores.add(new Vendedor(Integer.parseInt(textCodigo.getText()), textNombre.getText(), 
                Integer.parseInt(textCaja.getText()), Integer.parseInt(textVentas.getText()), 
                textGenero.getText(), pwdField.getText()));
        
        JOptionPane.showMessageDialog(null, "Los datos del vendedor han sido actualizados con éxito.");
        Tabla nuevo = new Tabla();
        nuevo.show();
        dispose();
        
    }//GEN-LAST:event_btnActualizarVActionPerformed
    
    public void actualizar(int id) {
        
        textCodigo.setText(Vendedor.listaVendedores.get(id).getCodigo()+"");
        textNombre.setText(Vendedor.listaVendedores.set(id, nombre).getNombre());
        textCaja.setText(Vendedor.listaVendedores.set(id, caja).getCaja()+"");
        textVentas.setText(Vendedor.listaVendedores.set(id, ventas).getVentas()+"");
        textGenero.setText(Vendedor.listaVendedores.get(id).getGenero()+"");
        pwdField.setText(Vendedor.listaVendedores.set(id, nombre).getNombre());
        
        listaVendedores.add(new Vendedor(Integer.parseInt(textCodigo.getText()), textNombre.getText(), 
                Integer.parseInt(textCaja.getText()), Integer.parseInt(textVentas.getText()), 
                textGenero.getText(),pwdField.getText()));
        
        JOptionPane.showMessageDialog(null, "Los datos del vendedor han sido actualizados con éxito.");
        Tabla nuevo = new Tabla();
        nuevo.show();
        dispose();
    }
    
    public void mostrar(int id) {
        textCodigo.setText(Vendedor.listaVendedores.get(id).getCodigo()+"");
        textNombre.setText(Vendedor.listaVendedores.get(id).getNombre());
        textCaja.setText(Vendedor.listaVendedores.get(id).getCaja()+"");
        textVentas.setText(Vendedor.listaVendedores.get(id).getVentas()+"");
        textGenero.setText(Vendedor.listaVendedores.get(id).getGenero());
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistasVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistasVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistasVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistasVendedor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistasVendedor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarV;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCaja;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelVentas;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField textCaja;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textGenero;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textVentas;
    // End of variables declaration//GEN-END:variables
}
