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
public class Addteacher extends javax.swing.JFrame {

    /** Creates new form NewJFrame1 */
    public Addteacher() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new java.awt.TextField();
        salary = new java.awt.TextField();
        grad_deg = new java.awt.TextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        grad_year = new java.awt.TextField();
        label1 = new java.awt.Label();
        year_exp = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        age = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        password = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);
        getContentPane().add(name);
        name.setBounds(187, 35, 195, 20);
        getContentPane().add(salary);
        salary.setBounds(187, 113, 195, 20);
        getContentPane().add(grad_deg);
        grad_deg.setBounds(187, 148, 195, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arabic", "English", "History", "Social", "Science", "Math" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(171, 264, 97, 20);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Graduation_Degree");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 151, 128, 17);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Graduation_Year");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(35, 186, 119, 17);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Years_oF_Experince");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(35, 224, 124, 17);

        grad_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grad_yearActionPerformed(evt);
            }
        });
        getContentPane().add(grad_year);
        grad_year.setBounds(187, 186, 97, 20);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Supject He Teaches");
        getContentPane().add(label1);
        label1.setBounds(21, 264, 140, 21);
        getContentPane().add(year_exp);
        year_exp.setBounds(187, 224, 97, 20);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 12, 48, 17);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 40, 48, 17);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Age");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(44, 75, 48, 17);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salary");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(44, 113, 48, 17);
        getContentPane().add(id);
        id.setBounds(187, 5, 65, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/ok.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(111, 413, 97, 33);
        getContentPane().add(age);
        age.setBounds(187, 73, 65, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Password ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(57, 370, 62, 17);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(174, 370, 128, 20);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Number of class");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(33, 314, 110, 17);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/1", "2/1", "1/2", "2/2", " " }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(171, 311, 41, 20);

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
        jButton2.setBounds(256, 413, 117, 33);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/student and teacher.jpg"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(900, 600));
        jLabel10.setMinimumSize(new java.awt.Dimension(900, 600));
        jLabel10.setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grad_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grad_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grad_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    boolean check;

        Teacher te=new Teacher(Integer.valueOf(id.getText()),name.getText(),Integer.valueOf(age.getText()),grad_deg.getText(),Integer.valueOf(salary.getText()),grad_year.getText(),Integer.valueOf(year_exp.getText()),(String)jComboBox1.getSelectedItem());
        te.pass=password.getText();
        if(jComboBox2.getSelectedItem().equals("1/1"))
        te.setClass_no(1);
        else if(jComboBox2.getSelectedItem().equals("1/2"))
        te.setClass_no(2);
        else  if(jComboBox2.getSelectedItem().equals("2/1"))
        te.setClass_no(3);
        else if(jComboBox2.getSelectedItem().equals("2/2"))
        te.setClass_no(4);
        check=te.CheckTeacher_Class(te.getSudject_He_Teaches(), te.getClass_no());
        if(check==false)
            JOptionPane.showMessageDialog(this, "this class include teacher to taech this supject");
        else{
        te.Add();
        te.SoperVisor();
         JOptionPane.showMessageDialog(this," Done ");
         id.setText("");
         name.setText("");
         age.setText("");
         grad_deg.setText("");
         year_exp.setText("");
         password.setText("");
         salary.setText("");
         grad_year.setText("");
        }
}
catch(Exception ex){
JOptionPane.showMessageDialog(this, "did not inserted ");
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          teacher__form tf=new teacher__form();
        tf.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Addteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addteacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Addteacher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField age;
    private java.awt.TextField grad_deg;
    private java.awt.TextField grad_year;
    private java.awt.TextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    private java.awt.TextField name;
    private java.awt.TextField password;
    private java.awt.TextField salary;
    private java.awt.TextField year_exp;
    // End of variables declaration//GEN-END:variables

}