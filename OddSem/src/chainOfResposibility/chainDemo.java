package chainOfResposibility;
import java.util.Scanner;


public class chainDemo
{
	
public static void main(String[] args) 
{
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		int c1=0,c2=0;
		for(int i = 0;i<b.length();i++)
		{
			if(b.charAt(i)=='0')
				c1++;
			else
				c2++;
			
		}
		if(c1%2==0)
		{
			System.out.println(b.length()/(c1-1));
		}
		else
		{
			System.out.println(b.length()/(c1));
		}
}}