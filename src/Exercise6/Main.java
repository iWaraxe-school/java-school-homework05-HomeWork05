package Exercise6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int size = (int)(Math.random() * 5 + 5);
        for (int i = 0; i < size; ++i) {
            array.add((int)(Math.random() * 99));
        }
        System.out.println(array);
        Collections.sort(array, Collections.reverseOrder());
        System.out.println(array);
        Collections.shuffle(array);
        System.out.println(array);
    }
}
