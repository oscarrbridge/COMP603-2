
public class Main {

    public static void main(String[] args) {

        CreateDatabases();

        frmLogin login = new frmLogin();
        login.show();
    }

    private static void CreateDatabases() {
        //Create database schema
        Databases data = new Databases();

        String users_table = "CREATE TABLE Users "
                + "(ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
                + "Username VARCHAR(20), "
                + "Password VARCHAR(20), "
                + "Credits INT)";

        data.GenPush(users_table);
        data.CloseConnection();
    }
}
