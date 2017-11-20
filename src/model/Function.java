/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suwat
 */
public class Function {
    private static String loginUsername = "";
    
    public static String getLoginUsername() {
        return loginUsername;
    }

    public static void setLoginUsername(String loginUsername) {
        Function.loginUsername = loginUsername;
    }
    public int getLastBillId(){
        int countBill=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select * from bill";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setString(1, loginUsername);
            ResultSet rs = pstm.executeQuery();
      
            while (rs.next()) {
                countBill++;
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return countBill;
    }
    public int getCustId(){
        int cid=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select custID from customer where username = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setString(1, loginUsername);
            ResultSet rs = pstm.executeQuery();
      
            if (rs.next()) {
                cid = rs.getInt("custID");
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return cid;
    }
    
    public int getProId(String prodname){
        int cid=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select prodID from product where prodname = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setString(1, prodname);
            ResultSet rs = pstm.executeQuery();
      
            if (rs.next()) {
                cid = rs.getInt("prodID");
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return cid;
    }
    
    public static void addOrder(int pid, int billid,int qid) {
        boolean status = false;
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO order_product "
                    +"(prodID,quantity,billid)" 
                    + "VALUES (?,?,?) ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pid);
            pstm.setInt(2, qid);
            pstm.setInt(3, (billid+1));
            
            int rs = pstm.executeUpdate();
            System.out.println("ADD ORDER SUCCESS");
            conn.close();
        } catch (Exception ex) {
            System.out.println("addOrder Error");
        }
    }
    public static void showOrderTable(JTable jTable1){
        jTable1.setModel(new DefaultTableModel());
        DefaultTableModel lct=(DefaultTableModel)jTable1.getModel();
        lct.addColumn("Order ID");
        lct.addColumn("Product Name");
        lct.addColumn("Quantity");
        lct.addColumn("Price");
        int a=0;
        int sumprice = 0;
        Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement s = null;
        String sql="";
        try {
            sql = "SELECT op.orderID,p.prodname,op.quantity,p.price "
                    + "FROM order_product op JOIN product p ON op.prodID=p.prodID "
                    +"ORDER BY 1";
            s = conn.prepareStatement(sql);
        
            ResultSet rs=s.executeQuery();
            while(rs.next()){
                sumprice = (rs.getInt("quantity")*rs.getInt("price"));
                lct.addRow(new Object[0]);
                lct.setValueAt(rs.getInt("orderID"),a,0);
                lct.setValueAt(rs.getString("prodname"),a,1);
                lct.setValueAt(rs.getString("quantity"),a,2);
                lct.setValueAt(sumprice,a,3);
                a++;
              
            }
            conn.close();
        } catch (SQLException ex) {
            
        }
        try {
            if (s != null) {
                s.close();
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
