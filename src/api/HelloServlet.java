package api;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");

        // Создаем JSON объект
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("message", "Hello Jetty!");

        // Отправляем JSON в ответ
        resp.getWriter().println(jsonResponse.toString());
    }
}
