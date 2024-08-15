package Exercise4;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; ++i) {
            q.add((int)(Math.random() * 100));
        }
        System.out.println(q);
        for (int i = 0; i < 2; ++i) {
            q.poll();
        }
        System.out.println(q);
        for (int i = 0; i < 3; ++i) {
            q.add((int)(Math.random() * 100));
        }
        System.out.println(q);
    }
}
