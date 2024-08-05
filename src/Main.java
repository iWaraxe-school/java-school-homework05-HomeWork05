import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Task 1. ArrayList
        System.out.println("Task 1:");

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i <= 10; i++) {
            numbers.add(rand.nextInt(100)); // Generating random numbers between 0 and 99
        }

        // Print out numbers at even indices
        for (int i = 2; i < numbers.size(); i += 2) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }

        System.out.println("------------------------");

        //Task 2. HashSet
        System.out.println("Task 2:");

        HashSet<String> bookTitles = new HashSet<>();

        // Add book titles, including duplicates
        bookTitles.add("Harry Potter");
        bookTitles.add("Lord of the Rings");
        bookTitles.add("Harry Potter"); // Adding a duplicate title
        bookTitles.add("Game of Thrones");
        bookTitles.add("Lord of the Rings"); // Adding another duplicate title

        // Print out the unique book titles
        System.out.println("Unique book titles:");
        for (String title : bookTitles) {
            System.out.println(title);
        }

        System.out.println("------------------------");

        //Task 3. HashMap
        System.out.println("Task 3:");

        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add student names and their grades
        studentGrades.put("Alex", 85);
        studentGrades.put("Bob", 95);
        studentGrades.put("Kevin", 92);
        studentGrades.put("David", 88);
        studentGrades.put("Hanna", 97);

        // Display students who scored above 90
        System.out.println("Students who scored above 90:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            if (entry.getValue() > 90) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("------------------------");

        //Task 4. LinkedList
        System.out.println("Task 4:");

        LinkedList<String> queue = new LinkedList<>();

        // Add five elements to the queue
        queue.offer("Element1");
        queue.offer("Element2");
        queue.offer("Element3");
        queue.offer("Element4");
        queue.offer("Element5");

        // Display the queue after adding five elements
        System.out.println("Queue after adding five elements: " + queue);

        // Dequeue two elements
        queue.poll();
        queue.poll();

        // Display the queue after dequeuing two elements
        System.out.println("Queue after dequeuing two elements: " + queue);

        // Enqueue three more elements
        queue.offer("Element6");
        queue.offer("Element7");
        queue.offer("Element8");

        // Display the queue after enqueuing three more elements
        System.out.println("Queue after enqueuing three more elements: " + queue);

        System.out.println("------------------------");

        //Task 5. HashMap
        System.out.println("Task 5:");

        HashMap<String, HashMap<String, String>> countries = new HashMap<>();

        // Add country details (capital and population) for three countries
        HashMap<String, String> country1Details = new HashMap<>();
        country1Details.put("Capital", "Paris");
        country1Details.put("Population", "68.4 million");
        countries.put("France", country1Details);

        HashMap<String, String> country2Details = new HashMap<>();
        country2Details.put("Capital", "Berlin");
        country2Details.put("Population", "83.9 million");
        countries.put("Germany", country2Details);

        HashMap<String, String> country3Details = new HashMap<>();
        country3Details.put("Capital", "Tokyo");
        country3Details.put("Population", "121.5 million");
        countries.put("Japan", country3Details);

        // Display details for the three countries
        for (Map.Entry<String, HashMap<String, String>> entry : countries.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            HashMap<String, String> details = entry.getValue();
            for (Map.Entry<String, String> detail : details.entrySet()) {
                System.out.println(detail.getKey() + ": " + detail.getValue());
            }
            System.out.println();
        }

        System.out.println("------------------------");

        //Task 6. ArrayList
        System.out.println("Task 6:");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(10);

        // Sort the ArrayList in descending order
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("ArrayList after sorting in descending order: " + nums);

        // Shuffle the ArrayList
        Collections.shuffle(nums);
        System.out.println("ArrayList after shuffling: " + nums);
    }
}