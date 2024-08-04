package week11;8

class Student implements Cloneable {

  private String name;
  private int rollNumber;
  private int marks;

  public Student(String name, int rollNumber, int marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // Create a new object of the same type as this object.
    Student clonedObject = new Student(this.name, this.rollNumber, this.marks);

    // Copy the state of this object to the new object.
    clonedObject.name = this.name;
    clonedObject.rollNumber = this.rollNumber;
    clonedObject.marks = this.marks;

    return clonedObject;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }
}

public class postLab {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student("John Doe", 100, 90);

    // Clone the student object.
    Student clonedStudent = (Student) student.clone();

    // Check if the objects are equal.
    boolean equals = student.equals(clonedStudent);
    System.out.println(equals); // true

    // Change the marks of the cloned student.
    clonedStudent.setMarks(100);

    // Check if the marks of the original student are still the same.
    System.out.println(student.getMarks()); // 90
  }
}
