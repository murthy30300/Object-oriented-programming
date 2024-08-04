package co4;
import java.util.Scanner;
public class EvenNumberDemo
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	try
	{
		if(a%2!=0)
			System.out.println("success");
		else
			throw new ArithmeticException("Even Exception");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("error");
	}
	}

}
