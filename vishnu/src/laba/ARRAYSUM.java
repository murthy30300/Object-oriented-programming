package laba;

public class ARRAYSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		float avg;
		int [] a=new int[5];
		int b[]= {10,20,30,40,50};
		for(i=0;i<5;i++)
		{
			sum=sum+b[i];
		}
		System.out.println("sum="+sum);
		avg=sum/5;
		System.out.println("average="+avg);
	}

}
