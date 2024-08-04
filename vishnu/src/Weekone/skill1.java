package Weekone;
import java.util.Scanner;
public class skill1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int n=input.nextInt();
		System.out.println("enter X");
		int x=input.nextInt();
		int y=2;
		while (Math.pow(x, y)<=n)
		{
			double p=Math.pow(x, y);
			System.out.println(x+"^"+y+"="+p);
			y++;
		}
		
	}

}
