/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

    Statement stm = null;
    ResultSet rs = null;
    Connection cnn = null;

    String uRl = "jdbc:derby://localhost:1527/QLRuou";//;create=true";
    String userName = "nhom20";// chema mặc định
    String pas = "1";

    //CREATE SCHEMA <schema name>
    //jdbc:derby://localhost:1527/ktpm3 [ABC on ABC]
    public ConnectDB() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            cnn = DriverManager.getConnection(uRl, userName, pas);
            System.out.println("ket noi thanh cong");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            System.out.println("ket noi that bai" + ex.toString());
        }
    }

    public void doSQL(String sql) {
        try {
            stm = cnn.createStatement();
            stm.execute(sql);
        } catch (SQLException ex) {
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
        }

    }
    
    public PreparedStatement preparedStatement(String query) throws SQLException 
    {
        PreparedStatement pst = cnn.prepareStatement(query);
        return pst;
    }
    
    public Statement createStatement() throws SQLException {
        return cnn.createStatement();
    }
}
