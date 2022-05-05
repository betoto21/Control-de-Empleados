package ventanaPrincipal.ventanasEmpleados;

import conexion.Conexion;
import java.awt.Color;

/**
 *
 * @author Daniel Felix
 */
public class PaneAdd extends javax.swing.JPanel {
   
    Color init = new Color(0,204,255);
    Color hover = new Color(51,102,255);
    
    public PaneAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJob = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        paneSelect = new javax.swing.JPanel();
        labelSelect = new javax.swing.JLabel();
        paneAdd = new javax.swing.JPanel();
        labelAdd = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(940, 530));

        labelIcon.setForeground(new java.awt.Color(0, 0, 0));
        labelIcon.setText("                Sin Imagen");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        txtJob.setForeground(new java.awt.Color(0, 0, 0));
        txtJob.setCaretColor(new java.awt.Color(255, 255, 255));
        txtJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Puesto:");

        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        paneSelect.setBackground(new java.awt.Color(0, 204, 255));

        labelSelect.setBackground(new java.awt.Color(0, 0, 0));
        labelSelect.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        labelSelect.setForeground(new java.awt.Color(0, 0, 0));
        labelSelect.setText(" Seleccionar Imagen");
        labelSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(labelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        paneSelectLayout.setVerticalGroup(
            paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        paneAdd.setBackground(new java.awt.Color(0, 204, 255));

        labelAdd.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        labelAdd.setForeground(new java.awt.Color(0, 0, 0));
        labelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_icon.png"))); // NOI18N
        labelAdd.setText("Agregar");
        labelAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneAddLayout = new javax.swing.GroupLayout(paneAdd);
        paneAdd.setLayout(paneAddLayout);
        paneAddLayout.setHorizontalGroup(
            paneAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        paneAddLayout.setVerticalGroup(
            paneAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(paneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(436, 436, 436)
                                .addComponent(paneAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(330, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(223, 223, 223)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(paneAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(528, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void labelSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSelectMouseClicked

    private void labelSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseEntered
        paneSelect.setBackground(hover);
    }//GEN-LAST:event_labelSelectMouseEntered

    private void labelSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSelectMouseExited
        paneSelect.setBackground(init);
    }//GEN-LAST:event_labelSelectMouseExited

    private void labelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseClicked
        String nombre = txtName.getText();
        String puesto = txtJob.getText();
        String imagen = " ";
        Conexion con = new Conexion();
        con.addEmpleados(nombre, puesto, imagen);
    }//GEN-LAST:event_labelAddMouseClicked

    private void labelAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseEntered
        paneAdd.setBackground(hover);
    }//GEN-LAST:event_labelAddMouseEntered

    private void labelAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseExited
        paneAdd.setBackground(init);
    }//GEN-LAST:event_labelAddMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelSelect;
    private javax.swing.JPanel paneAdd;
    private javax.swing.JPanel paneSelect;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
