package co3;
import javax.swing.*;
import java.awt.event.*;  //Abstract Window Tool kit

public class TextFieldDemo
{
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				/*getText()
				 * SetText("text")
				 */
				new TextWindow("Text information Demo");
				
			}

		});
	}
}
class TextWindow extends JFrame implements ActionListener
{
	JLabel lblName;
	JLabel lblx;
	JLabel lbly;
	JTextField txtName;
	JTextField txtval1;
	JTextField txtval2;
	JButton btnOk;
	JButton btnADD;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	
	
	TextWindow(String title)
	{
		super(title);
		setSize(500,400);
		setVisible(true); //it makes the Frame Appear On the Screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1=new JPanel();
		add(panel1);
		
		panel2=new JPanel();
		add(panel2);
		
		panel3=new JPanel();
		add(panel3);
		
		lblName=new JLabel();
		lblName.setText("enter your name");
		panel1.add(lblName);
		
		lblx=new JLabel();
		lblx.setText("X=");
		panel2.add(lblx);
		
		lbly=new JLabel();
		lbly.setText("Y=");
		panel3.add(lbly);
		
		txtName=new JTextField(20);
		panel1.add(txtName);
		
		
		txtval1=new JTextField(20);
		panel2.add(txtval1);
		
		txtval2=new JTextField(20);
		panel3.add(txtval2);
		
		btnOk= new JButton("OK");
		btnOk.addActionListener(this);
		panel1.add(btnOk);
		panel2.add(btnADD);
		/*
		 * every window contain Layout Manger
		 * [FlowLayout]
		 */
		/*Event Delegation Model
		 * the button OK is known as EVENT SOURCE
		 * 	ActionEvent- clicking button EventObject is generated
		 * ActionListiner- attach to button=it is a interface
		 * 		{
		 * in this actionPerformed() method is present
		 * }
		 * 
		 */
		
		}
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this,"I Love you "+txtName.getText() );
		/*
		 * txtName.getText() here getText is used to retrive the text
		 */
		
	}
}

