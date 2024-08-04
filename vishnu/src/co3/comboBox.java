package co3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class comboBox {

	public static void main(String[] args)
	{

		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new FruitStall("My Fruit Stall");
			}
		});
	}
}
class FruitStall extends JFrame implements ActionListener
{
	JComboBox cb;
	JPanel panel1,panel2,master;
	JTextArea area;
	FruitStall(String title)
	{
		super(title);
		setSize(300,300);
		prepareComboBox();
		prepareArea();
		preparePanels();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void prepareComboBox()
	{
		String[] fruits= {"apple","baanana","mano","grape"};
		cb=new JComboBox<Object>(fruits);
		cb.addActionListener(this);
		panel1=new JPanel();
		panel1.add(cb);
		
	}
	void prepareArea()
	{
		area=new JTextArea(4,15);
		panel2=new JPanel();
		panel2.add(area);
	}
	void preparePanels()
	{
		master=new JPanel();
		master.add(panel1);
		master.add(panel2);
		add(master);
	}
	public void actionPerformed(ActionEvent e)
	{
		String fruit=area.getText();
		JComboBox temp=(JComboBox)e.getSource();
		fruit+=(String)temp.getSelectedItem()+"\n";
		area.setText(fruit);
	}
	
}
