package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Timur", 100);
        map.put("Kirill", 44);
        map.put("Artem", 91);
        map.put("Artur", 23);
        map.put("Katya", 95);
        map.put("Oleg", 67);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 90) {
                System.out.println(entry.getKey());
            }
        }
    }
}
