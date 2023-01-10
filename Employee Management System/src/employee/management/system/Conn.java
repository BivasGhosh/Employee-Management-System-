package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem1","root","Bivas@2000");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}