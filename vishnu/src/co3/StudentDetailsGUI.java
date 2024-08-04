package co3;


	import javax.swing.JOptionPane;
	public class StudentDetailsGUI {
	 public static void main(String[] args) {
	 // Ask the user for the student's ID
	 String id = JOptionPane.showInputDialog("Enter the student's ID:");
	 // Ask the user for the student's name
	 String name = JOptionPane.showInputDialog("Enter the student's name:");
	 // Ask the user for the student's age
	 String ageString = JOptionPane.showInputDialog("Enter the student'sage:");
	 int age = Integer.parseInt(ageString);
	 // Ask the user for the student's gender
	 String[] genderOptions = {"Male", "Female", "Other"};
	 int genderChoice = JOptionPane.showOptionDialog(null, "Select the student's gender:","Gender", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, genderOptions, genderOptions[0]);
	
	 String gender = genderOptions[genderChoice];
	 // Display the student's details on the user interface
	 String message = "Student ID: " + id + "\n" +
	 "Name: " + name + "\n" +
	 "Age: " + age + "\n" +
	 "Gender: " + gender;
	 JOptionPane.showMessageDialog(null, message);
	 }
	}

