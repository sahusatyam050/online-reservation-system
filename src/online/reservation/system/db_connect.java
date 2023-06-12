package online.reservation.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author thaku
 */
import java.sql.*;
public class db_connect {
    public Statement s;
    public ResultSet rs;
    db_connect()
    {
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection mycon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","satyam","satyam");
            s=mycon.createStatement();
            
        }
        catch(Exception e)
        {}
    }
}
