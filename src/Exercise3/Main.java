package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> schoolJournal = new HashMap<>();
        schoolJournal.put("John Smith", 100);
        schoolJournal.put("Jack Evans", 95);
        schoolJournal.put("Eve Mendes", 30);
        schoolJournal.put("Tony Stark", 90);

        //Iterating through the hashMap's entrySet
        for (Map.Entry<String, Integer> entry : schoolJournal.entrySet()) {
            Integer grade = entry.getValue();

            if (grade > 90) {
                System.out.println(entry.getKey());
            }
        }

    }
}
