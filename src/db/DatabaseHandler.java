package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    private Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?verifyServerCertificate=false" +
                "&useSSL=false" +
                "&requireSSL=false" +
                "&useLegacyDatetimeCode=false" +
                "&serverTimezone=UTC" +
                "&allowPublicKeyRetrieval=true";
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public <T> T executeQuery(String query, ResultSetProcessor<T> processor, Object... params) {
        try (Connection connection = getDbConnection();
             PreparedStatement prSt = connection.prepareStatement(query)) {

            for (int i = 0; i < params.length; i++) {
                prSt.setObject(i + 1, params[i]);
            }

            ResultSet resultSet = prSt.executeQuery();
            return processor.process(resultSet);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int executeUpdate(String query, Object... params) {
        try (Connection connection = getDbConnection();
             PreparedStatement prSt = connection.prepareStatement(query)) {

            for (int i = 0; i < params.length; i++) {
                prSt.setObject(i + 1, params[i]);
            }

            return prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
