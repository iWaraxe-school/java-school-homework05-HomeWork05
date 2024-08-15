package Exercise2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Harry Potter");
        set.add("Hobbit");
        set.add("Archmage");
        set.add("Harry Potter");
        set.add("Hobbit");
        set.add("The Wonderful Wizard of Oz");
        set.add("Hobbit");
        System.out.println(set);
    }
}
