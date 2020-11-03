/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystem;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Nedlog
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbSex = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinereservationsystem/Golden Systems WEB.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 420, 170);

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 180, 210, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ENTER YOUR FIRST NAME");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 260, 150, 30);
        getContentPane().add(txtFname);
        txtFname.setBounds(260, 260, 160, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ENTER YOUR LAST NAME");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 320, 150, 30);
        getContentPane().add(txtLname);
        txtLname.setBounds(260, 320, 160, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ENTER YOUR EMAIL");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 380, 150, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(260, 380, 170, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ENTER YOUR USERNAME");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 440, 140, 40);
        getContentPane().add(txtUname);
        txtUname.setBounds(260, 440, 170, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("ENTER YOUR ADDRESS");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 500, 140, 40);

        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtAddress);
        txtAddress.setBounds(260, 500, 240, 150);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ENTER YOUR PHONE NUMBER");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(590, 270, 170, 40);
        getContentPane().add(txtNumber);
        txtNumber.setBounds(790, 270, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SEX");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(720, 330, 40, 40);

        cmbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(cmbSex);
        cmbSex.setBounds(790, 330, 90, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("ENTER YOUR PASSWORD");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(600, 390, 160, 40);
        getContentPane().add(password);
        password.setBounds(790, 390, 200, 40);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(670, 500, 170, 130);

        btnUpload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpload.setText("UPLOAD PROFILE PICTURE");
        getContentPane().add(btnUpload);
        btnUpload.setBounds(640, 450, 230, 40);

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("BACK TO LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(690, 30, 160, 40);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(863, 30, 110, 40);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(870, 630, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinereservationsystem/airline_industry.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        this.dispose();
        Login obj=new Login();
        obj.setSize(1000, 680);
        obj.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String fname=txtFname.getText().trim();
        String lname=txtLname.getText().trim();
        String email=txtEmail.getText().trim();
        String uname=txtUname.getText().trim();
        String address=txtAddress.getText().trim();
        int number=Integer.parseInt(txtNumber.getText().trim());
        String sex=cmbSex.getSelectedItem().toString().trim();
        String pass=new String (password.getPassword()).trim();
        //for profile picture
        if(fname.isEmpty()||lname.isEmpty()||email.isEmpty()||uname.isEmpty()||sex.isEmpty()||pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Important Entries should be filled");
        }
        else{
            try{
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinebase", "root", "");
            Statement st=(Statement) con.createStatement();
            String sql="INSERT INTO registration VALUES ('"+fname+"','"+lname+"','"+email+"','"+uname+"','"+address+"','"+number+"','"+sex+"','"+pass+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registration Successful. Proceeding to Login Page");
            String sql2="INSERT INTO verification VALUES('"+uname+"','"+pass+"')";
            st.executeUpdate(sql2);
            String sql3="INSERT INTO profile VALUES('"+fname+"','"+lname+"','"+uname+"','"+email+"')";
            st.executeUpdate(sql3);
            this.dispose();
            Login obj=new Login();
            obj.setSize(1000, 680);
            obj.setVisible(true);
            con.close();
        }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox cmbSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
