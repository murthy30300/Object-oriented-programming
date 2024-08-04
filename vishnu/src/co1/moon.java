package co1;
import java.util.*;
public class moon 
{
	public static void main(String[] args)
	{
	Scanner ac=new Scanner(System.in);
	int nt=ac.nextInt();
	int mt=ac.nextInt();
	int pt=ac.nextInt();
	int count=1;
	//int [] a=new int[nt];
	while(mt+pt<=nt)
	{
		if(nt>mt)
		{
		mt=mt+pt;
		count++;
		}
		
	}
	if(nt<mt)
		count=0;
	System.out.println(count);

	}

}
