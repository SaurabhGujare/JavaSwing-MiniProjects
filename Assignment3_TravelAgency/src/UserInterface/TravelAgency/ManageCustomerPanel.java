/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.AirlinerDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import UserInterface.Airliners.FlightLoginPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saurabhgujare
 */
public class ManageCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerPanel
     */
    AirlinerDirectory airlinerList; 
    JPanel rightPanel;
    CustomerDirectory customerDirectory;
    Customer customer;
    public ManageCustomerPanel(AirlinerDirectory airlinerList, JPanel rightPanel, CustomerDirectory customerDirectory, Customer customer) {
        initComponents();
        this.airlinerList = airlinerList;
        this.rightPanel = rightPanel;
        this.customerDirectory = customerDirectory;
        this.customer = customer;
        refreshTable();
    }


  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        lastNameTF = new javax.swing.JTextField();
        emailIdTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        addCustomerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        removeCustomerBtn = new javax.swing.JButton();
        viewCustomerBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(182, 188, 228));
        setPreferredSize(new java.awt.Dimension(699, 527));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Add Customer Information");

        jLabel2.setText("First Name*");

        firstNameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        lastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTFActionPerformed(evt);
            }
        });
        lastNameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        emailIdTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldFocusLost(evt);
            }
        });

        jLabel3.setText("Last Name*");

        Email.setText("Email*");

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Email ID"
            }
        ));
        jScrollPane1.setViewportView(customerTbl);

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        removeCustomerBtn.setText("Remove Customer");
        removeCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerBtnActionPerformed(evt);
            }
        });

        viewCustomerBtn.setText("View Customer");
        viewCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(Email))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCustomerBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeCustomerBtn)
                                .addGap(18, 18, 18)
                                .addComponent(viewCustomerBtn)))))
                .addGap(88, 88, 88))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailIdTF, firstNameTF, lastNameTF});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {removeCustomerBtn, viewCustomerBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCustomerBtn)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeCustomerBtn)
                    .addComponent(viewCustomerBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailIdTF, firstNameTF, lastNameTF});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {removeCustomerBtn, viewCustomerBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        if(firstNameTF.getText().isEmpty()|| lastNameTF.getText().isEmpty()||emailIdTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, " Please add all the mandatory fields");
            firstNameTF.setText("");
            lastNameTF.setText("");
            emailIdTF.setText("");
       }
        else{
        Customer ABC=customerDirectory.addCustomer();
        ABC.setFirstName(firstNameTF.getText());
        ABC.setLastName(lastNameTF.getText());
        ABC.setEmailId(emailIdTF.getText());  
        refreshTable();
        firstNameTF.setText("");
        lastNameTF.setText("");
        emailIdTF.setText("");
        }
    }//GEN-LAST:event_addCustomerBtnActionPerformed
    

    public void refreshTable() {
        int rowCount = customerTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)customerTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Customer p : customerDirectory.getCustomerList()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getEmailId();
            model.addRow(row);
            }
        
        }
    private void lastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTFActionPerformed

    private void removeCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerBtnActionPerformed
        // TODO add your handling code here:
        int row = customerTbl.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer1 = (Customer)customerTbl.getValueAt(row, 0);
        customerDirectory.removeCustomer(customer1);
        refreshTable();
    }//GEN-LAST:event_removeCustomerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerTbl.getSelectedRow();
             
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        else{
        Customer customer1=(Customer)customerTbl.getValueAt(selectedRow, 0);
        ViewCustomerPanel viewCustomer = new ViewCustomerPanel(rightPanel,customer1);
        rightPanel.add("ViewCustomerPanel",viewCustomer);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
        }
    }//GEN-LAST:event_viewCustomerBtnActionPerformed

    private void textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldFocusLost
        // TODO add your handling code here:
//        JTextField intField=(JTextField)evt.getComponent();
//     
//        if(!intField.getText().isEmpty()){
//            intField.getText();
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Please enter the value");
//            intField.requestFocus();
//            
//        }
    }//GEN-LAST:event_textFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerTbl;
    private javax.swing.JTextField emailIdTF;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JButton removeCustomerBtn;
    private javax.swing.JButton viewCustomerBtn;
    // End of variables declaration//GEN-END:variables
}
