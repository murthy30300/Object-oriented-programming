package co3;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class UserID
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				/*
				 * getText()
				 * SetText("text")
				 */
				new UserWindow("Credentials");
			}
		});
	}

}
class UserWindow extends JFrame implements ActionListener
{
	JLabel lbluser;
	JLabel lblpass;
	JTextField txtuser;
	JPasswordField txtpass;
	JButton Login;
	JPanel panela;
	JPanel panelb;
	JPanel panelbtn;
	JPanel age;
	JPanel name;
	
	UserWindow(String title)
	{
		super(title);
		setBounds(300,300,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUserpanela();
		setUserpanelb();
		setBtnpanel();
		setLayout(new FlowLayout());
		add(panela);
		add(panelb);
		add(panelbtn);
		
	}

	private void setBtnpanel() 
	{
		Login=new JButton("Login");
		Login.addActionListener(this);
		panelbtn=new JPanel();
		panelbtn.add(Login);
	}

	private void setUserpanelb() 
	{
		lblpass=new JLabel("password:");
		txtpass= new JPasswordField(20);
		panelb=new JPanel();
		panelb.add(lblpass);
		panelb.add(txtpass);
	}

	private void setUserpanela() 
	{
		// TODO Auto-generated method stub
		lbluser=new JLabel("UserID:");
		txtuser=new JTextField(20);
		panela=new JPanel();
		panela.add(lbluser);
		panela.add(txtuser);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String[][] credentials= {
				{"vishnu","AgentTina"},
				{"murthy","leo"},
				{"venkat","rolex"}
				};
		String user=txtuser.getText();
		int i;
		int flag=-1;
		for(i=0;i<credentials.length;i++)
		{
			if(user.equals(credentials[i][0]))
			{
				flag=i;
			break;
			}
		
		}
		if(flag==-1)
		{
			JOptionPane.showMessageDialog(this,"user id not found","invalid user",JOptionPane.ERROR_MESSAGE);
			
		}
		else
		{
			String ps=new String(txtpass.getPassword());
			if(credentials[flag][1].equals(ps))
			{
				JOptionPane.showMessageDialog(this,"welcome to GUI","welcome",JOptionPane.INFORMATION_MESSAGE);
				
			}
			else
			{
				JOptionPane.showMessageDialog(this, "wrong password","Password Mismatch",JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
}
