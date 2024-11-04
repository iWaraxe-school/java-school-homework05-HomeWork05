package Exercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("Harry Potter");
        books.add("1917");
        books.add("The Shining");

        //Creating a duplicate title to check the unique HashSet's property
        books.add("Harry Potter");

        System.out.println(books);
    }
}
