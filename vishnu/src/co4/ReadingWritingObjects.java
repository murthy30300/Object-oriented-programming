package co4;
import java.io.*;
public class ReadingWritingObjects {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Sample s=new Sample(100,"this is a test");
		try {
		FileOutputStream fos=new FileOutputStream("D:\\Samples.date");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		FileInputStream fis=new FileInputStream("D://samples.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Sample s2=(Sample)ois.readObject();
		System.out.println(s2.getM());
	
		
	}

}
class Sample implements Serializable
{
	int i;
	String m;
	Sample(int i,String m)
	{
		this.i=i;
		this.m=m;
	}
	public String toString()
	{
		return "(" +i+","+m+")";
		
	}
	String getM()
	{
		return m;
	}
}
