package Exercise2;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
    HashSet<String> books = new HashSet<>();

    books.add("Java");
    books.add("Java");
    books.add("Java");

    books.add("Python");

    books.add("JavaScript");
    books.add("JavaScript");
    books.add("JavaScript");

    books.add("C++");

    books.add("C#");
    books.add("C#");

    System.out.println(books);  //output: [C#, Java, C++, JavaScript, Python]
    }
}
