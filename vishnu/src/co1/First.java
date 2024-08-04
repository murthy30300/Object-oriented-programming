package co1;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class First
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ui=new Scanner(System.in);
		int tc=ui.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int y1=ui.nextInt();
		    int y2=ui.nextInt();
		    int z1=ui.nextInt();
		    int z2=ui.nextInt();
		    int o=y1-y2;
		    int p=z1-z2;
		    int f=o+p;
		    if(f<0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}

