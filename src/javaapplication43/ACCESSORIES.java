/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.ConnectionBuilder;
import model.Function;

/**
 *
 * @author acer
 */
public class ACCESSORIES extends javax.swing.JFrame {

    ResultSet rs;
    private String username = "";

    /**
     * Creates new form ACCESSORIES
     */
    public ACCESSORIES() {
        initComponents();
        showData();
    }

    public ACCESSORIES(String user) {
        initComponents();
        username = user;
        showData();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        prodID = new javax.swing.JTextField();
        prodname = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        prodname2 = new javax.swing.JTextField();
        prodID2 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        jspinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        description2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jspinner2 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(786, 585));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 26, 35));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONLINE STORE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACCESSORIES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, -1, -1));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton2.setText("ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        jPanel3.setBackground(new java.awt.Color(103, 107, 127));
        jPanel3.setPreferredSize(new java.awt.Dimension(625, 511));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("G-SHOCK");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("HERMES");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setText("GET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        prodID.setBackground(new java.awt.Color(255, 204, 204));
        prodID.setEnabled(false);
        jPanel3.add(prodID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, -1));

        prodname.setBackground(new java.awt.Color(255, 204, 204));
        prodname.setEnabled(false);
        jPanel3.add(prodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 180, -1));

        price.setBackground(new java.awt.Color(255, 204, 204));
        price.setEnabled(false);
        jPanel3.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 180, -1));

        prodname2.setBackground(new java.awt.Color(255, 204, 204));
        prodname2.setEnabled(false);
        jPanel3.add(prodname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 180, -1));

        prodID2.setBackground(new java.awt.Color(255, 204, 204));
        prodID2.setEnabled(false);
        jPanel3.add(prodID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 180, -1));

        price2.setBackground(new java.awt.Color(255, 204, 204));
        price2.setEnabled(false);
        jPanel3.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 180, -1));
        jPanel3.add(jspinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 43, 31));

        description2.setBackground(new java.awt.Color(255, 204, 204));
        description2.setColumns(20);
        description2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        description2.setLineWrap(true);
        description2.setRows(5);
        description2.setEnabled(false);
        jScrollPane2.setViewportView(description2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jScrollPane3.setEnabled(false);

        description.setBackground(new java.awt.Color(255, 204, 204));
        description.setColumns(20);
        description.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        description.setLineWrap(true);
        description.setRows(5);
        description.setEnabled(false);
        jScrollPane3.setViewportView(description);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, -1));

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton4.setText("GET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));
        jPanel3.add(jspinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 43, 31));

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\11.png")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\999.png")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel12.setText("จำนวน :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel14.setText("รหัสสินค้า :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel15.setText("ชื่อสินค้า :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel16.setText("ราคา :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel17.setText("รายละเอียด :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel18.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel18.setText("รหัสสินค้า :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel19.setText("ชื่อสินค้า :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel20.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel20.setText("ราคา :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel21.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel21.setText("รายละเอียด :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jLabel22.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel22.setText("จำนวน :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 790, 505));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OnlineStore Info = new OnlineStore(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //----------ADD ORDER TO DATABASE----------//

        Function func = new Function();
        int pid = Integer.parseInt(prodID.getText());
        Object o = jspinner1.getValue();
        Number n = (Number) o;
        int quantity = n.intValue();

        double p = Double.parseDouble(price.getText());
        func.addOrderDetail(pid, p, func.getLastOrderId(), quantity);

        //------------------------------------------//
        ORDER Info = new ORDER(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);  // TODO add your handling code here:


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //----------ADD ORDER TO DATABASE----------//
        Function func = new Function();
        int pid = Integer.parseInt(prodID2.getText());
        Object o = jspinner2.getValue();
        Number n = (Number) o;
        int quantity = n.intValue();
        double p = Double.parseDouble(price2.getText());
        func.addOrderDetail(pid, p, func.getLastOrderId(), quantity);
        //------------------------------------------//

        ORDER Info = new ORDER(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ORDER Info = new ORDER(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void showData() {
        String sql = "select * from product where catID = 2";
        try {
            Connection conn = ConnectionBuilder.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            rs = stm.executeQuery(sql);
            rs.next();
            dataToText(rs);
            if (rs.isLast()) {
                return;
            } else {
                rs.next();
                dataToText2(rs);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void dataToText(ResultSet rs) {
        try {
            prodID.setText(rs.getString(1));
            prodname.setText(rs.getString(2));
            price.setText(rs.getString(4));
            description.setText(rs.getString(3));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void dataToText2(ResultSet rs) {
        try {
            prodID2.setText(rs.getString(1));
            prodname2.setText(rs.getString(2));
            price2.setText(rs.getString(4));
            description2.setText(rs.getString(3));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(ACCESSORIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACCESSORIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACCESSORIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACCESSORIES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACCESSORIES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JTextArea description2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jspinner1;
    private javax.swing.JSpinner jspinner2;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField prodID;
    private javax.swing.JTextField prodID2;
    private javax.swing.JTextField prodname;
    private javax.swing.JTextField prodname2;
    // End of variables declaration//GEN-END:variables
}
