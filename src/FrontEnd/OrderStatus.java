/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DatabaseConnection;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Banele
 */
public class OrderStatus extends javax.swing.JFrame {

    /**
     * Creates new form OrderStatus
     */
     public OrderStatus(){
        initComponents();
     }
     
    public OrderStatus(String ...arg){
        initComponents();
        switch(arg[4]){
            case "Collect": displayData(btnCollectOrder, arg); break;
            case "In-progress": displayData(btnInprogressOrder, arg); break;
            case "Issue": displayData(btnIssueOrder, arg); break;
            case "Close": displayData(btnCloseOrder, arg); break;
        }
    }
    
    void displayData(JButton button, String ...arg){
        button.setEnabled(false);
        button.setBackground(new Color(204, 204, 204));
        //order_id, table_name, waiter_name, order_name, order_status, comment, order_date, order_bill
        lblOrderBill.setText(arg[7]);
        lblOrderDate.setText(arg[6]);
        lblOrderID.setText(arg[0]);
        lblOrderName.setText(arg[3]);
        lblTableName.setText(arg[1]);
        lblWaiterName.setText(arg[2]);
        txtCommentArea.setText(arg[5]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblOrderID1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCommentArea1 = new javax.swing.JTextArea();
        lblTableName1 = new javax.swing.JLabel();
        lblOrderName1 = new javax.swing.JLabel();
        lblWaiterName1 = new javax.swing.JLabel();
        lblOrderBill1 = new javax.swing.JLabel();
        lblOrderDate1 = new javax.swing.JLabel();
        btnCloseOrder1 = new javax.swing.JButton();
        btnInprogressOrder1 = new javax.swing.JButton();
        btnIssueOrder1 = new javax.swing.JButton();
        btnCollectOrder1 = new javax.swing.JButton();
        lblCloseForm1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OrderStatus");
        setName("frmOrderStatus"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Order ID:");

        lblOrderID1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Table name:");

        jLabel10.setText("Waiter name:");

        jLabel11.setText("Order name:");

        jLabel12.setText("Order date:");

        jLabel13.setText("Order bill:");

        txtCommentArea1.setColumns(20);
        txtCommentArea1.setLineWrap(true);
        txtCommentArea1.setRows(5);
        jScrollPane2.setViewportView(txtCommentArea1);

        lblTableName1.setBackground(new java.awt.Color(204, 204, 204));

        lblOrderName1.setBackground(new java.awt.Color(204, 204, 204));

        lblWaiterName1.setBackground(new java.awt.Color(204, 204, 204));

        lblOrderBill1.setBackground(new java.awt.Color(204, 204, 204));

        lblOrderDate1.setBackground(new java.awt.Color(204, 204, 204));

        btnCloseOrder1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCloseOrder1.setText("CLOSE");
        btnCloseOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseOrderActionPerformed(evt);
            }
        });

        btnInprogressOrder1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInprogressOrder1.setText("IN-PROGRESS");
        btnInprogressOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInprogressOrderActionPerformed(evt);
            }
        });

        btnIssueOrder1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIssueOrder1.setText("ISSUE");
        btnIssueOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueOrderActionPerformed(evt);
            }
        });

        btnCollectOrder1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCollectOrder1.setText("COLLECT");
        btnCollectOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectOrderActionPerformed(evt);
            }
        });

        lblCloseForm1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseForm1.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseForm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCloseForm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/x-button.png"))); // NOI18N
        lblCloseForm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrderID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTableName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCloseForm1)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblOrderName1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(lblWaiterName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrderDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOrderBill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnInprogressOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCollectOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIssueOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCloseOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOrderID1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCloseForm1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTableName1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWaiterName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOrderName1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOrderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblOrderBill1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCloseOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInprogressOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIssueOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCollectOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(430, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseFormMouseClicked
        // Close or terminate program
        this.dispose();
    }//GEN-LAST:event_lblCloseFormMouseClicked

    private void btnCollectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectOrderActionPerformed
        // TODO add your handling code here:
        int order_id = Integer.parseInt(lblOrderID.getText());
        String comment = txtCommentArea.getText();
        String status = "Collect";
        String table_name = lblTableName.getText();
        DatabaseConnection.changeOrder(order_id, comment, status, table_name);
        this.dispose();
    }//GEN-LAST:event_btnCollectOrderActionPerformed

    private void btnIssueOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueOrderActionPerformed
        // TODO add your handling code here:
        int order_id = Integer.parseInt(lblOrderID.getText());
        String comment = txtCommentArea.getText();
        String status = "Issue";
        String table_name = lblTableName.getText();
        DatabaseConnection.changeOrder(order_id, comment, status, table_name);
        this.dispose();
    }//GEN-LAST:event_btnIssueOrderActionPerformed

    private void btnInprogressOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInprogressOrderActionPerformed
        // TODO add your handling code here:
        int order_id = Integer.parseInt(lblOrderID.getText());
        String comment = txtCommentArea.getText();
        String status = "In-progress";
        String table_name = lblTableName.getText();
        DatabaseConnection.changeOrder(order_id, comment, status, table_name);
        this.dispose();
    }//GEN-LAST:event_btnInprogressOrderActionPerformed

    private void btnCloseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseOrderActionPerformed
        // TODO add your handling code here:
        int order_id = Integer.parseInt(lblOrderID.getText());
        String comment = txtCommentArea.getText();
        String status = "Close";
        String table_name = lblTableName.getText();
        DatabaseConnection.changeOrder(order_id, comment, status, table_name);
        DatabaseConnection.updateTableStatus(table_name);
        this.dispose();
    }//GEN-LAST:event_btnCloseOrderActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OrderStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrderStatus().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseOrder;
    private javax.swing.JButton btnCloseOrder1;
    private javax.swing.JButton btnCollectOrder;
    private javax.swing.JButton btnCollectOrder1;
    private javax.swing.JButton btnInprogressOrder;
    private javax.swing.JButton btnInprogressOrder1;
    private javax.swing.JButton btnIssueOrder;
    private javax.swing.JButton btnIssueOrder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCloseForm;
    private javax.swing.JLabel lblCloseForm1;
    private javax.swing.JLabel lblOrderBill;
    private javax.swing.JLabel lblOrderBill1;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderDate1;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblOrderID1;
    private javax.swing.JLabel lblOrderName;
    private javax.swing.JLabel lblOrderName1;
    private javax.swing.JLabel lblTableName;
    private javax.swing.JLabel lblTableName1;
    private javax.swing.JLabel lblWaiterName;
    private javax.swing.JLabel lblWaiterName1;
    private javax.swing.JTextArea txtCommentArea;
    private javax.swing.JTextArea txtCommentArea1;
    // End of variables declaration//GEN-END:variables
}
