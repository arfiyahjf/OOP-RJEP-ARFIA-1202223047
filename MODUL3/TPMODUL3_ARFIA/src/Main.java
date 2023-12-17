import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            int studentID = 0;
            boolean isValidInput = false;
            while (!isValidInput) {
                try {
                    System.out.println("Enter student ID:");
                    studentID = Integer.parseInt(scanner.nextLine());
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a valid integer for student ID.");
                }
            }

            Student student = new Student(studentName, studentID);
            System.out.println("Enter Courses to enroll in (separated by commas):");
            String[] courses = scanner.nextLine().split(", ");
            for (String course : courses) {
                student.enrollInCourse(course);
            }

            System.out.println("\nCourse ID : 101,");
            System.out.println("Course Name : Statin");
            System.out.println("- Student : Haris");
            System.out.println("- Student : Meta\n");

            System.out.println("Course ID : 102,");
            System.out.println("Course Name : Desjar");
            System.out.println("- Student : Windi");
            System.out.println("- Student : Amilia\n");

            System.out.println(student.getUserDetails());

            Teacher teacher = new Teacher("Pak Yoga Raditya", 101);
            teacher.teachClass("Math");

            Admin admin = new Admin("Hudza", 201);
            admin.manageSystem("the University System");

        } catch (InputMismatchException e) {
            System.out.println("\nInvalid input, please enter a valid integer for student ID.");
        } finally {
            scanner.close();
        }
    }
}