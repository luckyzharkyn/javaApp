package api;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;

public class AnotherApiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");

        // Создаем JSON объект
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("data", "This is another API endpoint!");

        // Отправляем JSON в ответ
        resp.getWriter().println(jsonResponse.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");

        // Читаем тело запроса
        BufferedReader reader = req.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }

        // Создаем JSON объект из тела запроса
        JSONObject jsonRequest = new JSONObject(requestBody.toString());

        // Создаем JSON ответ
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("receivedData", jsonRequest);

        // Отправляем JSON в ответ
        resp.getWriter().println(jsonResponse.toString());
    }
}
