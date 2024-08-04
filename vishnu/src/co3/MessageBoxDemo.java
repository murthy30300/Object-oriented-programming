package co3;
import java.util.Scanner;
import javax.swing.*;
public class MessageBoxDemo
{
	public static void main(String[] args)
	{
	/*MessageBox
	 *   helloWorld
	 *   AWT-Abstract Window Tool kit-x
	 *   (SWING)
	 *   JAVA FX-x
	 */
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter you name");
				String name=sc.next();
				JOptionPane.showMessageDialog(null,"Hello"+name+"!");
				//here first parameter is the window
			}
		});
		/*this invokeLater accepts some objects
		 * 
		 */

	}

}
