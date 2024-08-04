package co4;
import java.util.Scanner;
/*
 * Exception Handling:-
 * 1)simple try catch
 * 2)multiple catches
 * nested try
 * reThrow
 * Throws
 * UserDefine
 */
public class NestedTryDemo 
{
	public static void main(String[] args) 
	{
		int []a= {1,5,3,8,4};
		for(int i=0;i<=a.length;i++)
		{
			try
			{
				try
				{
					System.out.println(a[i]/new Scanner(System.in).nextInt());
				}
			/*
			 * catch*/
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Inner catch:" +e.getMessage());
				//for rethrow handling we need to write "throw e'
			}
			}
			catch(ArithmeticException e)
			{
				System.out.println("Outer Catch: "+e.getMessage());
			}

		}
		
	}

}
