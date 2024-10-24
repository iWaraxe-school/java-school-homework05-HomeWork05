package Exercise1;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();   //creating Arraylist

        for (int i = 0; i < 10 ; i++) {

            list.add(rand.nextInt(100));     //Adding 10 random Integers to Arraylist
            System.out.println(list.get(i));  //Printing each item from ArrayList
        }
    }
}
