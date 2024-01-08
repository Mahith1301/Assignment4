package SchoolManagementSystem;
import java.util.*;

// BusinessLogic interface
interface BusinessLogic {
    void enrollStudent(Student student, Course course);

    void displayCourses();

    void displayTeachers();

    void displayStudents();

    List<Course> getCoursesList();
}


class SchoolManagementSystem implements BusinessLogic {
    private List<Course> courses;
    private List<Teacher> teachers;
    private StudentList studentList;

    public SchoolManagementSystem() {
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.studentList = new StudentList();
        initializeData();
    }

    private void initializeData() {
        // Initialize some teachers
        Teacher mathTeacher = new Teacher("Mr. swaminathan");
        Teacher scienceTeacher = new Teacher("Mr. satish kumar ");

        // Initialize some courses
        courses.add(new MathCourse("mathematics", mathTeacher));
        courses.add(new ScienceCourse("physics", scienceTeacher));

        // Add teachers to the list
        teachers.add(mathTeacher);
        teachers.add(scienceTeacher);

        // Add some students to the list
        studentList.addStudent(new Student("gowtam"));
        studentList.addStudent(new Student("sanjay"));
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        // Add enrollment logic here (not specified in the question)
        System.out.println(student.getStudentName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void displayCourses() {
        System.out.println("List of Courses:");
        for (Course course : courses) {
            course.displayInfo();
            System.out.println("------------------------");
        }
    }

    @Override
    public void displayTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayInfo();
            System.out.println("------------------------");
        }
    }

    @Override
    public void displayStudents() {
        studentList.displayStudents();
    }

    @Override
    public List<Course> getCoursesList() {
        return courses;
    }
}
