package week11;
import java.util.*;

class Employee {
  private String name;
  private Date dob;
  private long mobileNumber;
  private int id;

  public Employee(String name, Date dob, long mobileNumber, int id) {
    this.name = name;
    this.dob = dob;
    this.mobileNumber = mobileNumber;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public Date getDob() {
    return dob;
  }

  public long getMobileNumber() {
    return mobileNumber;
  }

  public int getId() {
    return id;
  }
}

class EmployeeList {
  private List<Employee> employees;

  public EmployeeList() {
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void iterateOverEmployees() {
    Iterator<Employee> iterator = employees.iterator();
    while (iterator.hasNext()) {
      Employee employee = iterator.next();
      System.out.println(employee.getName() + " " + employee.getDob() + " " + employee.getMobileNumber() + " " + employee.getId());
    }
  }
}

public class inLab{

  public static void main(String[] args) {
    EmployeeList employeeList = new EmployeeList();

    employeeList.addEmployee(new Employee("John Doe", new Date(), 1234567890, 1));
    employeeList.addEmployee(new Employee("Jane Doe", new Date(), 987653210, 2));

    employeeList.iterateOverEmployees();
  }
}
