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
import javaapplication43.OnlineStore;
import javaapplication43.ORDER;
import model.ConnectionBuilder;

/**
 *
 * @author acer
 */
public class SPORT extends javax.swing.JFrame {

    ResultSet rs;

    /**
     * Creates new form SPORT
     */
    public SPORT() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        prodID = new javax.swing.JTextField();
        prodname = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        prodname2 = new javax.swing.JTextField();
        prodID2 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        description2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(189, 76));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("ONLINE STORE");

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setText("SPORTS");

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton2.setText("ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel5.setBackground(new java.awt.Color(255, 173, 173));
        jPanel5.setPreferredSize(new java.awt.Dimension(625, 511));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("BASKETBALL");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 9, -1, -1));
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 86, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 173, 173));
        jTextField2.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField2.setText("รหัสสินค้า :");
        jTextField2.setBorder(null);
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 173, 173));
        jTextField3.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField3.setText("ชื่อสินค้า : ");
        jTextField3.setBorder(null);
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 173, 173));
        jTextField4.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField4.setText("ราคา : ");
        jTextField4.setBorder(null);
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextField7.setBackground(new java.awt.Color(255, 173, 173));
        jTextField7.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField7.setText("รายละเอียด :");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("BASEBALL");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 505, -1, -1));

        jTextField5.setBackground(new java.awt.Color(255, 173, 173));
        jTextField5.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField5.setText("รหัสสินค้า : ");
        jTextField5.setBorder(null);
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jTextField6.setBackground(new java.awt.Color(255, 173, 173));
        jTextField6.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField6.setText("ชื่อสินค้า : ");
        jTextField6.setBorder(null);
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jTextField8.setBackground(new java.awt.Color(255, 173, 173));
        jTextField8.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField8.setText("ราคา : ");
        jTextField8.setBorder(null);
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextField10.setBackground(new java.awt.Color(255, 173, 173));
        jTextField10.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField10.setText("รายละเอียด : ");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setText("GET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 41, -1, -1));

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
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 41, -1, -1));
        jPanel5.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 43, 31));

        jTextField23.setBackground(new java.awt.Color(255, 173, 173));
        jTextField23.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField23.setText("จำนวน:");
        jTextField23.setBorder(null);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        description2.setColumns(20);
        description2.setLineWrap(true);
        description2.setRows(5);
        description2.setEnabled(false);
        jScrollPane2.setViewportView(description2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jScrollPane3.setEnabled(false);

        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        description.setEnabled(false);
        jScrollPane3.setViewportView(description);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\GitHub\\online-store\\src\\pic\\777.png")); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jTextField24.setBackground(new java.awt.Color(255, 173, 173));
        jTextField24.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField24.setText("จำนวน:");
        jTextField24.setBorder(null);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton5.setText("GET");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));
        jPanel5.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 43, 31));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Documents\\GitHub\\online-store\\src\\pic\\888.png")); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 503, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        OnlineStore Info = new OnlineStore();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ORDER Info = new ORDER();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 ORDER Info = new ORDER();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void showData() {
        String sql = "select * from product where catID = 3";
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
            java.util.logging.Logger.getLogger(SPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SPORT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JTextArea description2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField prodID;
    private javax.swing.JTextField prodID2;
    private javax.swing.JTextField prodname;
    private javax.swing.JTextField prodname2;
    // End of variables declaration//GEN-END:variables
}
