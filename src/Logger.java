/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oscar
 */
public class Logger {

    public void AddLog(int id, String log) {
        //Add a log to the database
        Databases data = new Databases();

        String query = "INSERT INTO LOGS (user_id, log) "
                + "VALUES (" + id + ", '" + log + "')";

        //Push the log
        data.GenPush(query);
        data.CloseConnection();
    }
}
