/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.app;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class SetDegrees extends javax.swing.JFrame {
public  int id;
    /**
     * Creates new form SetDegrees
     */
    public SetDegrees(int id) {
        initComponents();
        this.id=id;
    }

    private SetDegrees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // private SetDegrees() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        degree = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setMaximumSize(new java.awt.Dimension(900, 600));
        jLabel3.setMinimumSize(new java.awt.Dimension(900, 600));
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 140, 128, 29);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(36, 94, 111, 30);

        degree.setBackground(new java.awt.Color(0, 0, 0));
        degree.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(degree);
        degree.setBounds(36, 150, 111, 30);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Set Student ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(36, 69, 92, 19);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setText("Set Degree ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 125, 76, 19);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Supject Degree"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 187, 850, 202);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(427, 11, 147, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/app/pics/books.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 850, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
       Teacher te=new Teacher();
     Student st=new Student();
     int Degree=0;
     te=te.Displaypersonaldetails(id);
        ArrayList<Student> arr_st=new ArrayList<Student>();
     arr_st=te.Set_student_degree(id,Integer.valueOf(jTextField1.getText()),Integer.parseInt(degree.getText()));
            DefaultTableModel Model =(DefaultTableModel)jTable1.getModel();
            switch (te.getSudject_He_Teaches()) {
            case "Arabic":
               for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_arabic()});
       }
                         break;
            case "English":
                for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_english()});
       }
                         break;
            case "History":
                for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_history()});
       }
                          break;
            case "Social":
                for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_social()});
       }
                          break;
            case "Science":
                for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_science()});
       }
                          break;
            case "Math":
               for(int i=0;i<arr_st.size();i++){
           st=(Student) arr_st.get(i);
       Model.addRow(new Object[]{st.getId(),st.getName(),st.getGradeof_math()});
       }
                          break;
            default:
                break;
        }
   
            
             JOptionPane.showMessageDialog(this,  " Done ");
             jTextField1.setText("");
             degree.setText("");
}
catch(Exception ex){

    JOptionPane.showMessageDialog(this, "Did Not Done ");
}
    
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Teacher_form sf=new Teacher_form(id);
        sf.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(SetDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetDegrees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField degree;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
