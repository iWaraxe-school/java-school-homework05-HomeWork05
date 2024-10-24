package Exercise6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(312);
        list.add(50);
        list.add(57);
        list.add(33);
        list.add(11);
        list.add(4);
        list.add(77);
        list.add(332);
        list.add(1);
        System.out.println("Initial List:");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted List:");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Reverse sorted List:");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("Shuffled List:");
        System.out.println(list);

    }
}
