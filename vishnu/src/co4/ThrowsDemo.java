package co4;
public class ThrowsDemo 
{
	public static void main(String[] args) 
	{
		try
		{
		display();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	static void display() throws ArithmeticException
	{
		System.out.println("Throws Exception");
		throw new ArithmeticException("exception handling");
	}
}
