/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerRole;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise;
import model.HospitalAdmin.Hospital;
import model.Patient.Patient;
import model.Pharmacist.PharamacyAdmin;
import model.PharmacyCatalog.PharmacyCatalog;
import model.PharmacyCatalog.PharmacyCatalogDirectory;
import model.UserAccount.UserAccount;
import model.WorkQueue.BookAppointment;
import model.WorkQueue.PharmacyOrder;
import model.WorkQueue.PlaceNewOrderWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
//import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * 
 */
public class orderMedJpanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
     private String docname;
     private String timings;
    private Hospital hosObj;
    Patient pat;
    PharmacyCatalog catalog;
    ArrayList<PharmacyCatalog> ml;
    DefaultTableModel dtm;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    private String selectedPharmacy;
    private PharamacyAdmin pharObj;
    String patName;
    PlaceNewOrderWorkRequest placeworkRequest;

    /**
     * Creates new form orderMedJpanel
     */
    
     public orderMedJpanel(JPanel userProcessContainer,UserAccount user,EcoSystem system,String patName) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.patName = patName;
        this.user = user;
        this.ml = new ArrayList<>();
        System.out.println("Pat"+patName);
        System.out.println("Test phar"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList());
       populateComboBox();
        System.out.println(selectedPharmacy);
        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        System.out.println("Sender "+user);
        //tableListener();
//            System.out.println(pat.getMedicine().getMedicines().get(0));
//            txt1.setText(pat.getMedicine().getMedicines().get(0));
//            txt2.setText(pat.getMedicine().getMedicines().get(1));
//            txt3.setText(pat.getMedicine().getMedicines().get(2));
//            txt4.setText(pat.getComments());
            
    }      
            
    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Pharmacy")){
            pharmacyCom.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
            public void getMenuItems(String pharName){
        dtm = (DefaultTableModel) medTable.getModel();
        dtm.setRowCount(0);

        pharObj = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(pharName).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharName);
         
        if(pharObj!=null && pharObj.getPharDir()!=null){
            for(PharmacyCatalog m : pharObj.getPharDir().getCatalog()) {
                Object row[] = new Object[2];
                row[0] = m;
                row[1] = m.getItemPrice();

                dtm.addRow(row);
            }
        }
    }
    private void populatetable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : system.getWorkQueue().getWorkReqList()){
            if(request instanceof PlaceNewOrderWorkRequest){
        placeworkRequest = (PlaceNewOrderWorkRequest) request;
        for (PharmacyOrder orderItemTotal : placeworkRequest.getOrderTot()){
             if(request.getSender().getUsername().equals(user.getUsername())){
                Object row[] = new Object[5];
                row[0] = placeworkRequest.getOrderId();
                row[1] = orderItemTotal.getCatalog().getItemName();
                row[2] = orderItemTotal.getCatalog().getItemPrice();
                row[3] = request.getStat();
     

                dtm.addRow(row);
             }
             System.out.println(request);
        }
        }
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

        orderBtn = new javax.swing.JButton();
        pharmacyCom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        addcartBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderBtn.setBackground(new java.awt.Color(51, 51, 255));
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("Order");
        orderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });
        add(orderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 140, -1));

        pharmacyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pharmacy" }));
        pharmacyCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComActionPerformed(evt);
            }
        });
        add(pharmacyCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 147, -1));

        jLabel5.setText("Pharmacy:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 20));

        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 325, 101));

        addcartBtn.setBackground(new java.awt.Color(51, 51, 255));
        addcartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addcartBtn.setText("Add");
        addcartBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        addcartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartBtnActionPerformed(evt);
            }
        });
        add(addcartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Medicine", "Price", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 330, 100));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Track");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("PATIENT PHARMACY ORDER ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 280, 30));

        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/project.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 850, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        Boolean flag = true;
        System.out.println(selectedPharmacy);
        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));

        if (orderItemList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no tests chosen!");
            flag = false;
        } else {
            PlaceNewOrderWorkRequest newWorkRequest = new PlaceNewOrderWorkRequest();
            newWorkRequest.setOrderTot(orderItemList);
            //System.out.println(this.user.getEmployee().getName());
            newWorkRequest.setSender(user);
            //Lab = (Lab) LabTable.getValueAt(0, 0);
            newWorkRequest.setRecevr(system.getUserAccountDirectory().findUserAccount(selectedPharmacy));
            newWorkRequest.setReqDate(new Date());
            newWorkRequest.setStat("Ordered");
            system.getWorkQueue().addWorkRequest(newWorkRequest);
            //            System.out.println("Work req size"+system.getWorkQueue().getWorkRequestList().size());
            //            System.out.println("Sender000"+newWorkRequest.getSender());
            //            System.out.println("Receiver000"+newWorkRequest.getReceiver());
            //            System.out.println(newWorkRequest.getRequestDate());
            //            System.out.println(newWorkRequest.getStatus());
            addcartBtn.setVisible(false);

        }
        populatetable();
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_orderBtnActionPerformed

    private void pharmacyComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(pharmacyCom.getSelectedItem());
        getMenuItems(selectedPharmacy);

    }//GEN-LAST:event_pharmacyComActionPerformed

    private void addcartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartBtnActionPerformed
        // TODO add your handling code here:
        //                int rowCount =medTable.getRowCount();
        //        for (int i = 0; i < rowCount; i++) {
            //            //int quantity = Integer.parseInt(medTable.getValueAt(i, 2).toString());
            //            PharmacyCatalog item = (PharmacyCatalog) medTable.getValueAt(i, 0);
            //            //if (quantity > 0) {
                //                PharmacyOrder orderItemTotal = new PharmacyOrder(item);
                //                orderItemList.add(orderItemTotal);
                //
                //            //}
            //        }
        //        System.out.println(orderItemList.get(0));
        int selectedRow = medTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
            PharmacyCatalog item = (PharmacyCatalog) medTable.getValueAt(selectedRow, 0);
            PharmacyOrder orderItemTotal = new PharmacyOrder(item);
            orderItemList.add(orderItemTotal);
        }

        //        PharmacyCatalog menu1 = new PharmacyCatalog();
        //        PharmacyCatalogDirectory md = new PharmacyCatalogDirectory();
        //
        //        menu1.setItemName(catalog.getItemName());
        //        menu1.setItemPrice(catalog.getItemPrice());
        //        //menu1.setQuantity(Integer.parseInt(quantity));
        //
        //
        //        PharmacyOrder orderItemTotal = new PharmacyOrder(menu1);
        //                orderItemList.add(orderItemTotal);
        //
    }//GEN-LAST:event_addcartBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populatetable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton addcartBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable medTable;
    private javax.swing.JButton orderBtn;
    private javax.swing.JComboBox<String> pharmacyCom;
    // End of variables declaration//GEN-END:variables
}
