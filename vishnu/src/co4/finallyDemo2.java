package co4;
public class finallyDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I will be executed anyway");
		}

	}

}
