/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.AirlinerDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author saurabhgujare
 */
public class TAManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form TAManagerPanel
     */
    
    AirlinerDirectory airlinerList;
    JPanel rightPanel;
    CustomerDirectory customerDirectory;
    Customer customer;
    
    public TAManagerPanel(AirlinerDirectory airlinerList, JPanel rightPanel, CustomerDirectory customerDirectory, Customer customer) {
        initComponents();
        this.airlinerList = airlinerList;
        this.rightPanel = rightPanel;
        this.customerDirectory=customerDirectory;
        this.customer=customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageAirlinerBtn = new javax.swing.JButton();
        manageCustomersBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(182, 188, 228));
        setPreferredSize(new java.awt.Dimension(614, 517));

        manageAirlinerBtn.setText("Manage Airliner");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });

        manageCustomersBtn.setText("Manage Customers");
        manageCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(manageAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(manageCustomersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageAirlinerBtn, manageCustomersBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageAirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(manageCustomersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(335, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {manageAirlinerBtn, manageCustomersBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
        ManageAirinerPanel mngAirliner = new ManageAirinerPanel(airlinerList, rightPanel);
        rightPanel.add("ManageAirlinerPanel", mngAirliner);
        CardLayout layout= (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
        
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    private void manageCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersBtnActionPerformed
        // TODO add your handling code here:
        ManageCustomerPanel manageCustomer = new ManageCustomerPanel(airlinerList, rightPanel, customerDirectory,customer);
        rightPanel.add("ManageCustomerPanel", manageCustomer);
        CardLayout layout= (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_manageCustomersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageAirlinerBtn;
    private javax.swing.JButton manageCustomersBtn;
    // End of variables declaration//GEN-END:variables
}
