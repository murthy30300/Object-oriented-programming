package co3;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ActionListener;

public class RadioButtonDemo 
{

	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new RWindow("Button");
			}
		});
	}
}
class RWindow extends JFrame implements ActionListener
{
	JRadioButton btech;
	JRadioButton bcom;
	JPanel btnPanel,btnPanela,btnPanelb,masterPanel;
	RWindow(String title)
	{
		super(title);
		setBounds(300,300,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prepareButtons();
		prepareLabels();
		preparePanels();
		setVisible(true);
	}
	void prepareButtons()
	{
		btech=new JRadioButton("B.Tech");
		btech.addActionListener(this);
		bcom=new JRadioButton("bcom");
		bcom.addActionListener(this);
		bg=new ButtonGroup();
		bg.add(btech);
		bg.add(bcom);
		btnPanel=new JPanel();
		btnPanela=new JPanel();
		
	}
	void prepareLabels()
	{
		
	}
	void preparePanels()
	{
		masterPanel=new JPanel();
		masterPanel=
		
	}
}
