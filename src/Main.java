
public class Main {

    public static void main(String[] args) {

        CreateDatabases();

        frmLogin login = new frmLogin();
        login.show();
    }

    private static void CreateDatabases() {
        //Create database schema
        Databases data = new Databases();

        String users_table = "CREATE TABLE Users ("
                + "ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
                + "Username VARCHAR(20) NOT NULL, "
                + "Password VARCHAR(20) NOT NULL, "
                + "Credits INT DEFAULT 0)";

        String logs_table = "CREATE TABLE LOGS ("
                + "log_id INT NOT NULL GENERATED ALWAYS AS IDENTITY, "
                + "user_id INT NOT NULL, "
                + "log VARCHAR(255) NOT NULL, "
                + "log_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP, "
                + "PRIMARY KEY (log_id), "
                + "CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES USERS (id)"
                + ")";

        data.GenPush(users_table);
        data.GenPush(logs_table);
        
        data.CloseConnection();
    }
}
