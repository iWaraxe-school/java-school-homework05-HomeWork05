package Exercise5;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> city1 = new HashMap<>();
        HashMap<String, Integer> city2 = new HashMap<>();
        HashMap<String, Integer> city3 = new HashMap<>();

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        city1.put("Chisinau", 500_000);
        city2.put("Bucharest", 3_000_000);
        city3.put("Kyiv", 2_950_000);

        map.put("Moldova", city1);
        map.put("Romania", city2);
        map.put("Ukraine", city3);

        System.out.println(map);



    }
}
