/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customers;

import Business.AirPlane;
import Business.Airliner;
import Business.Customer;
import Business.Flight;
import Business.Seat;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saurabhgujare
 */
public class seatBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form seatBookingPanel
     */
    JPanel rightPanel;
    Customer customer;
    public seatBookingPanel(Seat[][] seatsArray, JPanel rightPanel, Customer customer) {
        initComponents();
        this.customer=customer;
        this.rightPanel=rightPanel;
        
        DefaultTableModel model = (DefaultTableModel) seatTbl.getModel();
        model.setRowCount(0);
        
        
        seatTbl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        seatTbl.setColumnSelectionAllowed(true);
        seatTbl.setRowSelectionAllowed(true);
        seatTbl.setSelectionBackground(Color.green);
        for(int i = 0 ; i<25;i++){
            Object row[] = new Object[model.getColumnCount()];
            for(int j =0 ;j<6;j++){
                
                    if(j<=2){
                        row[j]=seatsArray[i][j];
                    }
                    else{
                        row[j+1]=seatsArray[i][j];
                    }                    
            }
            model.addRow(row);
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

        bookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        seatTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 225, 217));

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        seatTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "A:Window", "B:Middle", "C:Aisle", "", "D:Aisle", "E:Middle", "F:Window"
            }
        ));
        jScrollPane2.setViewportView(seatTbl);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Select Seat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(bookBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookBtn)
                .addGap(8, 8, 8)
                .addComponent(backBtn)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        Seat seat = (Seat)seatTbl.getValueAt(seatTbl.getSelectedRow(), seatTbl.getSelectedColumn());
        if(seat.isSeat()){
            seat.setSeat(false);
            customer.getBookingHistory().add(seat);     
            JOptionPane.showMessageDialog(null, "Booked seat");
            rightPanel.remove(this);
            CardLayout layout = (CardLayout) rightPanel.getLayout();
            layout.previous(rightPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a seat that is available.");
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable seatTbl;
    // End of variables declaration//GEN-END:variables
}
