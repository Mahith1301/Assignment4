package SchoolManagementSystem;

// Course abstract class
abstract class Course {
    private String courseName;
    private Teacher teacher;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public abstract void displayInfo();
}

// Concrete class for Science Department
class ScienceCourse extends Course {
    public ScienceCourse(String courseName, Teacher teacher) {
        super(courseName, teacher);
    }

    @Override
    public void displayInfo() {
        System.out.println("Course: " + getCourseName());
        System.out.println("Department: Science");
        System.out.println("Teacher: " + getTeacher().getName());
    }
}

// Concrete class for Math Department
class MathCourse extends Course {
    public MathCourse(String courseName, Teacher teacher) {
        super(courseName, teacher);
    }

    @Override
    public void displayInfo() {
        System.out.println("Course: " + getCourseName());
        System.out.println("Department: Math");
        System.out.println("Teacher: " + getTeacher().getName());
    }
}