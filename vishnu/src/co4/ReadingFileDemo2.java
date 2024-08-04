package co4;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ReadingFileDemo2
{
	/*
	 * we have to use CLASS FILE to read something from the file that ,
	 * has stored in the drive 
	 */
	
	public static void main(String[] args)
	{
		File f=new File("D:\\file1.txt");
		Scanner in=null;
		try
		{
			in=new Scanner(f);
		}
			catch(FileNotFoundException e)
		{
				e.printStackTrace();
		}
		while(in.hasNextLine())
			System.out.println(in.nextLine());
	}
/*
 * Serialization:-
 * Object-byte Stream-File
 * DeSerialization:-
 * file-Byte Stream-Object
 * 
 * Object<-readObject
 * File Input Stream is enable to read the input in BinaryFormat
 * FIlE Output Stream is used to Write in BinayFormat
 * ObjectInputStream(FileInputStream(file))
 * ObjectOutputStream(FileInputStream(file))
 * writeObject(object)
 */
}
