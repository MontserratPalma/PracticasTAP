/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Practicas;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monts
 */
public class Practica7 extends javax.swing.JFrame {

    Connection con = null;
    DefaultTableModel modelo = null;

    /**
     * Creates new form Practica7
     */
    public Practica7() throws SQLException {
        initComponents();

        modelo = (DefaultTableModel) this.jTable1.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }

        this.selectBD();

        this.jTable1.getSelectionModel().addListSelectionListener(
            new ListSelectionListener(){
                @Override
                public void valueChanged(ListSelectionEvent e){
                    int nId = 0;
                    int nRow = jTable1.getSelectedRow();

                    String sSisOper = (String) jTable1.getModel().getValueAt(nRow, 1);
                    if(sSisOper.equals("Windows")){
                        jRadioButton1.setSelected(true);
                    }
                    if(sSisOper.equals("Linux")){
                        jRadioButton2.setSelected(true);
                    }
                    if(sSisOper.equals("Linux")){
                        jRadioButton3.setSelected(true);
                    }
                    
                    if(jTable1.getModel().getValueAt(nRow, 2).equals("S")){
                        jCheckBox1.setSelected(true);
                    }
                    else{
                        jCheckBox1.setSelected(false);
                    }
                    
                    if(jTable1.getModel().getValueAt(nRow, 3).equals("S")){
                        jCheckBox2.setSelected(true);
                    }
                    else{
                        jCheckBox2.setSelected(false);
                    }
                    if(jTable1.getModel().getValueAt(nRow, 4).equals("S")){
                        jCheckBox3.setSelected(true);
                    }
                    else{
                        jCheckBox3.setSelected(false);
                    }
                    jSlider1.setValue((int) jTable1.getModel().getValueAt(nRow, 1));

                }
            }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        horas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Sistema Operativo", "Programacion", "Diseno", "Administracion", "Horas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Windows");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Linux");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Mac");

        jCheckBox1.setText("Programacion");

        jCheckBox2.setText("Diseno Grafico");

        jCheckBox3.setText("Administracion");

        horas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horas.setText("0");
        horas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("  Horas que dedicas en el ordenador");

        jSlider1.setMaximum(16);
        jSlider1.setValue(8);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Insertar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jCheckBox3))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(horas))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBox1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox3))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        this.horas.setText(Integer.toString(this.jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.guardarArchivo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.selectBD();
        } catch (SQLException ex) {
            Logger.getLogger(Practica7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        //Windows,,P,D,A,8
        String sSisOper = "Windows";
        String sProgra = "N";
        String sDiseno = "N";
        String sAdmon = "N";
        String sHoras = "N";

        if (this.jRadioButton2.isSelected()) {
            sSisOper = "Linux";
        }

        if (this.jRadioButton3.isSelected()) {
            sSisOper = "Mac";
        }

        if (this.jCheckBox1.isSelected()) {
            sProgra = "S";
        }
        if (this.jCheckBox2.isSelected()) {
            sDiseno = "S";
        }
        if (this.jCheckBox3.isSelected()) {
            sAdmon = "S";
        }
        sHoras = Integer.toString(this.jSlider1.getValue());

        this.insertarBD(sSisOper, sProgra, sDiseno, sAdmon, this.jSlider1.getValue());

        try {
            this.selectBD();
        } catch (SQLException ex) {
            Logger.getLogger(Practica7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:     
        int nId = 0;
        int nrow = this.jTable1.getSelectedRow();

        if (nrow < 0) {

            JOptionPane.showMessageDialog(this, "Seleccione un registro", "Sugerencia", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        nId = (int) this.jTable1.getModel().getValueAt(nrow, 0);
        this.eliminarrBD(nId);
        try {
            this.selectBD();
        } catch (SQLException ex) {
            Logger.getLogger(Practica7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Practica7().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Practica7.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel horas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void guardarArchivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void selectBD() throws SQLException {

        Statement stmt;
        ResultSet rset;
        String sQuery;

        sQuery = String.format("SELECT id,sSisOper,cProgra,cDiseno,cAdmon,iHoras FROM respuestas");

        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta?"
                        + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=encuesta_user&password=encuesta_pass");
                stmt = con.createStatement();
                rset = stmt.executeQuery(sQuery);
                this.modelo.setNumRows(0);
                while (rset.next()) {
                    this.modelo.addRow(new Object[]{rset.getInt("id"), rset.getString("sSisOper"),
                        rset.getString("sProgra"), rset.getString("sDiseno"),
                        rset.getString("sDiseno"), rset.getString("sAdmon"),
                        rset.getInt("Horas"), 0});
                    System.out.println(rset.getString("sSisOper"));
                }
                con.close();
                con = null;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    private void insertarBD(String sSisOper, String sProgra, String sDiseno, String sAdmon, int Horas) {

        Statement stmt;
        String sInsert;

        sInsert = String.format("INSERT INTO respuestas (sSisOper,cProgra,cDiseno,cAdmon,iHoras) VALUES ('%s','%s','%s','%s',%d);", sSisOper, sProgra, sDiseno, sAdmon, Horas);

        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta?"
                        + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=encuesta_user&password=encuesta_pass");
                stmt = con.createStatement();
                stmt.execute(sInsert);

                con.close();
                con = null;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }

    private void eliminarrBD(int id) {

        Statement stmt;
        String sDelete;

        sDelete = String.format("DELETE FROM respuestas WHERE id = %d", id);

        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta?"
                        + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=encuesta_user&password=encuesta_pass");
                stmt = con.createStatement();
                stmt.execute(sDelete);

                con.close();
                con = null;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
}
