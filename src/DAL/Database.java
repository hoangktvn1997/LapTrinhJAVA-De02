/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manng
 */
public class Database {
    static  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost/qlnhanvien_new?zeroDateTimeBehavior=convertToNull"; 
    static  final String USER = "root"; 
    static  final String PASS = ""; 
    
    public Connection getConnection(){
        Connection conn = null; 
        try { 
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try { 
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Không thể kết nối tới DB","Error",1);
        }
        return conn; 
    }
}
