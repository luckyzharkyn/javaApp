package codeMu;

import java.util.HashMap;
import java.util.Map;

public class Month {
    private static final String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public static Map<String, Object> getMonth(byte month) {
        Map<String, Object> map = new HashMap<>();
        if(month > months.length || month < 1) {
            map.put("code", 500);
            map.put("value", "Неправильно указан месяц");
        } else {
            map.put("code", 200);
            map.put("value", months[month - 1]);
        }
        return map;
    }
}
