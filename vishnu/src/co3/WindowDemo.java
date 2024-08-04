package co3;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class WindowDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				ExampleWindow ew=new ExampleWindow("First Example");
				ew.displayMessageBox("hey mowA repeat uhh");
				
			}



}
class ExampleWindow extends JFrame
{
	ExampleWindow(String title)
	{
		super(title);
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void displayMessageBox(String msg)
	{
		JOptionPane.showMessageDialog(this, msg,"Example Window Message", JOptionPane.QUESTION_MESSAGE );
		
	}
}
