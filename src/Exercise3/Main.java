package Exercise3;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        HashMap<String, Integer> school_class = new HashMap<String, Integer>();

        school_class.put("Ion", rand.nextInt(100));
        school_class.put("Artiom", rand.nextInt(100));
        school_class.put("Dima", rand.nextInt(100));
        school_class.put("Sandu", rand.nextInt(100));
        school_class.put("Igor", rand.nextInt(100));
        school_class.put("Valentin", rand.nextInt(100));
        school_class.put("Valeriu", rand.nextInt(100));
        school_class.put("Cristian", rand.nextInt(100));
        school_class.put("Bogdan", rand.nextInt(100));
        school_class.put("Vlad", rand.nextInt(100));
        school_class.put("Gleb", rand.nextInt(100));
        school_class.put("Anton", rand.nextInt(100));
        school_class.put("Iana", rand.nextInt(100));
        school_class.put("Vera", rand.nextInt(100));
        school_class.put("Anya", rand.nextInt(100));


        for (String i : school_class.keySet() ) {
           if (school_class.get(i) > 90){
               System.out.println(i+" got "+school_class.get(i));

           }
        }
    }
}
