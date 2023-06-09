package Practicas;

//5 imitador
 // @author Monts
 
import javax.swing.ButtonGroup;
public class Practica5 extends javax.swing.JFrame {

    public Practica5() {
        initComponents();
        ButtonGroup btg1=new ButtonGroup();
         
        btg1.add(rdb1Original);
        btg1.add(rdb2Original);
        btg1.add(rdb3Original);
         
        ButtonGroup btg2=new ButtonGroup();
         
        btg2.add(rdb1Imitacion);
        btg2.add(rdb2Imitacion);
        btg2.add(rdb3Imitacion);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rdb1Original = new javax.swing.JRadioButton();
        rdb2Original = new javax.swing.JRadioButton();
        rdb3Original = new javax.swing.JRadioButton();
        ckb1Original = new javax.swing.JCheckBox();
        ckb3Original = new javax.swing.JCheckBox();
        ckb2Original = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        cmbOriginal = new javax.swing.JComboBox<>();
        spnOriginal = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        txtImitacion = new javax.swing.JTextField();
        cmbImitacion = new javax.swing.JComboBox<>();
        spnImitacion = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        rdb1Imitacion = new javax.swing.JRadioButton();
        rdb2Imitacion = new javax.swing.JRadioButton();
        rdb3Imitacion = new javax.swing.JRadioButton();
        ckb1Imitacion = new javax.swing.JCheckBox();
        ckb3Imitacion = new javax.swing.JCheckBox();
        ckb2Imitacion = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Original");

        rdb1Original.setSelected(true);
        rdb1Original.setText("Opcion 1");
        rdb1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1OriginalActionPerformed(evt);
            }
        });

        rdb2Original.setText("Opcion 2");
        rdb2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2OriginalActionPerformed(evt);
            }
        });

        rdb3Original.setText("Opcion 3");
        rdb3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3OriginalActionPerformed(evt);
            }
        });

        ckb1Original.setText("Opcion 4");
        ckb1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb1OriginalActionPerformed(evt);
            }
        });

        ckb3Original.setText("Opcion 6");
        ckb3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb3OriginalActionPerformed(evt);
            }
        });

        ckb2Original.setText("Opcion 5");
        ckb2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb2OriginalActionPerformed(evt);
            }
        });

        txtOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOriginalKeyReleased(evt);
            }
        });

        cmbOriginal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOriginalItemStateChanged(evt);
            }
        });

        spnOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnOriginalStateChanged(evt);
            }
        });

        txtImitacion.setEnabled(false);

        cmbImitacion.setEnabled(false);

        spnImitacion.setEnabled(false);

        jLabel2.setText("Espejo");

        rdb1Imitacion.setSelected(true);
        rdb1Imitacion.setText("Opcion 1");
        rdb1Imitacion.setEnabled(false);

        rdb2Imitacion.setText("Opcion 2");
        rdb2Imitacion.setEnabled(false);

        rdb3Imitacion.setText("Opcion 3");
        rdb3Imitacion.setEnabled(false);

        ckb1Imitacion.setText("Opcion 4");
        ckb1Imitacion.setEnabled(false);

        ckb3Imitacion.setText("Opcion 6");
        ckb3Imitacion.setEnabled(false);

        ckb2Imitacion.setText("Opcion 5");
        ckb2Imitacion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb1Original)
                            .addComponent(rdb2Original)
                            .addComponent(rdb3Original))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb1Original)
                            .addComponent(ckb2Original)
                            .addComponent(ckb3Original))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOriginal)
                            .addComponent(cmbOriginal, 0, 75, Short.MAX_VALUE)
                            .addComponent(spnOriginal))))
                .addGap(44, 44, 44))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdb1Imitacion)
                            .addComponent(rdb2Imitacion)
                            .addComponent(rdb3Imitacion))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb1Imitacion)
                            .addComponent(ckb2Imitacion)
                            .addComponent(ckb3Imitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbImitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnImitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb1Original)
                    .addComponent(ckb1Original)
                    .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb2Original)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb3Original))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb2Original)
                            .addComponent(cmbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb3Original)
                            .addComponent(spnOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb1Imitacion)
                            .addComponent(ckb1Imitacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb2Imitacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb3Imitacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb2Imitacion)
                            .addComponent(cmbImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb3Imitacion)
                            .addComponent(spnImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1OriginalActionPerformed
        rdb1Imitacion.setSelected(true);
    }//GEN-LAST:event_rdb1OriginalActionPerformed

    private void rdb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2OriginalActionPerformed
        rdb2Imitacion.setSelected(true);
    }//GEN-LAST:event_rdb2OriginalActionPerformed

    private void rdb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3OriginalActionPerformed
        rdb3Imitacion.setSelected(true);
    }//GEN-LAST:event_rdb3OriginalActionPerformed

    private void ckb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb1OriginalActionPerformed
        ckb1Imitacion.setSelected(ckb1Original.isSelected());
    }//GEN-LAST:event_ckb1OriginalActionPerformed

    private void ckb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb2OriginalActionPerformed
        ckb2Imitacion.setSelected(ckb2Original.isSelected());
    }//GEN-LAST:event_ckb2OriginalActionPerformed

    private void ckb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb3OriginalActionPerformed
        ckb3Imitacion.setSelected(ckb3Original.isSelected());
    }//GEN-LAST:event_ckb3OriginalActionPerformed

    private void cmbOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOriginalItemStateChanged
        cmbImitacion.setSelectedIndex(cmbOriginal.getSelectedIndex());
    }//GEN-LAST:event_cmbOriginalItemStateChanged

    private void spnOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnOriginalStateChanged
        spnImitacion.setValue((Integer)spnOriginal.getValue());
    }//GEN-LAST:event_spnOriginalStateChanged

    private void txtOriginalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyReleased
        this.txtImitacion.setText(this.txtOriginal.getText());
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.cmbImitacion.addItem(this.txtOriginal.getText());
            this.cmbOriginal.addItem(this.txtOriginal.getText());
    }//GEN-LAST:event_txtOriginalKeyReleased

    
   // public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ckb1Imitacion;
    private javax.swing.JCheckBox ckb1Original;
    private javax.swing.JCheckBox ckb2Imitacion;
    private javax.swing.JCheckBox ckb2Original;
    private javax.swing.JCheckBox ckb3Imitacion;
    private javax.swing.JCheckBox ckb3Original;
    private javax.swing.JComboBox<String> cmbImitacion;
    private javax.swing.JComboBox<String> cmbOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdb1Imitacion;
    private javax.swing.JRadioButton rdb1Original;
    private javax.swing.JRadioButton rdb2Imitacion;
    private javax.swing.JRadioButton rdb2Original;
    private javax.swing.JRadioButton rdb3Imitacion;
    private javax.swing.JRadioButton rdb3Original;
    private javax.swing.JSpinner spnImitacion;
    private javax.swing.JSpinner spnOriginal;
    private javax.swing.JTextField txtImitacion;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
