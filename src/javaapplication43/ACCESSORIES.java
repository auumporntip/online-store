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
import model.Function;
/**
 *
 * @author acer
 */
public class ACCESSORIES extends javax.swing.JFrame {
ResultSet rs;
    /**
     * Creates new form ACCESSORIES
     */
    public ACCESSORIES() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel7 = new javax.swing.JLabel();
        prodID = new javax.swing.JTextField();
        prodname = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        prodname2 = new javax.swing.JTextField();
        prodID2 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        promotion2 = new javax.swing.JTextField();
        jspinner1 = new javax.swing.JSpinner();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        description2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        promotion = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jspinner2 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("ONLINE STORE");

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("ACCESSORIES");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel3.setBackground(new java.awt.Color(255, 173, 173));
        jPanel3.setPreferredSize(new java.awt.Dimension(625, 511));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("G-SHOCK");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 9, -1, -1));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 86, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 173, 173));
        jTextField2.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField2.setText("รหัสสินค้า :");
        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 173, 173));
        jTextField3.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField3.setText("ชื่อสินค้า : ");
        jTextField3.setBorder(null);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jTextField4.setBackground(new java.awt.Color(255, 173, 173));
        jTextField4.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField4.setText("ราคา : ");
        jTextField4.setBorder(null);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTextField7.setBackground(new java.awt.Color(255, 173, 173));
        jTextField7.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField7.setText("รายละเอียด :");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("CISCO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 505, -1, -1));

        jTextField5.setBackground(new java.awt.Color(255, 173, 173));
        jTextField5.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField5.setText("รหัสสินค้า : ");
        jTextField5.setBorder(null);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jTextField6.setBackground(new java.awt.Color(255, 173, 173));
        jTextField6.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField6.setText("ชื่อสินค้า : ");
        jTextField6.setBorder(null);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        jTextField8.setBackground(new java.awt.Color(255, 173, 173));
        jTextField8.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField8.setText("ราคา : ");
        jTextField8.setBorder(null);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jTextField10.setBackground(new java.awt.Color(255, 173, 173));
        jTextField10.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField10.setText("รายละเอียด : ");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton3.setText("GET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 41, -1, -1));

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
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 41, -1, -1));

        jTextField17.setBackground(new java.awt.Color(255, 173, 173));
        jTextField17.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField17.setText("PROMOTION:");
        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        promotion2.setBackground(new java.awt.Color(255, 204, 204));
        promotion2.setEnabled(false);
        jPanel3.add(promotion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 180, -1));
        jPanel3.add(jspinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 43, 31));

        jTextField23.setBackground(new java.awt.Color(255, 173, 173));
        jTextField23.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField23.setText("จำนวน:");
        jTextField23.setBorder(null);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        description2.setColumns(20);
        description2.setLineWrap(true);
        description2.setRows(5);
        description2.setEnabled(false);
        jScrollPane2.setViewportView(description2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jScrollPane3.setEnabled(false);

        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        description.setEnabled(false);
        jScrollPane3.setViewportView(description);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, -1));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jTextField18.setBackground(new java.awt.Color(255, 173, 173));
        jTextField18.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField18.setText("PROMOTION:");
        jTextField18.setBorder(null);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        promotion.setEnabled(false);
        jPanel3.add(promotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 180, -1));

        jTextField24.setBackground(new java.awt.Color(255, 173, 173));
        jTextField24.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jTextField24.setText("จำนวน:");
        jTextField24.setBorder(null);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton4.setText("GET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));
        jPanel3.add(jspinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 43, 31));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OnlineStore Info = new OnlineStore();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //----------ADD ORDER TO DATABASE----------//
        Function func = new Function();
        int pid = Integer.parseInt(prodID.getText());
        Object o = jspinner1.getValue();
        Number n = (Number) o;
        int quantity = n.intValue();
        func.addOrder(pid,func.getLastBillId(),quantity);
        //------------------------------------------//
        
        ORDER Info = new ORDER();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);  // TODO add your handling code here:
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //----------ADD ORDER TO DATABASE----------//
        Function func = new Function();
        int pid = Integer.parseInt(prodID2.getText());
        Object o = jspinner2.getValue();
        Number n = (Number) o;
        int quantity = n.intValue();
        func.addOrder(pid,func.getLastBillId(),quantity);
        //------------------------------------------//
        
        ORDER Info = new ORDER();
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 ORDER Info = new ORDER();
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
            promotion.setText(rs.getString(5));
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
            promotion2.setText(rs.getString(5));
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JSpinner jspinner1;
    private javax.swing.JSpinner jspinner2;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField prodID;
    private javax.swing.JTextField prodID2;
    private javax.swing.JTextField prodname;
    private javax.swing.JTextField prodname2;
    private javax.swing.JTextField promotion;
    private javax.swing.JTextField promotion2;
    // End of variables declaration//GEN-END:variables
}
