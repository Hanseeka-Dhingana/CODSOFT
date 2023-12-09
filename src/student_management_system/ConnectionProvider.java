/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;
import java.sql.*;
import javax.swing.*;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             //Connection
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management?useSSL=false","root","@123#");
            
            return connection;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
