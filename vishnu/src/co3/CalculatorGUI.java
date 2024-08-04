package co3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorGUI extends JFrame implements ActionListener
{
		private JTextField firstNumberField, secondNumberField, resultField;
		private JButton addButton, subtractButton, multiplyButton, divideButton;
		public CalculatorGUI() 
		{
			 super("Simple Calculator");
			 // Create text fields for the input numbers and the result
			 firstNumberField = new JTextField(10);
			 secondNumberField = new JTextField(10);
			 resultField = new JTextField(10);
			 resultField.setEditable(false);
			 // Create buttons for the arithmetic operations
			 addButton = new JButton("+");
			 subtractButton = new JButton("-");
			 multiplyButton = new JButton("*");
			 divideButton = new JButton("/");
			 // Add action listeners to the buttons
			 addButton.addActionListener(this);
			 subtractButton.addActionListener(this);
			 multiplyButton.addActionListener(this);
			 divideButton.addActionListener(this);
			 // Create a panel to hold the input fields and the operation buttons
			 JPanel inputPanel = new JPanel();
			 inputPanel.setLayout(new GridLayout(3, 2));
			
			 inputPanel.add(new JLabel("First number:"));
			 inputPanel.add(firstNumberField);
			 inputPanel.add(new JLabel("Second number:"));
			 inputPanel.add(secondNumberField);
			 inputPanel.add(new JLabel("Result:"));
			 inputPanel.add(resultField);
			 // Create a panel to hold the operation buttons
			 JPanel buttonPanel = new JPanel();
			 buttonPanel.setLayout(new GridLayout(2, 2));
			 buttonPanel.add(addButton);
			 buttonPanel.add(subtractButton);
			 buttonPanel.add(multiplyButton);
			 buttonPanel.add(divideButton);
			 // Add the panels to the frame
			 Container contentPane = getContentPane();
			 contentPane.setLayout(new BorderLayout());
			 contentPane.add(inputPanel, BorderLayout.CENTER);
			 contentPane.add(buttonPanel, BorderLayout.SOUTH);
			 // Set the frame properties and show it
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setSize(300, 150);
			 setLocationRelativeTo(null);
			 setVisible(true);
		 }
		public void actionPerformed(ActionEvent e) 
		{
 // Get the input numbers
			 int firstNumber = Integer.parseInt(firstNumberField.getText());
			 int secondNumber = Integer.parseInt(secondNumberField.getText());
			 // Perform the appropriate arithmetic operation and display the result
			 if (e.getSource() == addButton) 
			 {
				 resultField.setText("" + (firstNumber + secondNumber));
			 } 
			 else if (e.getSource() == subtractButton) 
			 {
				 resultField.setText("" + (firstNumber - secondNumber));
			 } 
			 else if (e.getSource() == multiplyButton)
			 {
				 resultField.setText("" + (firstNumber * secondNumber));
			 } 
			 else if (e.getSource() == divideButton) 
			 {
				 resultField.setText("" + ((double) firstNumber / secondNumber));
			 }
		 }
	 public static void main(String[] args)
	 {
		 new CalculatorGUI();
	 }
}