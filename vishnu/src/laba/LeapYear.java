package laba;
import java.util.Scanner;
//TO FIND A YEAR IS LEAP YEAR OR NOT
public class LeapYear {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
	
		if(year%4==0&&year%100!=0)
		System.out.println(year+"is a leap year");
		if(year%400==0)
			System.out.println(year+"is a leap year");
		boolean isLeapYear=((year%4==0&&year%100!=0)||year%400==0);
		System.out.println(year+" is leap year " +isLeapYear);
			
			

	}

}
