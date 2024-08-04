package homeAssignmentone;

	public class problemTwo {

    static String name;
    static String id;
    static String gender;
    static String dept;
    static String mobile;
    static double marks1;
    static double marks2;
    static double marks3;
    
    public static void displayDetails() {
        double percentage = (marks1 + marks2 + marks3) / 3;
        String last5digits = id.substring(id.length() - 5);
        System.out.println("Name: " + name);
        System.out.println("ID: " + last5digits);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + dept);
        System.out.println("Mobile: " + mobile);
        System.out.println("Percentage: " + percentage);
    }

    public static void main(String[] args) {
        name = args[0];
        id = args[1];
        gender = args[2];
        dept = args[3];
        mobile = args[4];
        marks1 = Double.parseDouble(args[5]);
        marks2 = Double.parseDouble(args[6]);
        marks3 = Double.parseDouble(args[7]);
        displayDetails();
    }
}