package co4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 
public class ReadingFileDemo
{
	public static void main(String[] args) throws FileNotFoundException
	{
	/*File handling:-
	 * Scanner-to read something
	 * printWriter- to print something into file
	 * 
	 */
	 PrintWriter writer=null; //to avoid compile time error we intialised null to writer
	 try
	 {
		 writer=new PrintWriter("D:\\file1.txt");
		 writer.write("this is a test");
		 writer.write("\n This is the second line");
		 writer.write("200");
	 }
	 catch(FileNotFoundException e)
	 {
		e.printStackTrace(); 
	 }
	 writer.flush();
		

	}

}
