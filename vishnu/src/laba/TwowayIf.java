package laba;
import java.util.Scanner;
//RANDOM NUMBER SUM IS EQUAL TO USER GUESS LIKE CAPTCHA
public class TwowayIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=(int)(Math.random()*10);
		int n2=(int)(Math.random()*10);
		System.out.println("what is "+n1+"+"+n2);
		Scanner input=new Scanner(System.in);
		int guess=input.nextInt();
		if(guess==n1+n2)
			System.out.println("your guess is correct");
		else
		{
			System.out.println("your guess is wrong");
			System.out.println(n1+"+"+n2+" is equal to "+(n1+n2));
		}
			

	}

}
