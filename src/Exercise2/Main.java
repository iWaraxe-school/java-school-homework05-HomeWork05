package Exercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> bookTitles = new HashSet<>();

        // Add book titles
        bookTitles.add("Harry Potter");
        bookTitles.add("The Lord of the Rings");
        bookTitles.add("Harry Potter"); // Duplicate
        bookTitles.add("The Hobbit");

        // Print unique titles
        System.out.println("Unique book titles:");
        for (String title : bookTitles) {
            System.out.println(title);
        }
    }
}
