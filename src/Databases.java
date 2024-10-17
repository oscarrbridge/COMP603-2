
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databases {

    public static Connection conn;
    public static String url = "jdbc:derby:COMP607-Casino;create=true";
    //Username: COMP607
    //Password: 1234

    Databases() {
        //create connection to database
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Created");

        } catch (SQLException ex) {
            System.out.println("Connection could not be made. Error: " + ex);
        }
    }

    public boolean CreateConnection() {
        return true;
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

    public boolean GenPush(String query) {
        //take a query and push it to database

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

            System.out.println("Push query made");
            return true;

        } catch (SQLException ex) {
            System.out.println("Push query error: " + ex);
            return false;
        }
    }

    public void CloseConnection() {
        try {
            conn.close();
            System.out.println("Connection Closed");

        } catch (SQLException ex) {
            System.out.println("Connection could not closed. Error: " + ex);
        }
    }
}
