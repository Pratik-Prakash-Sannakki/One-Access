/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdminRole;

import UI.Doctor.DoctorJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author Akshatha
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
     JPanel userProcessContainer;
    EcoSystem system;
    private  UserAccount user;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
            this.userProcessContainer = userProcessContainer;
      this.system=system;
       this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 246, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJButton.setBackground(new java.awt.Color(51, 153, 255));
        userJButton.setForeground(new java.awt.Color(255, 255, 255));
        userJButton.setText("Patient");
        userJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        manageOrganizationJButton.setBackground(new java.awt.Color(51, 153, 255));
        manageOrganizationJButton.setForeground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setText("Doctors");
        manageOrganizationJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Order Inventory");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        enterpriseLabel.setText("Hospital Admin Dashboard");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 480, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/p7.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 540, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel AddPatentJPanel = new AddPatientJPanel(userProcessContainer, system,user);
        userProcessContainer.add("CreatePatient", AddPatentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        DoctorJPanel doctorJPanel = new DoctorJPanel(userProcessContainer,system,user);
        userProcessContainer.add("Doctors", doctorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        ManageInventoryJPanel manageInventory = new ManageInventoryJPanel(userProcessContainer, user, system);
        userProcessContainer.add("ManageInventory", manageInventory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
