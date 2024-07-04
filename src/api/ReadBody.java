package api;

import jakarta.servlet.http.HttpServletRequest;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadBody {
    static StringBuilder getRequest(HttpServletRequest req) throws IOException {
        // Читаем тело запроса
        BufferedReader reader = req.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }
        return requestBody;
    }
}
