
package ventanaPrincipal.ventanasEmpleados;

import conexion.Conexion;
import java.awt.Color;

/**
 *
 * @author Daniel Felix
 */
public class PaneUpdateID extends javax.swing.JPanel {

    Color init = new Color(0,204,255);
    Color hover = new Color(51,102,255);
    public PaneUpdateID() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        paneIn = new javax.swing.JPanel();
        labelIn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Introduzca su ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        paneIn.setBackground(new java.awt.Color(0, 204, 255));

        labelIn.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        labelIn.setForeground(new java.awt.Color(0, 0, 0));
        labelIn.setText("      Buscar ");
        labelIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneInLayout = new javax.swing.GroupLayout(paneIn);
        paneIn.setLayout(paneInLayout);
        paneInLayout.setHorizontalGroup(
            paneInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIn, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        paneInLayout.setVerticalGroup(
            paneInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIn, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(407, 407, 407)
                .addComponent(paneIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(paneIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void labelInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInMouseClicked
        int id = Integer.valueOf(txtID.getText());
        FormUpdate fp = new FormUpdate(id);
        fp.setVisible(true);
        txtID.setText("");
    }//GEN-LAST:event_labelInMouseClicked

    private void labelInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInMouseEntered
        paneIn.setBackground(hover);
    }//GEN-LAST:event_labelInMouseEntered

    private void labelInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInMouseExited
        paneIn.setBackground(init);
    }//GEN-LAST:event_labelInMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelIn;
    private javax.swing.JPanel paneIn;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
