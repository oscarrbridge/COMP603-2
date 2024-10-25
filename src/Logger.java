
public class Logger {

    int id;

    Logger(int id) {
        this.id = id;
    }

    public void AddLog(String log) {
        //Add a log to the database
        Databases data = new Databases();

        String query = "INSERT INTO LOGS (user_id, log) "
                + "VALUES (" + id + ", '" + log + "')";

        //Push the log
        data.GenPush(query);
        data.CloseConnection();
    }
}
