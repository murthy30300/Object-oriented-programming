package laba;
import java.util.Scanner; 
//RANDOM NUMBER GENRATE IS EQUAL TO INPUT NUMBER OR NOT

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		n1=(int)(System.currentTimeMillis()%10);
		System.out.println(n1);
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		n2=input.nextInt();
		System.out.println(n1+ "is equal to" +n2+ "is" +(n1==n2));

	}

}
