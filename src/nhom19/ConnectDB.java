
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

    String uRl = "jdbc:derby://localhost:1527/QLRuou";
    String userName = "nhom20";
    String pas = "1";

    
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
