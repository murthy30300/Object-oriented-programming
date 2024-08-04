package laba;

public class Seriessum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 double sum=0.0;
	 for(double n=1.0;n<=97.0;n+=2)
	 {
		 sum=sum+n/(n+2);
	 }
	 System.out.println("series : 1/3+3/5+5/7+7/9+9/11+.............+97/99");
	 System.out.println("Sum of series:"+sum);

	}

}
