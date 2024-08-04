package laba;
import java.util.Scanner;
public class arraysinsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		float avg=0f;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("sum="+sum);
		System.out.println("average="+avg);
		
		
		// TODO Auto-generated method stub

	}

}
