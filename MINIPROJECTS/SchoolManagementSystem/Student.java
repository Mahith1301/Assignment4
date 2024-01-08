package SchoolManagementSystem;

import java.util.*;
// Student class
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
    }
}

// StudentList class
class StudentList {
    private List<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("------------------------");
        }
    }
}
