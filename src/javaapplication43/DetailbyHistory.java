/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.ConnectionBuilder;
import model.Function;

/**
 *
 * @author Bestiiz
 */
public class DetailbyHistory extends javax.swing.JFrame {

    /**
     * Creates new form DetailbyHistory
     */
    private boolean checkStatusClick=false;
    private String username;
    private int orid=0;
    private int orderdetail_id=0;
    public DetailbyHistory() {
        initComponents();
    }
    public DetailbyHistory(String user,int id) {
        initComponents();
        username = user;
        orid =id;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        review = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        location = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        shop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(786, 585));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONLINE STORE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORDER DETIAL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        back.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 90));

        jPanel3.setBackground(new java.awt.Color(92, 146, 156));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        review.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        review.setText("REVIEW");
        review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewActionPerformed(evt);
            }
        });
        jPanel3.add(review, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, 30));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel4.setText("Total Price : ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderDetail ID", "ชื่อสินค้า", "จำนวน", "ราคา"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setIntercellSpacing(new java.awt.Dimension(15, 3));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 640, 109));

        location.setColumns(20);
        location.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        location.setRows(5);
        location.setEnabled(false);
        jScrollPane2.setViewportView(location);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 560, 120));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setText("Location : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 49));

        totalprice.setEnabled(false);
        totalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceActionPerformed(evt);
            }
        });
        jPanel3.add(totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 200, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel3.setText("ORDER :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        orderid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orderid.setEnabled(false);
        orderid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidActionPerformed(evt);
            }
        });
        jPanel3.add(orderid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 106, -1));

        shop.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        shop.setText("SHOP");
        shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopActionPerformed(evt);
            }
        });
        jPanel3.add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 790, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Historys Info = new Historys(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewActionPerformed
        if(checkStatusClick==true)
        {
            Review Info = new Review(username,orid,orderdetail_id);
            this.dispose();
            Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
            Info.setVisible(true); 
        }else{
            System.out.println("table not click");
        }   
                   // TODO add your handling code here:
    }//GEN-LAST:event_reviewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:o
        String ordtId;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        ordtId = model.getValueAt(jTable1.getSelectedRow(),0).toString();
        System.out.println(ordtId);
        checkStatusClick=true;
        orderdetail_id = Integer.parseInt(ordtId);
        //System.out.println(orderdetail_id);

    }//GEN-LAST:event_jTable1MouseClicked

    private void totalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpriceActionPerformed

    private void orderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderidActionPerformed

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
        // TODO add your handling code here:
        OnlineStore Info = new OnlineStore(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);  
    }//GEN-LAST:event_shopActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Function func = new Function();
        double total = func.getTotalPrice(orid);
        func.showOrderTable(jTable1,orid);
        totalprice.setText(""+total);
        String locate = "";
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select l.houseNo,l.street,l.district,l.province,l.postcode from orders o JOIN location l ON o.locationID = l.locationId where o.orderId = ? ORDER BY 1 DESC";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setInt(1, orid);
            ResultSet rs = pstm.executeQuery();
      
            if (rs.next()) {
                locate = rs.getString("houseNo")+" "+rs.getString("street")+" "+rs.getString("district")+" "+rs.getString("province") +" "+rs.getString("postcode");
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        orderid.setText(orid+"");
        location.setText(locate);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(DetailbyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailbyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailbyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailbyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailbyHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea location;
    private javax.swing.JTextField orderid;
    private javax.swing.JButton review;
    private javax.swing.JButton shop;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables
}
