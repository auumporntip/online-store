/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import javaapplication43.OnlineStore;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.ConnectionBuilder;
import model.Function;

/**
 *
 * @author acer
 */
public class Shoes extends javax.swing.JFrame {

    ResultSet rs;

    /**
     * Creates new form SHOES
     */
    private String username ="";
    public Shoes() {
        initComponents();
        showData();
    }
     public Shoes(String user) {
        initComponents();
        showData();
        username = user;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
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
        jButton5 = new javax.swing.JButton();
        jspinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(23, 26, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(189, 76));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ONLINE STORE");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 0, -1, -1));

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SHOES");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 786, -1));

        jPanel5.setBackground(new java.awt.Color(103, 107, 127));
        jPanel5.setPreferredSize(new java.awt.Dimension(625, 511));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("NIKE");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("LACOSTE");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setText("GET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        prodID.setBackground(new java.awt.Color(255, 204, 204));
        prodID.setEnabled(false);
        jPanel5.add(prodID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 180, -1));

        prodname.setBackground(new java.awt.Color(255, 204, 204));
        prodname.setEnabled(false);
        jPanel5.add(prodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 180, -1));

        price.setBackground(new java.awt.Color(255, 204, 204));
        price.setEnabled(false);
        jPanel5.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 180, -1));

        prodname2.setBackground(new java.awt.Color(255, 204, 204));
        prodname2.setEnabled(false);
        jPanel5.add(prodname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 180, -1));

        prodID2.setBackground(new java.awt.Color(255, 204, 204));
        prodID2.setEnabled(false);
        jPanel5.add(prodID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 180, -1));

        price2.setBackground(new java.awt.Color(255, 204, 204));
        price2.setEnabled(false);
        jPanel5.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 180, -1));
        jPanel5.add(jspinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 43, 31));

        description2.setBackground(new java.awt.Color(255, 204, 204));
        description2.setColumns(20);
        description2.setLineWrap(true);
        description2.setRows(5);
        description2.setEnabled(false);
        jScrollPane2.setViewportView(description2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jScrollPane3.setEnabled(false);

        description.setBackground(new java.awt.Color(255, 204, 204));
        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        description.setEnabled(false);
        jScrollPane3.setViewportView(description);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, -1));

        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton5.setText("GET");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));
        jPanel5.add(jspinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 43, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\8.png")); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\10.png")); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel14.setText("รหัสสินค้า :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel15.setText("ชื่อสินค้า :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel16.setText("ราคา :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel17.setText("รายละเอียด :");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel12.setText("จำนวน :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel18.setText("รหัสสินค้า :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel19.setText("ชื่อสินค้า :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel20.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel20.setText("ราคา :");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel21.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel21.setText("รายละเอียด :");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel13.setText("จำนวน :");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 786, 503));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        OnlineStore Info = new OnlineStore(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Function func = new Function();
        int pid = Integer.parseInt(prodID2.getText());
        Object o = jspinner2.getValue();
        Number n = (Number) o;
        int quantity = n.intValue();
        double p = Double.parseDouble(price2.getText());
        func.addOrderDetail(pid,p,func.getLastOrderId(),quantity);
        //------------------------------------------//        
        ORDER Info = new ORDER(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 ORDER Info = new ORDER(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showData() {
        String sql = "select * from product where catID = 6";
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
            java.util.logging.Logger.getLogger(Shoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JTextArea description2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
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
