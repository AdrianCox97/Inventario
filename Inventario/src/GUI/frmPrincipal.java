/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import Objetos.Imagen;

/**
 *
 * @author joses
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        cargarImagenes();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgCategorias = new javax.swing.JPanel();
        imgProductos = new javax.swing.JPanel();
        imgProveedores = new javax.swing.JPanel();
        imgAlmacenes = new javax.swing.JPanel();
        imgLogo = new javax.swing.JPanel();
        imgMovimientos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgCategorias.setToolTipText("Catálogo de Categorías");
        imgCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCategoriasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imgCategoriasLayout = new javax.swing.GroupLayout(imgCategorias);
        imgCategorias.setLayout(imgCategoriasLayout);
        imgCategoriasLayout.setHorizontalGroup(
            imgCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imgCategoriasLayout.setVerticalGroup(
            imgCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        imgProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgProductos.setToolTipText("Catálogo de Productos");
        imgProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgProductosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imgProductosLayout = new javax.swing.GroupLayout(imgProductos);
        imgProductos.setLayout(imgProductosLayout);
        imgProductosLayout.setHorizontalGroup(
            imgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgProductosLayout.setVerticalGroup(
            imgProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        imgProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgProveedores.setToolTipText("Catálogo de Proveedores");
        imgProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgProveedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imgProveedoresLayout = new javax.swing.GroupLayout(imgProveedores);
        imgProveedores.setLayout(imgProveedoresLayout);
        imgProveedoresLayout.setHorizontalGroup(
            imgProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgProveedoresLayout.setVerticalGroup(
            imgProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        imgAlmacenes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgAlmacenes.setToolTipText("Catálogo de Almacenes");
        imgAlmacenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAlmacenesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imgAlmacenesLayout = new javax.swing.GroupLayout(imgAlmacenes);
        imgAlmacenes.setLayout(imgAlmacenesLayout);
        imgAlmacenesLayout.setHorizontalGroup(
            imgAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgAlmacenesLayout.setVerticalGroup(
            imgAlmacenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        imgLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout imgLogoLayout = new javax.swing.GroupLayout(imgLogo);
        imgLogo.setLayout(imgLogoLayout);
        imgLogoLayout.setHorizontalGroup(
            imgLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imgLogoLayout.setVerticalGroup(
            imgLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        imgMovimientos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgMovimientos.setToolTipText("Registro de Movimientos");
        imgMovimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMovimientosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imgMovimientosLayout = new javax.swing.GroupLayout(imgMovimientos);
        imgMovimientos.setLayout(imgMovimientosLayout);
        imgMovimientosLayout.setHorizontalGroup(
            imgMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        imgMovimientosLayout.setVerticalGroup(
            imgMovimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setLabelFor(imgCategorias);
        jLabel1.setText("<html>\nCategorías de <br>\nProductos\n</html>");

        jLabel2.setLabelFor(imgProductos);
        jLabel2.setText("<html>\nCatálogo de <br>\nProductos\n</html>");

        jLabel3.setLabelFor(imgProveedores);
        jLabel3.setText("<html>\nCatálogo de <br>\nProveedores\n</html>");

        jLabel4.setLabelFor(imgAlmacenes);
        jLabel4.setText("<html>\nCatálogo de <br>\nAlmacenes\n</html>");

        jLabel5.setLabelFor(imgMovimientos);
        jLabel5.setText("<html>\nRegistros de <br>\nMovimientos\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imgProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgCategorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(imgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(imgAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(imgMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgAlmacenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCategoriasMouseClicked
        new frmCategorias().setVisible(true);
    }//GEN-LAST:event_imgCategoriasMouseClicked

    private void imgProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProductosMouseClicked
        new frmProductos().setVisible(true);
    }//GEN-LAST:event_imgProductosMouseClicked

    private void imgProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProveedoresMouseClicked
        new frmProveedores().setVisible(true);
    }//GEN-LAST:event_imgProveedoresMouseClicked

    private void imgAlmacenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAlmacenesMouseClicked
        new frmAlmacenes().setVisible(true);
    }//GEN-LAST:event_imgAlmacenesMouseClicked

    private void imgMovimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMovimientosMouseClicked
        new frmMovimientos().setVisible(true);
    }//GEN-LAST:event_imgMovimientosMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    
    private void cargarImagenes(){
        Imagen imageLogo = new Imagen(262, 70, "/Reportes/Walmart_logo.png");
        imgLogo.add(imageLogo);
        imgLogo.repaint();
        
        Imagen imageCategorias = new Imagen(104, 104, "/Recursos/categorias.jpg");
        imgCategorias.add(imageCategorias);
        imgCategorias.repaint();
        
        Imagen imageProductos = new Imagen(104, 104, "/Recursos/Productos.jpg");
        imgProductos.add(imageProductos);
        imgProductos.repaint();
        
        Imagen imageProveedores = new Imagen(104, 104, "/Recursos/proveedores.png");
        imgProveedores.add(imageProveedores);
        imgProveedores.repaint();
        
        Imagen imageAlmacenes = new Imagen(104, 104, "/Recursos/Almacenes.png");
        imgAlmacenes.add(imageAlmacenes);
        imgAlmacenes.repaint();
        
        Imagen imageMovimientos = new Imagen(104, 104, "/Recursos/bitacora.png");
        imgMovimientos.add(imageMovimientos);
        imgMovimientos.repaint();
    }
    
//    public class Imagen extends javax.swing.JPanel {
//            private String url;
//            public Imagen(int ancho, int alto, String urlImg) {
//                this.url = urlImg;
//                this.setSize(ancho, alto); //se selecciona el tamaño del panel
//            }
//
//            //Se crea un método cuyo parámetro debe ser un objeto Graphics
//
//            public void paint(Graphics grafico) {
//            Dimension height = getSize();
//
//            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
//
//            ImageIcon Img = new ImageIcon(getClass().getResource(url)); 
//
//            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
//
//            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
//
//            setOpaque(false);
//            super.paintComponent(grafico);
//            }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imgAlmacenes;
    private javax.swing.JPanel imgCategorias;
    private javax.swing.JPanel imgLogo;
    private javax.swing.JPanel imgMovimientos;
    private javax.swing.JPanel imgProductos;
    private javax.swing.JPanel imgProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}