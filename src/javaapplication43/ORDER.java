/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConnectionBuilder;
import model.Function;
/**
 *
 * @author acer
 */
public class ORDER extends javax.swing.JFrame {
    private String h="",s="",d="",pr="",po="";
    private String username = "";
    private int orderdetail_id=0;
    public ORDER() {
        initComponents();
    }
    public ORDER(String user) {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        editlocation = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        location = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        orderid = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

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

        jToggleButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jToggleButton1.setText("BACK");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 786, 90));

        jPanel3.setBackground(new java.awt.Color(62, 145, 193));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editlocation.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        editlocation.setText("EDIT LOCATION");
        editlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editlocationActionPerformed(evt);
            }
        });
        jPanel3.add(editlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, 30));

        submit.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, 30));

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
        jTable1.getAccessibleContext().setAccessibleParent(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 590, 109));

        location.setColumns(20);
        location.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        location.setRows(5);
        location.setEnabled(false);
        jScrollPane2.setViewportView(location);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 510, 120));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel5.setText("Location : ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 49));

        totalprice.setEnabled(false);
        totalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalpriceActionPerformed(evt);
            }
        });
        jPanel3.add(totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 150, 30));

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

        delete.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\delete.png")); // NOI18N
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 786, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        Bill Info = new Bill(username);
        
        Function func = new Function();
        double total = Double.parseDouble(totalprice.getText());
        int lid = func.getLocationId(h, s, d, pr, po);
        int orid = func.getLastOrderId();
        func.updateOrder(total,lid,orid);
        
        
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    OnlineStore Info = new OnlineStore(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        Function func = new Function();
        
        
        int orid = func.getLastOrderId();
        double total = func.getTotalPrice(orid);
        System.out.println("TOTAL PRICE : "+total);
        System.out.println(orid+" ORDER");
        orderid.setText(orid+"");
        func.showOrderTable(jTable1,orid);
        totalprice.setText(""+total);
        
        String locate = "";
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select * from location where custId = ? ORDER BY locationID DESC";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setInt(1, func.getCustId(username));
            ResultSet rs = pstm.executeQuery();
      
            if (rs.next()) {
                locate = rs.getString("houseNo")+" "+rs.getString("street")+" "+rs.getString("district")+" "+rs.getString("province") +" "+rs.getString("postcode");
                h=rs.getString("houseNo");
                s=rs.getString("street");
                d=rs.getString("district");
                pr=rs.getString("province");
                po=rs.getString("postcode");
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        location.setText(locate);
    }//GEN-LAST:event_formComponentShown

    private void orderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderidActionPerformed

    private void totalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalpriceActionPerformed

    private void editlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editlocationActionPerformed
        // TODO add your handling code here:
        Location Info = new Location(username);
        this.dispose();
        Info.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Info.setVisible(true);     
    }//GEN-LAST:event_editlocationActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "You want to delete order detail id "+orderdetail_id+" ?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            // Saving code here
            Function func = new Function();
            func.deleteOrderDetail(orderdetail_id);
            int orid = func.getLastOrderId();
            double total = func.getTotalPrice(orid);
            func.showOrderTable(jTable1,orid);
            totalprice.setText(""+total);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:o
        String ordtId;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        ordtId = model.getValueAt(jTable1.getSelectedRow(),0).toString();
        orderdetail_id = Integer.parseInt(ordtId);
        System.out.println(orderdetail_id);
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ORDER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ORDER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton editlocation;
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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea location;
    private javax.swing.JTextField orderid;
    private javax.swing.JButton submit;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables
}
