package laba;
import java.util.Scanner;
public class SwitchInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.println("enter two numbers and option");
		int x,y;
		byte option;
		x=input.nextInt();
		y=input.nextInt();
		option=Byte.parseByte(input.next());
		switch(option)
		{
		case 1:
			System.out.println(x+"+"+y+"="+(x+y));
			break;
		case 2:
			System.out.println(x+"-"+y+"="+(x-y));
			break;
		case 3:
			System.out.println(x+"*"+y+"="+(x*y));
			break;
		case 4:
			System.out.println(x+"/"+y+"="+(x/y));
			break;
		default:
			System.out.println("wrong option");
		}
	}

}
