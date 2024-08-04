package weekeight;
import java.util.LinkedList;
class Studentt {
 private String name;
 private int age;
 private String major;
 public Studentt(String name, int age, String major) {
 this.name = name;
 this.age = age;
 this.major = major;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
 public String getMajor() {
 return major;
 }
}
public class StudentLinkedList {
 public static void main(String[] args) {
 LinkedList<Studentt> studentList = new LinkedList<Studentt>();
 studentList.add(new Studentt("Alice", 20, "Computer Science"));
 studentList.add(new Studentt("Bob", 21, "Mathematics"));
 studentList.add(new Studentt("Charlie", 19, "English"));
 System.out.println("List of students:");
 for (Studentt s : studentList) {
 System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getMajor());
 }
 }

}
