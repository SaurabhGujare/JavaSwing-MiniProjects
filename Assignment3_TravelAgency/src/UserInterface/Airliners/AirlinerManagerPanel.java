/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.AirplaneDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author saurabhgujare
 */
public class AirlinerManagerPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerManagerPanel
     */
    AirlinerDirectory airlinerList;
    JPanel rightPanel;
    Airliner airliner;
 
    public AirlinerManagerPanel(Airliner airliner, JPanel rightPanel) {
        initComponents();
        this.airlinerList=airlinerList;
        this.rightPanel=rightPanel;
        this.airliner=airliner;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageAirplanesBtn = new javax.swing.JButton();
        manageFlightsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        manageAirplanesBtn.setText("Manage Airplanes");
        manageAirplanesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirplanesBtnActionPerformed(evt);
            }
        });

        manageFlightsBtn.setText("Manage Flights");
        manageFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFlightsBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(manageAirplanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(manageFlightsBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageAirplanesBtn, manageFlightsBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageFlightsBtn)
                    .addComponent(manageAirplanesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {manageAirplanesBtn, manageFlightsBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void manageAirplanesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirplanesBtnActionPerformed
        // TODO add your handling code here:
        
        AddAirplanePanel addAirplane = new AddAirplanePanel(rightPanel,airliner);
        rightPanel.add("AirlinerLoginPanel",addAirplane);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_manageAirplanesBtnActionPerformed

    private void manageFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFlightsBtnActionPerformed
        // TODO add your handling code here:
        FlightLoginPanel flightLogin = new FlightLoginPanel(airliner.getAirplaneDirectory(), rightPanel, airliner);
        rightPanel.add("FlightLoginPanel",flightLogin);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_manageFlightsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton manageAirplanesBtn;
    private javax.swing.JButton manageFlightsBtn;
    // End of variables declaration//GEN-END:variables
}
