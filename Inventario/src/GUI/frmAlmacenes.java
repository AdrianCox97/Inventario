/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BO.AlmacenBO;
import DAO.AlmacenDAO;
import com.sun.rowset.CachedRowSetImpl;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stree
 */
public class frmAlmacenes extends javax.swing.JFrame {
    
    DefaultTableModel modeloAlmacenes;

    /**
     * Creates new form frmAlmacenes
     */
    public frmAlmacenes() {
        this.bindGrid();
        initComponents();
        this.txtNombreAlm.requestFocus();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Almacenes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgAlmacenes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        gbxDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombreAlm = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccionAlm = new javax.swing.JTextField();
        txtIDAlm = new javax.swing.JTextField();
        lblIDAlm = new javax.swing.JLabel();
        gbxAcciones = new javax.swing.JPanel();
        btnEliminarAlmacen = new javax.swing.JButton();
        btnGuardarAlmacen = new javax.swing.JButton();
        btnNuevoAlmacen = new javax.swing.JButton();
        btnModificarAlmacen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(358, 67));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Almacenes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        dgAlmacenes.setModel(modeloAlmacenes);
        dgAlmacenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dgAlmacenes.setName(""); // NOI18N
        dgAlmacenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgAlmacenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgAlmacenes);
        dgAlmacenes.getAccessibleContext().setAccessibleName("dgAlmacenes");

        gbxDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        lblNombre.setText("Nombre");

        lblDireccion.setText("Dirección");

        txtIDAlm.setEnabled(false);
        txtIDAlm.setName("txtIDAlm"); // NOI18N

        lblIDAlm.setText("ID");

        javax.swing.GroupLayout gbxDatosLayout = new javax.swing.GroupLayout(gbxDatos);
        gbxDatos.setLayout(gbxDatosLayout);
        gbxDatosLayout.setHorizontalGroup(
            gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbxDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(lblNombre)
                    .addComponent(lblIDAlm))
                .addGap(18, 18, 18)
                .addGroup(gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDAlm)
                    .addComponent(txtNombreAlm)
                    .addComponent(txtDireccionAlm, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap())
        );
        gbxDatosLayout.setVerticalGroup(
            gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbxDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDAlm))
                .addGap(18, 18, 18)
                .addGroup(gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gbxDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccionAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        gbxAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        btnEliminarAlmacen.setText("Eliminar");
        btnEliminarAlmacen.setEnabled(false);
        btnEliminarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAlmacenMouseClicked(evt);
            }
        });

        btnGuardarAlmacen.setText("Agregar");
        btnGuardarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarAlmacenMouseClicked(evt);
            }
        });

        btnNuevoAlmacen.setText("Nuevo");
        btnNuevoAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoAlmacenMouseClicked(evt);
            }
        });

        btnModificarAlmacen.setText("Modificar");
        btnModificarAlmacen.setEnabled(false);
        btnModificarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarAlmacenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gbxAccionesLayout = new javax.swing.GroupLayout(gbxAcciones);
        gbxAcciones.setLayout(gbxAccionesLayout);
        gbxAccionesLayout.setHorizontalGroup(
            gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbxAccionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarAlmacen)
                    .addComponent(btnEliminarAlmacen))
                .addGap(19, 19, 19))
        );
        gbxAccionesLayout.setVerticalGroup(
            gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbxAccionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnGuardarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(gbxAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnEliminarAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gbxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gbxAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gbxDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gbxAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoAlmacenMouseClicked
        this.Nuevo();
        this.txtNombreAlm.requestFocus();
        this.bindGrid();
    }//GEN-LAST:event_btnNuevoAlmacenMouseClicked

    private void btnGuardarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAlmacenMouseClicked
        try {
            if (this.ValidarVacios()){
                this.Guardar();
            } else {
                JOptionPane.showMessageDialog(null, "Rellena los campos faltantes.");
            }
            this.txtNombreAlm.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(frmAlmacenes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarAlmacenMouseClicked

    private void btnModificarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarAlmacenMouseClicked
        try {
            if (this.txtIDAlm.getText().trim().length() != 0){
                this.Modificar();
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona un registro.");
            }
            this.txtNombreAlm.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(frmAlmacenes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarAlmacenMouseClicked

    private void btnEliminarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAlmacenMouseClicked
        try {
            if (this.txtIDAlm.getText().trim().length() != 0){
                this.Eliminar();
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona un registro.");
            }
            this.txtNombreAlm.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(frmAlmacenes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarAlmacenMouseClicked

    private void dgAlmacenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgAlmacenesMouseClicked
        int row = this.dgAlmacenes.getSelectedRow();
        
        String[] datos = new String[3];
        datos[0] = this.dgAlmacenes.getModel().getValueAt(row, 0).toString();
        datos[1] = this.dgAlmacenes.getModel().getValueAt(row, 1).toString();
        datos[2] = this.dgAlmacenes.getModel().getValueAt(row, 2).toString();
        
        this.LlenarDatos(datos);
        
        this.txtNombreAlm.requestFocus();
        this.btnGuardarAlmacen.setEnabled(false);
        this.btnModificarAlmacen.setEnabled(true);
        this.btnEliminarAlmacen.setEnabled(true);
    }//GEN-LAST:event_dgAlmacenesMouseClicked

    private void Nuevo(){
        this.txtIDAlm.setText("");
        this.txtNombreAlm.setText("");
        this.txtDireccionAlm.setText("");
        
        this.bindGrid();
        this.dgAlmacenes.setModel(modeloAlmacenes);
        
        this.btnGuardarAlmacen.setEnabled(true);
        this.btnModificarAlmacen.setEnabled(false);
        this.btnEliminarAlmacen.setEnabled(false);
    }
    
    private void Guardar() throws SQLException {
        AlmacenBO OBAlmacen = new AlmacenBO();
        OBAlmacen.setNombre(this.txtNombreAlm.getText());
        OBAlmacen.setDireccion(this.txtDireccionAlm.getText());
        
        AlmacenDAO data = new AlmacenDAO();
        int correcto = data.guardar(OBAlmacen);
    
        if (correcto > 0){
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito.");
            
            this.Nuevo();
            
            this.bindGrid();
            this.dgAlmacenes.setModel(modeloAlmacenes);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
        } 
    }
    
    private void Modificar() throws SQLException {
        AlmacenBO OBAlmacen = new AlmacenBO();
        OBAlmacen.setIDAlmacen(Integer.parseInt(this.txtIDAlm.getText()));
        OBAlmacen.setNombre(this.txtNombreAlm.getText());
        OBAlmacen.setDireccion(this.txtDireccionAlm.getText());
        
        AlmacenDAO data = new AlmacenDAO();
        int correcto = data.editar(OBAlmacen);
    
        if (correcto > 0){
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito.");
            
            this.Nuevo();
            
            this.bindGrid();
            this.dgAlmacenes.setModel(modeloAlmacenes);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
        } 
    }
    
    private void Eliminar() throws SQLException {
        int correcto = 0;
        AlmacenBO OBAlmacen = new AlmacenBO();
        AlmacenDAO data = new AlmacenDAO();
        OBAlmacen.setIDAlmacen(Integer.parseInt(this.txtIDAlm.getText()));
        
        correcto = data.eliminar(OBAlmacen);
        
        if (correcto > 0){
            JOptionPane.showMessageDialog(null, "Operación relizada con éxito");
            this.Nuevo();
            this.bindGrid();
            this.dgAlmacenes.setModel(modeloAlmacenes);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
        }
        
    }
    
    private void LlenarDatos(String[] datos){
        this.txtIDAlm.setText(datos[0]);
        this.txtNombreAlm.setText(datos[1]);
        this.txtDireccionAlm.setText(datos[2]);
    }
    
    private boolean ValidarVacios(){
        Component[] componentes = this.gbxDatos.getComponents();
        JTextField txt = new JTextField();
        
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField){
                txt = (JTextField)componentes[i];
                
                if (txt.getName() != "txtIDAlm"){
                    if (txt.getText().trim().length() == 0) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
    
    private void bindGrid(){
        try {
            modeloAlmacenes = new DefaultTableModel(null, this.getColumnas());
            AlmacenDAO data = new AlmacenDAO();
            CachedRowSetImpl crs = data.mostrar();
            Object datos[] = new Object[3];
            
            while (crs.next()){
                for (int i = 0; i < 3; i++){
                    datos[i] = crs.getObject(i+1);
                }   
                modeloAlmacenes.addRow(datos);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(frmAlmacenes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String[] getColumnas(){
        String columns[] = new String[]{
            "ID Almacen",
            "Nombre",
            "Dirección"
        };
        
        return columns;
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmAlmacenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlmacenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlmacenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlmacenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlmacenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAlmacen;
    private javax.swing.JButton btnGuardarAlmacen;
    private javax.swing.JButton btnModificarAlmacen;
    private javax.swing.JButton btnNuevoAlmacen;
    private javax.swing.JTable dgAlmacenes;
    private javax.swing.JPanel gbxAcciones;
    private javax.swing.JPanel gbxDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblIDAlm;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtDireccionAlm;
    private javax.swing.JTextField txtIDAlm;
    private javax.swing.JTextField txtNombreAlm;
    // End of variables declaration//GEN-END:variables
}