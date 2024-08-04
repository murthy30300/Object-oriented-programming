package co4;
import java.util.Scanner;
public class userDefinedException
{
	public static void main(String[] args)
	{
		int age;
		Scanner in=new Scanner(System.in);
		age=Integer.parseInt(in.next());
		try
		{
		if(age>0&&age<=100)
			System.out.println("Valid age");
		else
			throw new AgeException(age,"Invalid age");
		}
		catch(AgeException ae)
		{
			System.out.println(ae.getMessage());
			System.out.println("the value "+ae.getInvalidAge()+" is not Acceptable");
		}
	}
}
class AgeException extends RuntimeException
{
	int iage;
	String message;
	AgeException(int iage, String message)
	{
		super(message);
		this.iage=iage;
		
	}
	public String getMessage()
	{
		return super.getMessage();
	}
	public int getInvalidAge()
	{
		return iage;
	}
}

