package ventanaPrincipal.ventanasEmpleados;

import com.google.gson.Gson;
import conexion.Conexion;
import conexion.Empleados;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Daniel Felix
 */
public class FormUpdate extends javax.swing.JFrame {

    Color init = new Color(0,204,255);
    Color hover = new Color(51,102,255);
    String cad = "";
    JFileChooser chooser = new JFileChooser();
    public FormUpdate() {
        initComponents();
    }
    public FormUpdate(int id){
        initComponents();
        fillContent(id);
        this.setLocationRelativeTo(null);
    }

    private void fillContent(int id){
        Conexion con = new Conexion();
        String[] arr = con.getEmpleados();
        for(String da : arr){
            Gson g = new Gson();
            Empleados em = g.fromJson(da, Empleados.class);
            if(id == em.Id){
                labelID.setText(String.valueOf(em.Id));
                txtNombre.setText(em.Nombre);
                txtPuesto.setText(em.Puesto);
                JFileChooser chooser = new JFileChooser();
                String cad = em.Foto;
                System.out.println(cad);
                ImageIcon icon = new ImageIcon(cad);
                Image img = icon.getImage();
                Image imgscale = img.getScaledInstance(labelIcon.getWidth(), labelIcon.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon scaledimage = new ImageIcon(imgscale);
                labelIcon.setIcon(scaledimage);
            }
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPuesto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        labelIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        paneCancel2 = new javax.swing.JPanel();
        labelCancel2 = new javax.swing.JLabel();
        paneUpdate = new javax.swing.JPanel();
        labelUpdate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paneSelect = new javax.swing.JPanel();
        labelSelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        txtPuesto.setText("jTextField2");

        txtNombre.setText("jTextField1");

        labelIcon.setText("                   Sin Imagen");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        labelID.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelID.setForeground(new java.awt.Color(0, 0, 0));
        labelID.setText("jLabel3");

        paneCancel2.setBackground(new java.awt.Color(0, 204, 255));
        paneCancel2.setForeground(new java.awt.Color(0, 204, 255));

        labelCancel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        labelCancel2.setForeground(new java.awt.Color(0, 0, 0));
        labelCancel2.setText("    Cancelar");
        labelCancel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelCancel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCancel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCancel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCancel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneCancel2Layout = new javax.swing.GroupLayout(paneCancel2);
        paneCancel2.setLayout(paneCancel2Layout);
        paneCancel2Layout.setHorizontalGroup(
            paneCancel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCancel2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );
        paneCancel2Layout.setVerticalGroup(
            paneCancel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCancel2Layout.createSequentialGroup()
                .addComponent(labelCancel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        paneUpdate.setBackground(new java.awt.Color(0, 204, 255));

        labelUpdate.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        labelUpdate.setForeground(new java.awt.Color(0, 0, 0));
        labelUpdate.setText("   Actualizar");
        labelUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneUpdateLayout = new javax.swing.GroupLayout(paneUpdate);
        paneUpdate.setLayout(paneUpdateLayout);
        paneUpdateLayout.setHorizontalGroup(
            paneUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        paneUpdateLayout.setVerticalGroup(
            paneUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        jLabel4.setBackground(new java.awt.Color(0, 204, 255));
        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Puesto:");

        paneSelect.setBackground(new java.awt.Color(0, 204, 255));

        labelSelect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSelect.setForeground(new java.awt.Color(0, 0, 0));
        labelSelect.setText("Seleccionar Nueva Imagen");
        labelSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSelectMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneSelectLayout = new javax.swing.GroupLayout(paneSelect);
        paneSelect.setLayout(paneSelectLayout);
        paneSelectLayout.setHorizontalGroup(
            paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneSelectLayout.setVerticalGroup(
            paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(paneUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(paneCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(paneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneCancel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseClicked
        Conexion con = new Conexion();
        int id = Integer.valueOf(labelID.getText());
        String nombre = txtNombre.getText();
        String puesto = txtPuesto.getText();
        String dir = "imagenes";
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdir();
        }
        File src = new File(cad);
        File destino = new File(dir + "/" + txtNombre.getText()+".jpg");
        System.out.println(destino.toString());
        String imagen = destino.getPath();
        try {
            Files.copy(src.toPath(), destino.toPath());
            
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        con.updateEmpleados(id, nombre, puesto, imagen);
        this.dispose();
    }//GEN-LAST:event_labelUpdateMouseClicked

    private void labelUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseExited
        paneUpdate.setBackground(init);
    }//GEN-LAST:event_labelUpdateMouseExited

    private void labelUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseEntered
        paneUpdate.setBackground(hover);
    }//GEN-LAST:event_labelUpdateMouseEntered

    private void labelCancel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCancel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_labelCancel2MouseClicked

    private void labelCancel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCancel2MouseEntered
        paneCancel2.setBackground(hover);
    }//GEN-LAST:event_labelCancel2MouseEntered

    private void labelCancel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCancel2MouseExited
        paneCancel2.setBackground(init);
    }//GEN-LAST:event_labelCancel2MouseExited

    private void labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseClicked
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG PNG GIF Images", "jpg", "jpeg", "png", "gif");
        chooser.setFileFilter(filtro);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            cad = chooser.getCurrentDirectory() + "/" + chooser.getSelectedFile().getName();
            System.out.println(cad);
            ImageIcon icon = new ImageIcon(cad);
            Image img = icon.getImage();
            Image imgscale = img.getScaledInstance(labelIcon.getWidth(), labelIcon.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledimage = new ImageIcon(imgscale);
            labelIcon.setIcon(scaledimage);
        }
    }//GEN-LAST:event_labelSelectMouseClicked

    private void labelSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseEntered
        paneSelect.setBackground(hover);
    }//GEN-LAST:event_labelSelectMouseEntered

    private void labelSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseExited
        paneSelect.setBackground(init);
    }//GEN-LAST:event_labelSelectMouseExited

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
            java.util.logging.Logger.getLogger(FormUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelCancel2;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelSelect;
    private javax.swing.JLabel labelUpdate;
    private javax.swing.JPanel paneCancel2;
    private javax.swing.JPanel paneSelect;
    private javax.swing.JPanel paneUpdate;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
