package Exercise6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(4);
        arrayList.add(0);
        arrayList.add(1);

        //Sorting arrayList of numbers in descending order
        arrayList.sort((a, b) -> b - a);
        System.out.println("Numbers in descending order - " + arrayList);

        //Shuffling it randomly
        Collections.shuffle(arrayList);
        System.out.println("Numbers in random order - " + arrayList);

    }
}
