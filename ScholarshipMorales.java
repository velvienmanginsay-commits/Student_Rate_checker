import java.util.Scanner;

public class ScholarshipStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        String id = input.nextLine();

        System.out.print("Enter general average: ");
        double average = input.nextDouble();

        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("General Average: " + average);

        if (average >= 90) {
            System.out.println("Scholarship Status: Qualified");
        } else {
            System.out.println("Scholarship Status: Not Qualified");
        }

        input.close();
    }
}
