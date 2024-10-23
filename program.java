import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<String> students = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    addStudent(name);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.print("Enter student name to remove: ");
                    String studentToRemove = scanner.nextLine();
                    removeStudent(studentToRemove);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    private static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " has been added.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students:");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }

    private static void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " has been removed.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }
}
