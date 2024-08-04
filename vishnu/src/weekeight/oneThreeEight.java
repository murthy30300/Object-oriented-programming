import java.util.*;
class Student {
 private String name;
 private int id;
 public Student(String name2, int id2) {
	// TODO Auto-generated constructor stub
}
public void Student(String name, int id) {
 this.name = name;
 this.id = id;
 }
 public String getName() {
 return name;
 }
 public int getId() {
 return id;
 }
 public String toString() {
 return "Name: " + name + ", ID: " + id;
 }
}

public class oneThreeEight{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Vector<Student> studentList = new Vector<Student>();
 while (true) {
 System.out.print("Enter student name (or 'quit' to exit): ");
 String name = scanner.nextLine();
 if (name.equals("quit")) {
 break;
 }
 System.out.print("Enter student ID: ");
 int id = scanner.nextInt();
 scanner.nextLine();
 Student student = new Student(name, id);
 studentList.add(student);
 }
 System.out.println("\nStudent list:");
 for (Student student : studentList) {
 System.out.println(student);
 }
 System.out.print("\nEnter student ID to search: ");
 int searchId = scanner.nextInt();
 scanner.nextLine();
 boolean found = false;
 for (Student student : studentList) {
 if (student.getId() == searchId) {
 System.out.println("\nStudent found: " + student);
 found = true;
 break;
 }
 }

 if (!found) {
 System.out.println("\nStudent not found with ID " + searchId);
 }
 }
}