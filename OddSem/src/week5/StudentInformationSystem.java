package week5;
import java.util.ArrayList;

public class StudentInformationSystem {

    private ArrayList<Student> students;

    public StudentInformationSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void deleteStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                students.remove(student);
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentInformationSystem sis = new StudentInformationSystem();

        sis.addStudent(new Student("John Doe", "123456789", "Computer Science"));
        sis.addStudent(new Student("Jane Doe", "987654321", "Electrical Engineering"));

        System.out.println("The number of students is: " + sis.getStudents().size());

        Student student = sis.getStudent("123456789");
        System.out.println("The student with ID 123456789 is: " + student);

        sis.deleteStudent("123456789");
        System.out.println("The number of students is now: " + sis.getStudents().size());
    }
}

class Student {

    private String name;
    private String studentId;
    private String major;

    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
