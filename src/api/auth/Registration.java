package api.auth;

import DTO.SiteUser;
import api.ReadBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import db.GetTableData;
import db.SetDataTable;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import services.Helper;

import java.io.IOException;
import java.util.List;

public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // Устанавливаем кодировку запроса и ответа в UTF-8
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=UTF-8");

        StringBuilder requestBody = ReadBody.getRequest(req);
        ObjectMapper objectMapper = new ObjectMapper();
        SiteUser user = objectMapper.readValue(requestBody.toString(), SiteUser.class);
        Helper.show("user", user.toString());
        List<SiteUser> users = GetTableData.getAllUsers();
        boolean hasUser = false;
        for (SiteUser elem : users) {
            if (elem.getEmail().equals(user.getEmail())) {
                hasUser = true;
                break;
            }
        }

        JSONObject jsonResponse = new JSONObject();
        if (hasUser) {
            jsonResponse.put("isSuccess", false);
            jsonResponse.put("description", "Такой пользователь уже существует");
        } else {
            boolean isSuccess = SetDataTable.setUser(user);
            if (isSuccess) {
                jsonResponse.put("isSuccess", true);
            } else {
                jsonResponse.put("isSuccess", false);
                jsonResponse.put("description", "Что-то пошло не так");
            }
        }

        // Отправляем ответ клиенту
        resp.getWriter().println(jsonResponse.toString());
    }
}
