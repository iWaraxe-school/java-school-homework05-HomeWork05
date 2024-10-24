package Exercise4;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<Integer>();  //Creating a LinkedList<> implementation for Queue

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Initial List");
        System.out.println(list);
        list.poll();
        list.poll();
        System.out.println("List after removing 2 elements");
        System.out.println(list);
        list.offer(11);
        list.offer(12);
        list.offer(13);
        System.out.println("List after offering 3 new elements");
        System.out.println(list);


    }
}
