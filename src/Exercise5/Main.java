package Exercise5;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> countries = new HashMap<>();

        // Add details for three countries
        HashMap<String, String> franceInfo = new HashMap<>();
        franceInfo.put("Capital", "Paris");
        franceInfo.put("Population", "67 million");

        HashMap<String, String> usaInfo = new HashMap<>();
        usaInfo.put("Capital", "Washington D.C.");
        usaInfo.put("Population", "331 million");

        HashMap<String, String> japanInfo = new HashMap<>();
        japanInfo.put("Capital", "Tokyo");
        japanInfo.put("Population", "126 million");

        countries.put("France", franceInfo);
        countries.put("USA", usaInfo);
        countries.put("Japan", japanInfo);

        // Display country information
        for (String country : countries.keySet()) {
            System.out.println("Country: " + country);
            System.out.println("Details: " + countries.get(country));
        }
    }
}
