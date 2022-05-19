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

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;

public class SuccessfulRegistration extends javax.swing.JFrame {

    /**
     * Creates new form SuccessfulRegistration
     */
    public SuccessfulRegistration() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTableComplaints.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTableComplaints.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        jTableComplaints.setGridColor(Color.WHITE);
        jTableComplaints.setForeground(Color.WHITE);
        
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        jTableComplaints.setOpaque(false);
        ((DefaultTableCellRenderer)jTableComplaints.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
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
        jLabelHeading = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMn1 = new javax.swing.JLabel();
        jLabelDes = new javax.swing.JLabel();
        jLabelDes1 = new javax.swing.JLabel();
        jLabelDes2 = new javax.swing.JLabel();
        jLabelDes6 = new javax.swing.JLabel();
        jLabelDes7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComplaints = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldThana = new javax.swing.JTextField();
        jButtonFind = new javax.swing.JButton();
        jLabelPicture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setMinimumSize(new java.awt.Dimension(470, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(980, 551));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHeading.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jLabelHeading.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHeading.setText("Welcome to Homepage!");
        jLabelHeading.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabelHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Check out complaints");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 125, -1, -1));

        jLabelClose1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jLabelMn1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelMn1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMn1.setText("-");
        jLabelMn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMn1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 5, 20, -1));

        jLabelDes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelDes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDes.setText("You can check all complaints here. This table provides the name of the suspected criminal, crime type, place of the crime,");
        jLabelDes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabelDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, -1, -1));

        jLabelDes1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelDes1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDes1.setText("time and a description added by the victim. Victim's name will be shown also. Victim's NID number is saved in our ");
        jLabelDes1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabelDes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 197, -1, -1));

        jLabelDes2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelDes2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDes2.setText("database but it's not shown for security purpose. Of course, you can retrieve it from authority if you're assigned for the case.");
        jLabelDes2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabelDes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 227, -1, -1));

        jLabelDes6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabelDes6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDes6.setText("want to go back to home page? click");
        jLabelDes6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabelDes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 473, -1, -1));

        jLabelDes7.setFont(new java.awt.Font("Trajan Pro 3", 1, 14)); // NOI18N
        jLabelDes7.setForeground(new java.awt.Color(153, 255, 255));
        jLabelDes7.setText("HERE");
        jLabelDes7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDes7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDes7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelDes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 473, -1, -1));

        jTableComplaints.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTableComplaints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Victim Name", "Crime type", "Suspected Criminal", "Place", "Time", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTableComplaints);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 860, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Name of Thana:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 287, -1, -1));

        jTextFieldThana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jTextFieldThana, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 281, 290, 30));

        jButtonFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFind.setText("FIND");
        jButtonFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFindMouseClicked(evt);
            }
        });
        jPanel3.add(jButtonFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 284, -1, -1));

        jLabelPicture.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPicture.setIcon(new javax.swing.ImageIcon("H:\\Java Crime\\CrimeManagement\\Java images\\SuccesfulRegistration.jpg")); // NOI18N
        jLabelPicture.setText("jLabel2");
        jLabelPicture.setPreferredSize(new java.awt.Dimension(800, 533));
        jPanel3.add(jLabelPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 15, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMn1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMn1MouseClicked

    private void jLabelDes7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDes7MouseClicked
        HomePageForPolice pgf = new HomePageForPolice();
        pgf.setVisible(true);
        pgf.pack();
        pgf.setLocationRelativeTo(null);
        pgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelDes7MouseClicked

    private void jButtonFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFindMouseClicked
        String thana = jTextFieldThana.getText();
        jTextFieldThana.setText("");
        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM `complain` WHERE `place`=?";
        try{
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, thana);
            rs = ps.executeQuery();
            int flag=0;
            while(rs.next()){
                flag=1;
                
                String VictimName = rs.getString("name");
                String CrimeType = rs.getString("crime type");
                String CriminalName = rs.getString("criminal name");
                String Place = rs.getString("place");
                String Time = rs.getString("time");
                String Description = rs.getString("description");
                
                if(CriminalName.isEmpty()){
                    CriminalName=new String("UNKNOWN");
                }
                
                VictimName = VictimName.toUpperCase();
                CrimeType = CrimeType.toUpperCase();
                CriminalName = CriminalName.toUpperCase();
                Place = Place.toUpperCase();
                Description = Description.toLowerCase();
                
                String tbData[] = {VictimName,CrimeType,CriminalName,Place,Time,Description};
                DefaultTableModel tblModel = (DefaultTableModel)jTableComplaints.getModel();
                
                tblModel.addRow(tbData);
            }
            if(flag==0){
                JOptionPane.showMessageDialog(null,"No Complaints");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButtonFindMouseClicked

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
            java.util.logging.Logger.getLogger(SuccessfulRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuccessfulRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuccessfulRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuccessfulRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuccessfulRegistration().setVisible(true);
            }
        });
        DutyOfficers.mainCaller();
        CrimeRecords.mainCrime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelDes;
    private javax.swing.JLabel jLabelDes1;
    private javax.swing.JLabel jLabelDes2;
    private javax.swing.JLabel jLabelDes6;
    private javax.swing.JLabel jLabelDes7;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelMn1;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableComplaints;
    private javax.swing.JTextField jTextFieldThana;
    // End of variables declaration//GEN-END:variables
}