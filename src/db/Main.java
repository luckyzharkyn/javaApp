package db;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseHandler db = new DatabaseHandler();
        db.signUpUser("Bekzat", "Markabayev", "lucky", "123456", "Astana", "M");
    }
}