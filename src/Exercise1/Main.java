package Exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();

        //Iterating through ArrayList, limiting array's size to 10 elements
        while (arrayListOfNumbers.size() < 10) {
            //Using class Random to populate it with 10 random numbers
            Random rand = new Random();
            arrayListOfNumbers.add(rand.nextInt(100));
        }

        System.out.println(arrayListOfNumbers);

        for (int i = 0; i < arrayListOfNumbers.size(); i++) {
            //Checking if the index is even using %
            if (i % 2 == 0) {
                System.out.print(arrayListOfNumbers.get(i) + " ");
            }
        }
        System.out.println();

    }
}