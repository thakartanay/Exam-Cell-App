/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamCell;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanay Thakar
 */

public class db {
    Connection conn = null;
    
    public static Connection connect()
    {
        try
        {
            String drivername = "org.sqlite.JDBC";
            Class.forName(drivername);
            String currentDir=System.getProperty("user.dir");
            Connection conn = DriverManager.getConnection("JDBC:sqlite:"+currentDir+"\\Database\\ExamCellDB.sqlite");
            conn.setAutoCommit(true);
            return conn;
           
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
