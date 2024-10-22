package Exercise3;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add student names and grades
        studentGrades.put("John", 95);
        studentGrades.put("Emma", 88);
        studentGrades.put("Sophia", 92);
        studentGrades.put("Lucas", 78);
        studentGrades.put("Mia", 91);

        // Display students who scored above 90
        System.out.println("Students who scored above 90:");
        for (String student : studentGrades.keySet()) {
            if (studentGrades.get(student) > 90) {
                System.out.println(student + ": " + studentGrades.get(student));
            }
        }
    }
}
