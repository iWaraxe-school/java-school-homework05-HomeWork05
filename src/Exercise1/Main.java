package Exercise1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            array.add((int)(Math.random() * 100));
        }
        for (int i = 0; i < 10; i += 2) {
            System.out.println(array.get(i));
        }
    }
}