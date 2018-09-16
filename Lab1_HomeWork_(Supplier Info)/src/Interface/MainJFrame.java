/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
/**
 *
 * @author 123
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Product product;
    public MainJFrame() {
        initComponents();
        product = new Product();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        displayJPanel = new javax.swing.JPanel();
        controlJpanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        MainUpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        splitPanel.setDividerSize(12);
        splitPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        displayJPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displayJPanel);

        controlJpanel.setPreferredSize(new java.awt.Dimension(100, 500));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.setMaximumSize(new java.awt.Dimension(70, 29));
        viewBtn.setMinimumSize(new java.awt.Dimension(70, 29));
        viewBtn.setPreferredSize(new java.awt.Dimension(70, 29));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        MainUpdateBtn.setText("Update");
        MainUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJpanelLayout = new javax.swing.GroupLayout(controlJpanel);
        controlJpanel.setLayout(controlJpanelLayout);
        controlJpanelLayout.setHorizontalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainUpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlJpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MainUpdateBtn, createBtn, viewBtn});

        controlJpanelLayout.setVerticalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(createBtn)
                .addGap(18, 18, 18)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainUpdateBtn)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        controlJpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MainUpdateBtn, createBtn, viewBtn});

        splitPanel.setLeftComponent(controlJpanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        CreatePanel createPanel = new CreatePanel(product);
        splitPanel.setRightComponent(createPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(product);
        splitPanel.setRightComponent(viewPanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void MainUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainUpdateBtnActionPerformed
        // TODO add your handling code here:
        UpdatePanel updatepanel = new UpdatePanel(product);
        splitPanel.setRightComponent(updatepanel);
    }//GEN-LAST:event_MainUpdateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainUpdateBtn;
    private javax.swing.JPanel controlJpanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
