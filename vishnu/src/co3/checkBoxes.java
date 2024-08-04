package co3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class checkBoxes
{

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
		{
			new Window("Hobbies");
		}
	});
	}
}
class Window extends JFrame implements ActionListener
{
	JCheckBox cricket;
	JCheckBox music;
	JCheckBox art;
	JLabel result;
	JPanel panela;
	JPanel panelb;
	JPanel panelc;
	

	public Window(String title)
	{
		super(title);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panela=new JPanel();
		panelb=new JPanel();
		panelc=new JPanel();
		prepareCheckBoxes();
		prepareLabel();
		preparePanels();
	}
	void prepareCheckBoxes()
	{
		cricket=new JCheckBox("playing cricket");
		cricket.addActionListener(this);
		music=new JCheckBox("listening music");
		music.addActionListener(this);
		art=new JCheckBox("Drawing protraits");
		art.addActionListener(this);
		panela.add(cricket);
		panelb.add(music);
		panelc.add(art);
	}
	void prepareLabel()
	{
		result=new JLabel();
		
		panelb=new JPanel();
	
	}
	void preparePanels()
	{
		
		panelc.add(panela);
		panelc.add(panelb);
		add(panelc);
	}
	public void actionPerformed(ActionEvent e)
	{
		String msg="";
		String old=result.getText();
		if(cricket.isSelected())
		{
			msg=old+"he is cricket";
			
		}
		else
			msg=old;
		if(music.isSelected())
		{
			msg=old+"he is listening music";
			
		}
		else
			msg=old;
		if(art.isSelected())
		{
			msg=old+"He is Drawing Protrait ";
			
		}
		else
			msg=old;
		result.setText(msg);
		
	}
}
