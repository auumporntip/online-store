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
public class Historys extends javax.swing.JFrame {

    /**
     * Creates new form Historys
     */
    private String username = "";
    private int orid = 0;
    private boolean checkStatusClick=false;
    public Historys() {
        initComponents();
    }
    public Historys(String user) {
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        History = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        GotoOrder = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 307, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(526, 301));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HISTORY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 150, 46));

        History.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ORDER ID", "DATE", "Total Price"
            }
        ));
        History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(History);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 600, 210));

        jPanel3.setBackground(new java.awt.Color(23, 26, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONLINE STORE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 0, -1, -1));

        back.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        back.setText("BACK");
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 786, 110));

        jPanel4.setBackground(new java.awt.Color(154, 54, 29));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GotoOrder.setIcon(new javax.swing.ImageIcon("D:\\online-store\\src\\pic\\history.png")); // NOI18N
        GotoOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GotoOrderActionPerformed(evt);
            }
        });
        jPanel4.add(GotoOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 70, 70));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 790, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 786, 585));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Function func = new Function();
        History.setModel(new DefaultTableModel());
        DefaultTableModel lct=(DefaultTableModel)History.getModel();
        lct.addColumn("ORDER ID");
        lct.addColumn("DATE");
        lct.addColumn("Total Price");
 
        int a=0;
        Connection conn = ConnectionBuilder.getConnection();
        try {
            
            String sqlCmd = "select * from orders where custId = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setInt(1, func.getCustId(username));
            ResultSet rs = pstm.executeQuery();
      
            while (rs.next()) {
                if(rs.getDouble("totalprice") != 0.0){
                    lct.addRow(new Object[0]);
                    lct.setValueAt(rs.getInt("orderId"), a, 0);
                    lct.setValueAt(rs.getString("orderDate"), a, 1);
                    lct.setValueAt(rs.getDouble("totalprice"), a, 2);

                    a++; 
                }
                
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formComponentShown

    private void GotoOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GotoOrderActionPerformed
        // TODO add your handling code here:
        if(checkStatusClick == true){
            DetailbyHistory online = new DetailbyHistory(username,orid);
            setVisible(false);
            online.setVisible(true);
        }else{
            System.out.println("Not Select Table");
        }
        
    }//GEN-LAST:event_GotoOrderActionPerformed

    private void HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMouseClicked
        // TODO add your handling code here:
        checkStatusClick =true;
        String ordtId;
        DefaultTableModel model = (DefaultTableModel)History.getModel();
        
        ordtId = model.getValueAt(History.getSelectedRow(),0).toString();
        orid = Integer.parseInt(ordtId);
        System.out.println(orid);
    }//GEN-LAST:event_HistoryMouseClicked

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
            java.util.logging.Logger.getLogger(Historys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GotoOrder;
    private javax.swing.JTable History;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
