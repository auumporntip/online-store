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
import java.sql.*;

/**
 *
 * @author Bestiiz
 */
public class User {

    private int custID;
    private String fName;
    private String lName;
    private String gender;
    private String birthdate;
    private String phone;
    private String email;
    private String username;
    private String password;

    public User() {
        
    }

    public void login(String usern, String pass) {
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM `customer` WHERE `username`=? AND `password`=?");
            ps.setString(1, usern);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User.orm(rs, this);
                con.close();
            } else {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void logout() {
        this.setCustID(0);
        this.fName = "";
        this.lName = "";
        this.gender = "";
        this.birthdate = "";
        this.phone = "";
        this.email = "";
        this.username = "";
        this.password = "";
        
        
    }

    public User(int custID, String fName, String lName, String gender, String birthdate, String phone, String email, String username, String password) {
        this.custID = custID;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void register(String fName, String lName ,String gender,String birthdate, String phone, String email, String username, String password) throws SQLException {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO `customer` ( `fName`, `lName`, `gender`, `birthdate`, `phone`, `email`, `username`, `password`) "
                            + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);");
            regis.setString(1, fName);
            regis.setString(2, lName);
            regis.setString(3, gender);
            regis.setString(4, birthdate);
            regis.setString(5, phone);
            regis.setString(6, email);
            regis.setString(7, username);
            regis.setString(8, password);
            regis.executeUpdate();
            con.close();

            this.fName = fName;
            this.lName = lName;
            this.gender = gender;
            this.birthdate = birthdate;
            this.phone = phone;
            this.email = email;
            this.username = username;
            this.password = password;
        }
    }
    
    

    
    public static void orm(ResultSet rs, User user) throws SQLException {
        user.setfName(rs.getString("fName"));
        user.setlName(rs.getString("lName"));
        user.setUsername(rs.getString("username"));
        user.setPhone(rs.getString("phone"));
        user.setEmail(rs.getString("email"));
        
        user.setGender(rs.getString("gender"));
        user.setBirthdate(rs.getString("birthdate"));
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
