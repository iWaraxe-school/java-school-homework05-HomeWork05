package Exercise5;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> infoUSA = new HashMap<>();
        infoUSA.put("Washington", "334 914 895");
        HashMap<String, HashMap<String, String>> theUSA = new HashMap<>();
        theUSA.put("Usa", infoUSA);
        System.out.println(theUSA);


        HashMap<String, String> infoMd = new HashMap<>();
        infoMd.put("Chisinau", "3 021 783");
        HashMap<String, HashMap<String, String>> MD = new HashMap<>();
        MD.put("Moldova", infoMd);
        System.out.println(MD);


        HashMap<String, String> infoRus = new HashMap<>();
        infoRus.put("Moscow", "144 542 284");
        HashMap<String, HashMap<String, String>> rus = new HashMap<>();
        rus.put("RUSSIA", infoRus);
        System.out.println(rus);
    }
}
