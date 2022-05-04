/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanaPrincipal;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author betoto21
 */
public class FrameInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrameInicio
     */
    Color initMenu = new Color(51,102,255);
    Color hoverMenu = new Color(51,168,255);
    int x,y;
    public FrameInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The constent of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paneMove = new javax.swing.JPanel();
        paneContent = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();
        paneLateral = new javax.swing.JPanel();
        paneInicio = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        paneSearch = new javax.swing.JPanel();
        labelSearch = new javax.swing.JLabel();
        paneAdd = new javax.swing.JPanel();
        labelAdd = new javax.swing.JLabel();
        paneUpdate = new javax.swing.JPanel();
        labelUpdate = new javax.swing.JLabel();
        paneDelete = new javax.swing.JPanel();
        labelDelete = new javax.swing.JLabel();
        paneShow = new javax.swing.JPanel();
        labelShow = new javax.swing.JLabel();
        paneLogOut = new javax.swing.JPanel();
        labelLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backGround.setBackground(new java.awt.Color(255, 255, 255));
        backGround.setForeground(new java.awt.Color(255, 255, 255));
        backGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inicio_icon.png"))); // NOI18N
        jLabel1.setText("BIENVENIDO");
        backGround.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 170));

        paneMove.setBackground(new java.awt.Color(255, 255, 255));
        paneMove.setForeground(new java.awt.Color(255, 255, 255));
        paneMove.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        paneMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paneMoveMouseDragged(evt);
            }
        });
        paneMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneMoveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paneMoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout paneMoveLayout = new javax.swing.GroupLayout(paneMove);
        paneMove.setLayout(paneMoveLayout);
        paneMoveLayout.setHorizontalGroup(
            paneMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        paneMoveLayout.setVerticalGroup(
            paneMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        backGround.add(paneMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1010, 40));

        javax.swing.GroupLayout paneContentLayout = new javax.swing.GroupLayout(paneContent);
        paneContent.setLayout(paneContentLayout);
        paneContentLayout.setHorizontalGroup(
            paneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        paneContentLayout.setVerticalGroup(
            paneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        backGround.add(paneContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 940, 530));

        panelExit.setBackground(new java.awt.Color(255, 255, 255));
        panelExit.setForeground(new java.awt.Color(255, 255, 255));
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
        });

        labelExit.setBackground(new java.awt.Color(255, 255, 255));
        labelExit.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        labelExit.setForeground(new java.awt.Color(0, 0, 0));
        labelExit.setText("  X");
        labelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backGround.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 70, 50));

        paneLateral.setBackground(new java.awt.Color(51, 102, 255));
        paneLateral.setForeground(new java.awt.Color(51, 102, 255));

        paneInicio.setBackground(new java.awt.Color(51, 102, 255));

        labelInicio.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home_icon.png"))); // NOI18N
        labelInicio.setText("          INICIO");
        labelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneInicioLayout = new javax.swing.GroupLayout(paneInicio);
        paneInicio.setLayout(paneInicioLayout);
        paneInicioLayout.setHorizontalGroup(
            paneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(paneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneInicioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        paneInicioLayout.setVerticalGroup(
            paneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(paneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneInicioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        paneSearch.setBackground(new java.awt.Color(51, 102, 255));

        labelSearch.setBackground(new java.awt.Color(51, 102, 255));
        labelSearch.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchEmployee_icon.png"))); // NOI18N
        labelSearch.setText("   ENTRADA/SALIDA");
        labelSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneSearchLayout = new javax.swing.GroupLayout(paneSearch);
        paneSearch.setLayout(paneSearchLayout);
        paneSearchLayout.setHorizontalGroup(
            paneSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(paneSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneSearchLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        paneSearchLayout.setVerticalGroup(
            paneSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(paneSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneSearchLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        paneAdd.setBackground(new java.awt.Color(51, 102, 255));

        labelAdd.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addEmployee_icon.png"))); // NOI18N
        labelAdd.setText("   AÑADIR EMPLEADO");
        labelAdd.setAlignmentY(0.0F);
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
            .addComponent(labelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneAddLayout.setVerticalGroup(
            paneAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        paneUpdate.setBackground(new java.awt.Color(51, 102, 255));

        labelUpdate.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updateEmployee_icon.png"))); // NOI18N
        labelUpdate.setText(" MODIFICAR EMPLEADO");
        labelUpdate.setAlignmentY(0.0F);
        labelUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(labelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneUpdateLayout.setVerticalGroup(
            paneUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        paneDelete.setBackground(new java.awt.Color(51, 102, 255));

        labelDelete.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/removeEmployee_icon.png"))); // NOI18N
        labelDelete.setText(" ELIMINAR EMPLEADO");
        labelDelete.setAlignmentY(0.0F);
        labelDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneDeleteLayout = new javax.swing.GroupLayout(paneDelete);
        paneDelete.setLayout(paneDeleteLayout);
        paneDeleteLayout.setHorizontalGroup(
            paneDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneDeleteLayout.setVerticalGroup(
            paneDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        paneShow.setBackground(new java.awt.Color(51, 102, 255));

        labelShow.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/showAllEmployee_icon.png"))); // NOI18N
        labelShow.setText(" MOSTRAR EMPLEADOS");
        labelShow.setAlignmentY(0.0F);
        labelShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelShowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelShowMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneShowLayout = new javax.swing.GroupLayout(paneShow);
        paneShow.setLayout(paneShowLayout);
        paneShowLayout.setHorizontalGroup(
            paneShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelShow, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        paneShowLayout.setVerticalGroup(
            paneShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        paneLogOut.setBackground(new java.awt.Color(51, 102, 255));

        labelLogOut.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        labelLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_icon.png"))); // NOI18N
        labelLogOut.setText("SALIR");
        labelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLogOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout paneLogOutLayout = new javax.swing.GroupLayout(paneLogOut);
        paneLogOut.setLayout(paneLogOutLayout);
        paneLogOutLayout.setHorizontalGroup(
            paneLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLogOutLayout.createSequentialGroup()
                .addComponent(labelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneLogOutLayout.setVerticalGroup(
            paneLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLogOutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelLogOut))
        );

        javax.swing.GroupLayout paneLateralLayout = new javax.swing.GroupLayout(paneLateral);
        paneLateral.setLayout(paneLateralLayout);
        paneLateralLayout.setHorizontalGroup(
            paneLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLateralLayout.createSequentialGroup()
                .addGroup(paneLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paneSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
            .addGroup(paneLateralLayout.createSequentialGroup()
                .addComponent(paneLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneLateralLayout.setVerticalGroup(
            paneLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLateralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(paneInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(paneLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backGround.add(paneLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 350, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backGround, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelExitMouseClicked

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        labelExit.setBackground(Color.red);
        panelExit.setBackground(Color.red);
        labelExit.setForeground(Color.white);
        
    }//GEN-LAST:event_labelExitMouseEntered

    private void paneMoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneMoveMouseClicked
        
    }//GEN-LAST:event_paneMoveMouseClicked

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        
    }//GEN-LAST:event_panelExitMouseClicked

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        labelExit.setBackground(Color.WHITE);
        panelExit.setBackground(Color.WHITE);
        labelExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_labelExitMouseExited

    private void labelAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseExited
        paneAdd.setBackground(initMenu);
    }//GEN-LAST:event_labelAddMouseExited

    private void labelAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseEntered
        paneAdd.setBackground(hoverMenu);
    }//GEN-LAST:event_labelAddMouseEntered

    private void labelAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddMouseClicked

    private void labelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSearchMouseExited
        paneSearch.setBackground(initMenu);
    }//GEN-LAST:event_labelSearchMouseExited

    private void labelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSearchMouseEntered
        paneSearch.setBackground(hoverMenu);
    }//GEN-LAST:event_labelSearchMouseEntered

    private void labelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSearchMouseClicked

    private void labelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseExited
        paneInicio.setBackground(initMenu);
    }//GEN-LAST:event_labelInicioMouseExited

    private void labelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInicioMouseEntered
        paneInicio.setBackground(hoverMenu);
    }//GEN-LAST:event_labelInicioMouseEntered

    private void labelUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdateMouseClicked

    private void labelUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseEntered
        paneUpdate.setBackground(hoverMenu);
    }//GEN-LAST:event_labelUpdateMouseEntered

    private void labelUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdateMouseExited
        paneUpdate.setBackground(initMenu);
    }//GEN-LAST:event_labelUpdateMouseExited

    private void labelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeleteMouseClicked

    private void labelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseEntered
        paneDelete.setBackground(hoverMenu);
    }//GEN-LAST:event_labelDeleteMouseEntered

    private void labelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseExited
        paneDelete.setBackground(initMenu);
    }//GEN-LAST:event_labelDeleteMouseExited

    private void labelShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelShowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelShowMouseClicked

    private void labelShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelShowMouseEntered
        paneShow.setBackground(hoverMenu);
    }//GEN-LAST:event_labelShowMouseEntered

    private void labelShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelShowMouseExited
        paneShow.setBackground(initMenu);
    }//GEN-LAST:event_labelShowMouseExited

    private void labelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogOutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelLogOutMouseClicked

    private void labelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogOutMouseEntered
        paneLogOut.setBackground(hoverMenu);
    }//GEN-LAST:event_labelLogOutMouseEntered

    private void labelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogOutMouseExited
        paneLogOut.setBackground(initMenu);
    }//GEN-LAST:event_labelLogOutMouseExited

    private void paneMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneMoveMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_paneMoveMousePressed

    private void paneMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneMoveMouseDragged
        int xs = evt.getXOnScreen();
        int ys = evt.getYOnScreen();
        this.setLocation(xs - x, ys - y);
    }//GEN-LAST:event_paneMoveMouseDragged

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
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelDelete;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelLogOut;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JLabel labelShow;
    private javax.swing.JLabel labelUpdate;
    private javax.swing.JPanel paneAdd;
    private javax.swing.JPanel paneContent;
    private javax.swing.JPanel paneDelete;
    private javax.swing.JPanel paneInicio;
    private javax.swing.JPanel paneLateral;
    private javax.swing.JPanel paneLogOut;
    private javax.swing.JPanel paneMove;
    private javax.swing.JPanel paneSearch;
    private javax.swing.JPanel paneShow;
    private javax.swing.JPanel paneUpdate;
    private javax.swing.JPanel panelExit;
    // End of variables declaration//GEN-END:variables
}
