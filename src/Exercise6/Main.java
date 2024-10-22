package Exercise6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the list
        numbers.add(10);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);
        numbers.add(25);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted list in descending order: " + numbers);

        // Shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);
    }
}
