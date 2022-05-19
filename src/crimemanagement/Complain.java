package crimemanagement;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Complain extends javax.swing.JFrame {

    /**
     * Creates new form CrimeRecordUpdate
     */
    public Complain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCriminalName = new javax.swing.JTextField();
        jTextFieldPlace = new javax.swing.JTextField();
        jTextFieldCrimeType = new javax.swing.JTextField();
        jTextFieldNidNumber = new javax.swing.JTextField();
        jTextFieldVicName = new javax.swing.JTextField();
        jTextFieldTime = new javax.swing.JTextField();
        jButtonOkCrime = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabelMn = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabelPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setPreferredSize(new java.awt.Dimension(856, 436));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter INFO for Complaining");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Your Name:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("*NID Number:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*Crime Type:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("*Place (Thana):");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("*Time (dd-mm-yyyy):");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Criminal Name:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jTextFieldCriminalName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldCriminalName.setBorder(null);
        jPanel3.add(jTextFieldCriminalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 250, -1));

        jTextFieldPlace.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldPlace.setBorder(null);
        jPanel3.add(jTextFieldPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 250, -1));

        jTextFieldCrimeType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldCrimeType.setBorder(null);
        jPanel3.add(jTextFieldCrimeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 250, -1));

        jTextFieldNidNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldNidNumber.setBorder(null);
        jPanel3.add(jTextFieldNidNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, -1));

        jTextFieldVicName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldVicName.setBorder(null);
        jPanel3.add(jTextFieldVicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, -1));

        jTextFieldTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldTime.setBorder(null);
        jPanel3.add(jTextFieldTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 250, -1));

        jButtonOkCrime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonOkCrime.setText("Submit");
        jButtonOkCrime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOkCrime.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOkCrime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkCrimeActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonOkCrime, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 80, -1));

        jButtonCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCancel.setText("Back");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 50, -1));

        jLabelClose.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 20, 30));

        jLabelMn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelMn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMn.setText("-");
        jLabelMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMnMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 20, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Description:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jTextFieldDescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldDescription.setBorder(null);
        jPanel3.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 250, -1));

        jLabelPicture.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPicture.setIcon(new javax.swing.ImageIcon("H:\\Java Crime\\CrimeManagement\\Java images\\Complain.jpg")); // NOI18N
        jLabelPicture.setText("jLabel1");
        jLabelPicture.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel3.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* marked fields must be filled");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkCrimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkCrimeActionPerformed
        String name = jTextFieldVicName.getText();
        String nid = jTextFieldNidNumber.getText();
        String type = jTextFieldCrimeType.getText();
        String place = jTextFieldPlace.getText();
        String time = jTextFieldTime.getText();
        String cname = jTextFieldCriminalName.getText();
        String des = jTextFieldDescription.getText();
        
        name=name.toUpperCase();
        type=type.toUpperCase();
        place=place.toUpperCase();
        cname=cname.toUpperCase();
        des=des.toUpperCase();

        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please Insert Your Name");
        }

        else if(nid.equals("")){
            JOptionPane.showMessageDialog(null, "Please provide NID Number");
        }

        else if(type.equals("")){
            JOptionPane.showMessageDialog(null, "Please Name the Type of Crime");
        }

        else if(place.equals("")){
            JOptionPane.showMessageDialog(null, "Please Mention the place of Crime");
        }

        else if(time.equals("")){
            JOptionPane.showMessageDialog(null, "Please Provide the Time of Crime");
        }


        else{
            PreparedStatement st;

            String qry="INSERT INTO `complain`(`name`, `NID`, `crime type`, `criminal name`, `place`, `time`, `description`) VALUES (?,?,?,?,?,?,?)";
            try{
                st = MyConnection.getConnection().prepareStatement(qry);

                st.setString(1,name);
                st.setString(2,nid);
                st.setString(3,type);
                st.setString(4,cname);
                st.setString(5,place);
                st.setString(6,time);
                st.setString(7,des);

                if(st.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "We've received your complain. Click Back Button To Go back to Home Page");
                    jTextFieldVicName.setText("");
                    jTextFieldTime.setText("");
                    jTextFieldCriminalName.setText("");
                    jTextFieldCrimeType.setText("");
                    jTextFieldDescription.setText("");
                    jTextFieldPlace.setText("");
                    jTextFieldNidNumber.setText("");
                }

            }catch (SQLException ex){
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }//GEN-LAST:event_jButtonOkCrimeActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMnMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        HomePageForPolice hgf = new HomePageForPolice();
        hgf.setVisible(true);
        hgf.pack();
        hgf.setLocationRelativeTo(null);
        hgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws JSONException {
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
            java.util.logging.Logger.getLogger(Complain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Complain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Complain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Complain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Complain().setVisible(true);
            }
        });
        
        DutyOfficers.mainCaller();
        CrimeRecords.mainCrime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOkCrime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMn;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCrimeType;
    private javax.swing.JTextField jTextFieldCriminalName;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldNidNumber;
    private javax.swing.JTextField jTextFieldPlace;
    private javax.swing.JTextField jTextFieldTime;
    private javax.swing.JTextField jTextFieldVicName;
    // End of variables declaration//GEN-END:variables
}