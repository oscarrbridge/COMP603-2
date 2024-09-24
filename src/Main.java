/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Main {
    public static void main(String[] args) {
        Databases data = new Databases();
        System.out.println(data.CreateConnection());
        
        frmLogin login = new frmLogin();
        login.show();
    }
    
    private void CreateDatabases() {
        
        String users_table = "CREATE TABLE Users "
                + "(ID INT, "
                + "Username VARCHAR(20), "
                + "Password VARCHAR(20), "
                + "Credits INT;";
    }
}
