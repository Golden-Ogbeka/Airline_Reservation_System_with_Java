/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Nedlog
 */
public class Local extends javax.swing.JFrame {
    private ImageIcon format=null;
    /**
     * Creates new form Local
     */
    public Local() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbAvailable = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinereservationsystem/Golden Systems WEB.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 420, 170);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Vrinda", 3, 18)); // NOI18N
        jLabel4.setText("PLEASE SELECT AN AIRLINE AND CLICK NEXT");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 270, 420, 30);

        cmbAvailable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbAvailable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arik Air", "Aero Contractors" }));
        cmbAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAvailableActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAvailable);
        cmbAvailable.setBounds(160, 330, 260, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(820, 560, 130, 50);
        getContentPane().add(lblPicture);
        lblPicture.setBounds(470, 330, 300, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlinereservationsystem/Enugu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAvailableActionPerformed
       try{ 
           String available=cmbAvailable.getSelectedItem().toString().trim();
            byte[] imagedata=null;
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/airlinebase", "root", "");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM airlinepicture");
            while (rs.next()) {
                String nameStored=rs.getString("airlinename").trim();
                imagedata=rs.getBytes("airlinepicture");
                if(available.equals(nameStored)){
                    format=new ImageIcon(imagedata);
                    lblPicture.setIcon(format);
                }
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmbAvailableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        SearchLocal obj=new SearchLocal();
        obj.setSize(1000, 680);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Local().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAvailable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables
}
