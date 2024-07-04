package db;

import DTO.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseHandler dbHandler = DatabaseHandler.getDatabaseHandler();

        // Пример выполнения запроса на вставку
        String insertQuery = "INSERT INTO users (firstName, lastName, username, password, location, gender) VALUES (?, ?, ?, ?, ?, ?)";
        int rowsInserted = dbHandler.executeUpdate(insertQuery, "John", "Doe", "johndoe", "password", "New York", "male");
        System.out.println("Rows inserted: " + rowsInserted);

        // Пример выполнения запроса на выборку
        String selectQuery = "SELECT * FROM users WHERE username = ?";
        List<User> users = dbHandler.executeQuery(selectQuery, resultSet -> {
            List<User> userList = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User();
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setLocation(resultSet.getString("location"));
                user.setGender(resultSet.getString("gender"));
                userList.add(user);
            }
            return userList;
        }, "johndoe");

        for (User user : users) {
            System.out.println(user);
        }
    }
}
