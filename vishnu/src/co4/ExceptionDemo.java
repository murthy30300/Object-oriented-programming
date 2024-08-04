package co4;
import java.util.Scanner;
public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		int []a= {10,20,30,40};
		int index;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the index to print");
		index=Integer.parseInt(in.next());
		try 
		{
			System.out.println("the requested element is"/*+a[index]*/ +getItem(index,a));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index exceeds limit");
			System.out.println("enter another index");
			index=Integer.parseInt(in.next());
			System.out.println("the requested element is "+a[index]);
			
		}
		/*
		 * exception and methods
		 * try with multiple catch
		 * re-throwing an exception
		 */
	}
	static int getItem(int i,int []a)
	{
		try
		{
		return a[i];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Partially handled inside getItem");
			throw e;
		}
	}

}
