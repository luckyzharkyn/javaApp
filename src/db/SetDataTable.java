package db;

import DTO.SiteUser;
import services.Helper;

public class SetDataTable {
    public static boolean setUser(SiteUser user) {
        DatabaseHandler databaseHandler = new DatabaseHandler();

        String insertQuery = "INSERT INTO buysale.users (id, name, surname, login, password, email) VALUES (?, ?, ?, ?, ?, ?);";
        int isSuccess = databaseHandler.executeUpdate(insertQuery, Helper.generateId(), user.getName(), user.getSurname(), user.getLogin(), user.getPassword(), user.getEmail());
        return isSuccess > 0;
    }
}
