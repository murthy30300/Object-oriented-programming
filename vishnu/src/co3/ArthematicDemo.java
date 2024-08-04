package co3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ArthematicDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				/*getText()
				 * SetText("text")
				 */
				new AddWindow("Addition ");
				
			}

		});

	}

}
class AddWindow extends JFrame implements ActionListener
{
	JLabel lblx;
	JLabel lbly;
	JTextField txtval1;
	JTextField txtval2;
	JButton btnADD;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel master;
	
	
	AddWindow(String title)
	{
		super(title);
		setBounds(300,300,300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblx=new JLabel("X=");
		txtval1=new JTextField(15);
		panel1=new JPanel();
		panel1.add(lblx);
		panel1.add(txtval1);
		
		lbly=new JLabel("Y=");
		txtval2=new JTextField(25);
		panel2=new JPanel();
		panel2.add(lbly);
		panel2.add(txtval2);
		
		btnADD=new JButton("ADD");
		panel3=new JPanel();
		panel3.add(btnADD);
		
		master=new JPanel();
		master.add(panel1);
		master.add(panel2);
		master.add(panel3);
		
		//lblx.setBounds(250,250,100,100);
		getContentPane().add(lblx);
		
		
	
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		int x=Integer.parseInt(txtval1.getText());
		int y=Integer.parseInt(txtval2.getText());
		JOptionPane.showMessageDialog(this,txtval1.getText()+txtval2.getText(),"Result Message",JOptionPane.INFORMATION_MESSAGE );
	}

}
