/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerRole;
import model.EcoSystem;
import model.UserAccount.UserAccount;
import model.WorkQueue.BuyInsuranceWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class ViewCurrentPlans extends javax.swing.JPanel {

    /**
     * Creates new form ViewCurrentPlans
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    public ViewCurrentPlans(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
        
        for (WorkRequest request :  system.getWorkQueue().getWorkRequestList()) {
            if(request instanceof BuyInsuranceWorkRequest){
            if (request.getSender().getUsername().equals(userAccount.getUsername())){
                BuyInsuranceWorkRequest buyInsurance = (BuyInsuranceWorkRequest) request;
                nameTxtField.setText(buyInsurance.getPlan().getName());
                yrsTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalYears()));
                monthlTxtField.setText(String.valueOf(buyInsurance.getPlan().getMonthlyPremium()));
                totalTxtField.setText(String.valueOf(buyInsurance.getPlan().getTotalPremium()));
                purchaseDateTxtField.setText(String.valueOf(request.getRequestDate()));
                Calendar c = Calendar.getInstance();
                c.setTime(request.getRequestDate());
                c.add(Calendar.YEAR, buyInsurance.getPlan().getTotalYears());
                Date validity = c.getTime();
                validityTxtField.setText(String.valueOf(validity));
                statusTxtField.setText(buyInsurance.getStatus());
                
                
//            System.out.println("Receiver would be");
//            System.out.println(request.getReceiver());
            }}}
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        monthlTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        purchaseDateTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        validityTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        statusTxtField = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTxtField.setBackground(new java.awt.Color(204, 255, 255));
        nameTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 160, -1));

        yrsTxtField.setBackground(new java.awt.Color(204, 255, 255));
        yrsTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 160, -1));

        monthlTxtField.setBackground(new java.awt.Color(204, 255, 255));
        monthlTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });
        add(monthlTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 160, -1));

        totalTxtField.setBackground(new java.awt.Color(204, 255, 255));
        totalTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        totalTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtFieldActionPerformed(evt);
            }
        });
        add(totalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 160, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Plan Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Total years of duration:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Monthly premium amount:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 230, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Total premium amount:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Purchased on:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, -1));

        purchaseDateTxtField.setBackground(new java.awt.Color(204, 255, 255));
        purchaseDateTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(purchaseDateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 160, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Validity:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        validityTxtField.setBackground(new java.awt.Color(204, 255, 255));
        validityTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(validityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 160, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Status:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 60, -1));

        statusTxtField.setBackground(new java.awt.Color(204, 255, 255));
        statusTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        add(statusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 160, -1));

        enterpriseLabel.setBackground(new java.awt.Color(51, 51, 255));
        enterpriseLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        enterpriseLabel.setText("View Current Plans Available");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 500, 60));

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Back");
        jButton7.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/wef.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void monthlTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlTxtFieldActionPerformed

    private void totalTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtFieldActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField purchaseDateTxtField;
    private javax.swing.JTextField statusTxtField;
    private javax.swing.JTextField totalTxtField;
    private javax.swing.JTextField validityTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables
}
