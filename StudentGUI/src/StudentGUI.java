/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author thath
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentGUI extends javax.swing.JFrame {

  
    public StudentGUI() {
        initComponents();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
public void Connect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDetails","root","");

    } catch (ClassNotFoundException e) {
        e.printStackTrace(); 
    } catch (SQLException e) {

        e.printStackTrace(); 
    }
}


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        headerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitBTN = new javax.swing.JButton();
        index = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        subject1 = new javax.swing.JTextField();
        subject2 = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        subject3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        headerLabel1 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Java Student GUI Application"); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("Student De");
        getContentPane().add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 330, 107));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Student Index");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Student Subject 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("Student Subject 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("Student Subject 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("GPA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        submitBTN.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        submitBTN.setText("SUBMIT");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(submitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));
        getContentPane().add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 340, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 340, -1));
        getContentPane().add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 340, -1));
        getContentPane().add(subject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 340, -1));
        getContentPane().add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 340, -1));
        getContentPane().add(subject3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 340, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usjp-logo-300x300.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 320));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-02-11 110149.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 600));

        headerLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        headerLabel1.setText("Student Detail's GUI");
        getContentPane().add(headerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 524, 107));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        String stIndex = index.getText();
        String stName = name.getText();
        String stSubject1 = subject1.getText();
        String stSubject2 = subject2.getText();
        String stSubject3 = subject3.getText();
        BigDecimal stGPA = new BigDecimal(gpa.getText());
        
        try {
            pst = con.prepareStatement("INSERT INTO student(std_index, std_name, std_subject1, std_subject2, std_subject3, gpa) VALUES (?, ?, ?, ?, ?, ?)");
             pst.setString(1, stIndex);
             pst.setString(2, stName);
             pst.setString(3, stSubject1);
             pst.setString(4, stSubject2);
             pst.setString(5, stSubject3);
             pst.setBigDecimal(6, stGPA);
             
             int k = pst.executeUpdate();
             
             if(k>0){
                JOptionPane.showMessageDialog(this, "Registration successful!");
                name.setText("");
                index.setText("");
                subject1.setText("");
                subject2.setText("");
                subject3.setText("");
                gpa.setText("");
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Registration failed!");
        }

    
    }//GEN-LAST:event_submitBTNActionPerformed
    

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
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gpa;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel headerLabel1;
    private javax.swing.JTextField index;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField subject1;
    private javax.swing.JTextField subject2;
    private javax.swing.JTextField subject3;
    private javax.swing.JButton submitBTN;
    // End of variables declaration//GEN-END:variables
}
