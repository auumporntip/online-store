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
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import javaapplication43.Bill;
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
    public int getLastOrderId(){
        int countBill=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select * from orders";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            ResultSet rs = pstm.executeQuery();
      
            while (rs.next()) {
                countBill++;
                System.out.println("getlast order"+countBill);
            }
            
            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return countBill;
    }
    public int getCustId(String username){
        int cid=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select custID from customer where username = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setString(1, username);
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
    
    public int getLocationId(String houseNo,String street,String district,String province,String postcode){
        int locationid=0;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select locationID from location where houseNo = ? AND street = ? AND district = ? AND province = ? AND postcode = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setString(1, houseNo);
            pstm.setString(2, street);
            pstm.setString(3, district);
            pstm.setString(4, province);
            pstm.setString(5, postcode);
            ResultSet rs = pstm.executeQuery();
      
            if (rs.next()) {
                locationid = rs.getInt("locationID");
            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return locationid;
    }
    public static void addOrderDetail(int pid, double price,int billid,int qid) {
        boolean status = false;
        
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO order_detail "
                    +"(prodID,price,quantity,orderID) " 
                    + "VALUES (?,?,?,?)";
            System.out.println("1");
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pid);
            pstm.setDouble(2, price);
            pstm.setInt(3, qid);
            pstm.setInt(4, billid);
            
            int rs = pstm.executeUpdate();
            System.out.println("ADD ORDER Detail SUCCESS");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateOrder(double totalprice,int locationid ,int orderid) {

        boolean status = false;
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "UPDATE orders set totalPrice = ? ,locationID = ? WHERE orderID = ?";

 
            
            PreparedStatement pstm = conn.prepareStatement(sql);
  
            pstm.setDouble(1, totalprice);
            pstm.setInt(2, locationid);
            pstm.setInt(3, orderid);
   
            
            int rs = pstm.executeUpdate();
            System.out.println("update ORDER SUCCESS");
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addOrder(int custId) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        String dateNow = dateFormat.format(date);
        boolean status = false;
        try {
            Connection conn = ConnectionBuilder.getConnection();
            String sql = "INSERT INTO orders "
                    +"(orderDate,totalPrice,custID,locationID)" 
                    + "VALUES (?,?,?,?) ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dateNow);
            pstm.setDouble(2, 0);
            pstm.setInt(3, custId);
            pstm.setInt(4, 1);
            
            int rs = pstm.executeUpdate();
            System.out.println("ADD ORDER SUCCESS");
            conn.close();
        } catch (Exception ex) {
            System.out.println("addOrder Error");
        }
    }
    
    public static void showOrderTable(JTable jTable1,int orderId){
        jTable1.setModel(new DefaultTableModel());
        DefaultTableModel lct=(DefaultTableModel)jTable1.getModel();
        lct.addColumn("ลำดับสินค้า");
        lct.addColumn("ชื่อสินค้า");
        lct.addColumn("จำนวน");
        lct.addColumn("ราคา");
        int a=0;
        double sumprice = 0;
        Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement s = null;
        String sql="";
        try {
            sql = "SELECT od.order_detailID,p.prodname,od.quantity,p.price FROM order_detail od JOIN product p ON od.prodID=p.prodID WHERE od.orderID = ? ORDER BY 1";

            s = conn.prepareStatement(sql);
            System.out.println(orderId+" order id function");
            s.setInt(1,orderId);
            System.out.println("11111");
            ResultSet rs=s.executeQuery();
            while(rs.next()){
                System.out.println("222222");
                sumprice = (double)(rs.getInt("quantity")*rs.getDouble("price"));
                
                lct.addRow(new Object[0]);
                lct.setValueAt(rs.getInt("order_detailID"),a,0);
                lct.setValueAt(rs.getString("prodname"),a,1);
                lct.setValueAt(rs.getInt("quantity"),a,2);
                lct.setValueAt(sumprice,a,3);
                a++;
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
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
    
    public double getTotalPrice(int orderId) {
        double totalPrice = 0.0,sum = 0.0;
        try {
            
            Connection conn = ConnectionBuilder.getConnection();
            String sqlCmd = "select price,quantity from order_detail where orderID = ?";
            PreparedStatement pstm = conn.prepareStatement(sqlCmd);
            pstm.setInt(1, orderId);
            ResultSet rs = pstm.executeQuery();
            double p,q;
            while (rs.next()) {
                p=rs.getDouble("price");
                q=rs.getInt("quantity");

                sum = (double)p*q;

                totalPrice += sum;

            }

            conn.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return totalPrice;
    }

    public void addLocation(String houseNo, String street ,String district,String province, String postcode, int custID) throws SQLException {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO `location` ( `houseNo`, `street`, `district`, `province`, `postcode`, `custID`) "
                            + "VALUES ( ?, ?, ?, ?, ?, ?);");
            regis.setString(1, houseNo);
            regis.setString(2, street);
            regis.setString(3, district);
            regis.setString(4, province);
            regis.setString(5, postcode);
            regis.setInt(6, custID);

            regis.executeUpdate();
            System.out.println("ADD LOCATION SUCCESS");
            con.close();

        }
    }
    
}
