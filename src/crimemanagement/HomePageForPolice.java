/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
package crimemanagement;
import javax.swing.JFrame;
import org.json.JSONException;

public class HomePageForPolice extends javax.swing.JFrame {

    /**
     * Creates new form HomePageForPolice
     */
    public HomePageForPolice() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabelHeading = new javax.swing.JLabel();
        jLabelMn = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel_CrimeRecords = new javax.swing.JLabel();
        jLabel_PoliceStation = new javax.swing.JLabel();
        jLabel_DutyOfficer = new javax.swing.JLabel();
        jLabel_Complain = new javax.swing.JLabel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel1stLine = new javax.swing.JLabel();
        jLabelPolicePersonnel = new javax.swing.JLabel();
        jLabelWantLogin = new javax.swing.JLabel();
        jLabel2ndLine = new javax.swing.JLabel();
        jLabel3rdLine = new javax.swing.JLabel();
        jLabel4thLine = new javax.swing.JLabel();
        jLabel5thLine = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHeading.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 55)); // NOI18N
        jLabelHeading.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeading.setText("Crime Management");
        jPanel4.add(jLabelHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 37, -1, -1));

        jLabelMn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelMn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMn.setText("-");
        jLabelMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMnMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelMn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1243, 11, -1, -1));

        jLabelClose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1288, 22, -1, -1));

        jLabel_CrimeRecords.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_CrimeRecords.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CrimeRecords.setText("Crime records");
        jLabel_CrimeRecords.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CrimeRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CrimeRecordsMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel_CrimeRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 170, -1, -1));

        jLabel_PoliceStation.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_PoliceStation.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PoliceStation.setText("Police Stations");
        jLabel_PoliceStation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PoliceStation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PoliceStationMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel_PoliceStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 310, -1, -1));

        jLabel_DutyOfficer.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_DutyOfficer.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DutyOfficer.setText("Duty Officers");
        jLabel_DutyOfficer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_DutyOfficer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DutyOfficerMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel_DutyOfficer, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 450, -1, -1));

        jLabel_Complain.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_Complain.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Complain.setText("Complaint Section");
        jLabel_Complain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Complain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ComplainMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel_Complain, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 590, -1, -1));

        jLabel_Login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(153, 204, 255));
        jLabel_Login.setText("Here.");
        jLabel_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LoginMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 692, -1, -1));

        jLabel1stLine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1stLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1stLine.setText("Here you will find criminal records in the Crime records section.");
        jPanel4.add(jLabel1stLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 273, -1, -1));

        jLabelPolicePersonnel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelPolicePersonnel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPolicePersonnel.setText("(Only for Police Personnel)");
        jPanel4.add(jLabelPolicePersonnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 692, -1, -1));

        jLabelWantLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelWantLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWantLogin.setText("Want to Login? Click");
        jPanel4.add(jLabelWantLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 692, -1, -1));

        jLabel2ndLine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2ndLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2ndLine.setText("You can find the date of crime and punishment period in this section.");
        jPanel4.add(jLabel2ndLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 318, -1, -1));

        jLabel3rdLine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3rdLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3rdLine.setText("Police station hotline numbers and information about duty officers");
        jPanel4.add(jLabel3rdLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 363, -1, -1));

        jLabel4thLine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4thLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4thLine.setText("can be found in the Police Station section and Duty Officers section");
        jPanel4.add(jLabel4thLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 408, -1, -1));

        jLabel5thLine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5thLine.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5thLine.setText("respectively. You can file your complaints through Complaint Section.");
        jPanel4.add(jLabel5thLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 453, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 220, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 350, 220, -1));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 490, 210, -1));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 632, 280, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 718, 50, 10));

        jLabelPicture.setIcon(new javax.swing.ImageIcon("H:\\Java Crime\\CrimeManagement\\Java images\\HomePageForPolice.jpg")); // NOI18N
        jLabelPicture.setText("jLabel1");
        jLabelPicture.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel4.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMnMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabel_CrimeRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CrimeRecordsMouseClicked
        CrimeRecords cgf = new CrimeRecords();
        cgf.setVisible(true);
        cgf.pack();
        cgf.setLocationRelativeTo(null);
        cgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_CrimeRecordsMouseClicked

    private void jLabel_PoliceStationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PoliceStationMouseClicked
        PoliceStations pgf = new PoliceStations();
        pgf.setVisible(true);
        pgf.pack();
        pgf.setLocationRelativeTo(null);
        pgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_PoliceStationMouseClicked

    private void jLabel_DutyOfficerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DutyOfficerMouseClicked
        DutyOfficers dgf = new DutyOfficers();
        dgf.setVisible(true);
        dgf.pack();
        dgf.setLocationRelativeTo(null);
        dgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_DutyOfficerMouseClicked

    private void jLabel_ComplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ComplainMouseClicked
        Complain cgf = new Complain();
        cgf.setVisible(true);
        cgf.pack();
        cgf.setLocationRelativeTo(null);
        cgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_ComplainMouseClicked

    private void jLabel_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LoginMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_LoginMouseClicked

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
            java.util.logging.Logger.getLogger(HomePageForPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageForPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageForPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageForPolice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageForPolice().setVisible(true);
            }
        });
        
        DutyOfficers.mainCaller();
        CrimeRecords.mainCrime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1stLine;
    private javax.swing.JLabel jLabel2ndLine;
    private javax.swing.JLabel jLabel3rdLine;
    private javax.swing.JLabel jLabel4thLine;
    private javax.swing.JLabel jLabel5thLine;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelMn;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPolicePersonnel;
    private javax.swing.JLabel jLabelWantLogin;
    private javax.swing.JLabel jLabel_Complain;
    private javax.swing.JLabel jLabel_CrimeRecords;
    private javax.swing.JLabel jLabel_DutyOfficer;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_PoliceStation;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}