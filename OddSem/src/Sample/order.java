package Sample;
import java.util.*;
public class order 
{

	public static void main(String[] args)
	{
	Scanner pa=new Scanner(System.in);
	int nr=pa.nextInt();
	int mr=pa.nextInt();
	int[] pj=new int[nr];
	int[] cj=new int[nr];
	int[][] fh=new int[nr][mr];
	for(int u=0;u<nr;u++)
	{
		pj[u]=pa.nextInt();
		cj[u]=pa.nextInt();
		for(int v=0;v<cj[u];v++)
		{
			fh[u][v]=pa.nextInt();
		}
		
	}
	
	

	}

}
