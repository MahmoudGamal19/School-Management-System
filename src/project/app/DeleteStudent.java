/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DeleteStudent extends javax.swing.JFrame {

    /**
     * Creates new form DeleteStudent
     */
    public DeleteStudent() {
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

        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/Close-icon.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 240, 117, 40);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ID");
        getContentPane().add(label1);
        label1.setBounds(55, 21, 22, 28);
        getContentPane().add(textField1);
        textField1.setBounds(160, 29, 118, 20);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(77, 82, 0, 0);

        label4.setBackground(new java.awt.Color(0, 0, 0));
        label4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("academic_year");
        getContentPane().add(label4);
        label4.setBounds(26, 92, 105, 23);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("class");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(52, 166, 60, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frist Year", "Scound Year", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(199, 95, 85, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(199, 163, 31, 20);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 240, 117, 30);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/student and teacher.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(900, 600));
        jLabel4.setMinimumSize(new java.awt.Dimension(900, 600));
        jLabel4.setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
        int id_class = 0;
        if(jComboBox2.getSelectedItem().equals("1")){
        id_class=1;
        }
         if(jComboBox2.getSelectedItem().equals("2")){
        id_class=2;
        }
             Student te=new Student();
             te.setAcademic_year((String) jComboBox1.getSelectedItem());
             te.setClass_no(id_class);
             te.setId(Integer.valueOf(textField1.getText()));
            te.Remove();
         JOptionPane.showMessageDialog(this, " Done");   
         textField1.setText("");
}
catch(Exception ex){
JOptionPane.showMessageDialog(this, "Did Not Done");
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Student__form sf=new Student__form();
sf.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
