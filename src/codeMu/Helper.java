package codeMu;

public class Helper {
    static <T> void show(T value) {
        System.out.println(value);
    }

    static String mergeStroke(String... values) {
        StringBuilder s = new StringBuilder();
        for(String e : values) {
            s.append(e);
        }
        return s.toString();
    }
}