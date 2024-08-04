package lab;
import java.util.ArrayList;
import java.util.List;

interface Course
{
    String getCourseName();
    int getCourseCredits();
}

class CourseImpl implements Course {
    private String courseName;
    private int courseCredits;

    public CourseImpl(String courseName, int courseCredits) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public int getCourseCredits() {
        return courseCredits;
    }
}
class Student {
    private String studentName;
    private int studentId;
    private List<Course> enrolledCourses;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName() + " (" + course.getCourseCredits() + " credits)");
        }
    }
}

public class studentDemo {
    public static void main(String[] args)
    {
         Course mathCourse = new CourseImpl("Mathematics", 4);
        Course historyCourse = new CourseImpl("Java", 3);
        Student student1 = new Student("vishnu", 1);
        student1.enrollCourse(mathCourse);
        student1.enrollCourse(historyCourse);
        System.out.println("Student 1 Information:");
        student1.displayStudentInfo();

    }
}.
