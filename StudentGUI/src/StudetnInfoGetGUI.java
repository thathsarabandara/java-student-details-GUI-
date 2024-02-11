


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudetnInfoGetGUI extends javax.swing.JFrame {

    /**
     * Creates new form StudetnInfoGetGUI
     */
    public StudetnInfoGetGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Enterbtn = new javax.swing.JButton();
        stdindex = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        subject1 = new javax.swing.JTextField();
        subject2 = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        subject3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        headerLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Enter Student IndexHere");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setText("Student Subject 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setText("Student Subject 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setText("Student Subject 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setText("GPA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        Enterbtn.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Enterbtn.setText("ENTER");
        Enterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Enterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));
        getContentPane().add(stdindex, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 340, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 340, -1));
        getContentPane().add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 340, -1));
        getContentPane().add(subject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 340, -1));
        getContentPane().add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 340, -1));
        getContentPane().add(subject3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 340, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usjp-logo-300x300.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 320));

        headerLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        headerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel2.setText("Student De");
        getContentPane().add(headerLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 330, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2024-02-11 110149.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 600));

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel9.setText("tail's GUI");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 250, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterbtnActionPerformed
                                       
    String stIndex = stdindex.getText();
    
    try {
        pst = con.prepareStatement("SELECT * FROM student WHERE std_index = ?");
        pst.setString(1, stIndex);
   
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()) {
            // Assuming these are your text fields, update them with data from the database
            name.setText(rs.getString("std_name"));
            subject1.setText(rs.getString("std_subject1"));
            subject2.setText(rs.getString("std_subject2"));
            subject3.setText(rs.getString("std_subject3"));
            gpa.setText(rs.getString("gpa"));
            
            JOptionPane.showMessageDialog(this, "Data found!");
        } else {
            JOptionPane.showMessageDialog(this, "No data found for the given index!");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: Failed to retrieve data!");
    }

    }//GEN-LAST:event_EnterbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudetnInfoGetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudetnInfoGetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudetnInfoGetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudetnInfoGetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudetnInfoGetGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enterbtn;
    private javax.swing.JTextField gpa;
    private javax.swing.JLabel headerLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField stdindex;
    private javax.swing.JTextField subject1;
    private javax.swing.JTextField subject2;
    private javax.swing.JTextField subject3;
    // End of variables declaration//GEN-END:variables
}
