
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author oscar
 */
public class Databases {

    public static Connection conn;
    public static String url = "jdbc:derby://localhost:1527/COMP607-Casino";
    public static String username = "COMP607";
    public static String password = "1234";

    public boolean CreateConnection() {
        //create connection to database
        try {
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ResultSet GenPull(String query) {
        //take a query and returne result
        try {
            ResultSet result;

            Statement statement = conn.createStatement();
            result = statement.executeQuery(query);

            return result;

        } catch (SQLException ex) {
            return null;
        }
    }

    public void GenPush(String query) {
        //take a query and push it to database
        
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);
            
        } catch (SQLException ex) {

        }
    }
}
