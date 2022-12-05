package UI.InsuranceAdmin;


import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.InsuranceAdmin.InsurancePlan;
import model.InsuranceAdmin.InsuranceeAdmin;

import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pratiksannakki
 */
public class ViewUpdateDeleteIPlansJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateDeleteIPlansJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    InsuranceeAdmin ic;
    public ViewUpdateDeleteIPlansJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
           if(system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(userAccount.getEmployee().getName()).getInsurancePlanDirectory()!=null ){
            populateTable();
        }else{
             JOptionPane.showMessageDialog(null, "No Insurance Plan added");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        monthlTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        plansJTable = new javax.swing.JTable();
        nameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        totalTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Monthly premium amount:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });
        add(monthlTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 150, -1));

        plansJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Insurance Plan Name", "Total years", "Monthly premium amount", "Total amount"
            }
        ));
        plansJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plansJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(plansJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 540, 130));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, -1));

        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Total years of duration:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 160, -1));

        jButton2.setBackground(new java.awt.Color(24, 31, 46));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("MANAGE INSURANCE");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 260, 30));

        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });
        add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Total premium amount:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jButton3.setBackground(new java.awt.Color(24, 31, 46));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DELETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 110, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Plan Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void monthlTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlTxtFieldActionPerformed

    private void plansJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plansJTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) plansJTable.getModel();

        String name = dtm.getValueAt(plansJTable.getSelectedRow(), 0).toString();
        int years = Integer.parseInt(dtm.getValueAt(plansJTable.getSelectedRow(), 1).toString());
        Double monthlyPremiumAmount = Double.parseDouble(dtm.getValueAt(plansJTable.getSelectedRow(), 2).toString());
        Double totalAmount = Double.parseDouble(dtm.getValueAt(plansJTable.getSelectedRow(), 3).toString());

        nameTxtField.setText(name);
        yrsTxtField.setText(String.valueOf(years));
        monthlTxtField.setText(String.valueOf(monthlyPremiumAmount));
        totalTxtField.setText(String.valueOf(totalAmount));
    }//GEN-LAST:event_plansJTableMouseClicked

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = plansJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            //            updateJPanel.setVisible(true);
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Insurance Plan name");
                nameTxtField.setText("");
                return;
            } else if (!yrsTxtField.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Enter proper Years duration in integers");
                yrsTxtField.setText("");
                return;
            }    else if (!monthlTxtField.getText().matches("^-?\\d+(\\.\\d+)?$")) {
                JOptionPane.showMessageDialog(this, "Enter monthly premium rate like 14.3");
                monthlTxtField.setText("");
                return;
            }
            InsurancePlan ip = (InsurancePlan) plansJTable.getValueAt(selectedRow, 0);
            //            System.out.println("item : " + t.getName());
            ip.setName(nameTxtField.getText());
            ip.setTotalYears(Integer.parseInt(yrsTxtField.getText()));
            ip.setMonthlyPremium(Double.parseDouble(monthlTxtField.getText()));
            ip.setTotalPremium();
            populateTable();
            nameTxtField.setText("");
            yrsTxtField.setText("");
            monthlTxtField.setText("");
            totalTxtField.setText("");

        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void totalTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = plansJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            InsurancePlan ip = (InsurancePlan) plansJTable.getValueAt(selectedRow, 0);
            ic = system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(this.userAccount.getEmployee().getName());
            System.out.println(ic);
            ic.getInsurancePlanDirectory().deleteInsuranceCompany(ip);
            JOptionPane.showMessageDialog(null, "Insurance Plan " + nameTxtField.getText() + " deleted");
            populateTable();
            nameTxtField.setText("");
            nameTxtField.setText("");
            yrsTxtField.setText("");
            monthlTxtField.setText("");
            totalTxtField.setText("");

        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable plansJTable;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables

 private void populateTable() {
        
                DefaultTableModel model = (DefaultTableModel) plansJTable.getModel();
        model.setRowCount(0);
        ic =system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getInsuranceAdminDirectory().findInsuranceAdmin(this.userAccount.getEmployee().getName());
            if(ic.getInsurancePlanDirectory().getIpDirectory()==null){
                JOptionPane.showMessageDialog(null, "Please add a plan");
            return;
               }else{
            for(InsurancePlan ip: ic.getInsurancePlanDirectory().getIpDirectory()){
            Object[] row = new Object[4];
            row[0] = ip;
            row[1] = ip.getTotalYears();
            row[2] = ip.getMonthlyPremium();
            row[3] = ip.getTotalPremium();

            model.addRow(row);
                       }
        }
    
    }
}