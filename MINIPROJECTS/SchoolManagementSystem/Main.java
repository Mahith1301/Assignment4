package SchoolManagementSystem;

import SchoolManagementSystem.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Main class
public class Main {

    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("courses available are mathematics by swaminathan and physics by satish kumar");
        while (true) {
            System.out.println("\nSchool Management System Menu:");
            System.out.println("1. Enroll Student");
            System.out.println("2. Display Courses");
            System.out.println("3. Display Teachers");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    enrollStudent(system, scanner);
                    break;
                case 2:
                    system.displayCourses();
                    break;
                case 3:
                    system.displayTeachers();
                    break;
                case 4:
                    system.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting School Management System. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void enrollStudent(BusinessLogic system, Scanner scanner) {
        // Logic to enroll a student in a course
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        // Create a new student
        Student student = new Student(studentName);

        // Display available courses
        system.displayCourses();
        System.out.print("Enter course name to enroll in: ");
        String courseName = scanner.nextLine();

        // Find the course from the system
        Course selectedCourse = findCourseByName(courseName, system);

        if (selectedCourse != null) {
            // Enroll the student in the course
            system.enrollStudent(student, selectedCourse);
            System.out.println(student.getStudentName() + " enrolled in " + selectedCourse.getCourseName());
        } else {
            System.out.println("Course not found: " + courseName);
        }
    }

    private static Course findCourseByName(String courseName, BusinessLogic system) {
        // Logic to find a course by name
        List<Course> courses = system.getCoursesList();

        if (courses != null) {
            for (Course course : courses) {
                if (course.getCourseName().equalsIgnoreCase(courseName)) {
                    return course;
                }
            }
        }

        return null;
    }
}