package api;

import DTO.City;
import DTO.CityRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import db.GetTableData;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import services.Helper;

import java.io.IOException;
import java.util.List;

public class GetCity extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        StringBuilder requestBody = ReadBody.getRequest(req);

        // Создаем объект ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Преобразуем строку JSON в объект
        CityRequest requestObject = objectMapper.readValue(requestBody.toString(), CityRequest.class);

        List<City> cities = GetTableData.getCityByIds(requestObject.getIds());
        // Сериализуем список городов в JSON
        String jsonResponse = objectMapper.writeValueAsString(cities);

        // Отправляем JSON в ответ
        resp.getWriter().println(jsonResponse.toString());
    }
}
