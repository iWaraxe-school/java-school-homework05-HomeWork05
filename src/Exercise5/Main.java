package Exercise5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, HashMap<String, String>> complexMap = new HashMap<>();

        complexMap.put("Belarus", new HashMap<>());
        complexMap.get("Belarus").put("Population", "10'000'000");
        complexMap.get("Belarus").put("Capital", "Minsk");

        complexMap.put("Russia", new HashMap<>());
        complexMap.get("Russia").put("Population", "140'000'000");
        complexMap.get("Russia").put("Capital", "Moscow");

        complexMap.put("Poland", new HashMap<>());
        complexMap.get("Poland").put("Population", "37'000'000");
        complexMap.get("Poland").put("Capital", "Warsaw");

        System.out.println(complexMap);
    }
}
