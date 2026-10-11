import java.util.Scanner;

public class PSUStudentInputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        try {
            PSUStudent u = new UndergradStudent(age, gpa);
            PSUStudent g = new GradStudent(age, gpa);
            System.out.println("Created UndergradStudent and GradStudent successfully.");
            System.out.println("Undergrad age: " + u.getAge() + ", Grad age: " + g.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}