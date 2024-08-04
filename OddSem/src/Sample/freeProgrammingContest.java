package Sample;

import java.util.Scanner;
public class freeProgrammingContest
{
  public static void main(String [] args)
  {
    Scanner cr=new Scanner(System.in);
    int num=cr.nextInt();
    int rp=cr.nextInt();
    int dq=cr.nextInt();
    int [] sh=new int[num];
    for(int p=0;p<num;p++)
    {
    	 sh[p]=cr.nextInt();
    }
    int min=sh[0];
    for(int q=0;q<num;q++)
    {
    	if(sh[q]<min)
    		min=sh[q];
    }
    if(min<dq)
    	System.out.println(min+rp-dq);
    else
    	System.out.println(rp);
    	
    
  }
  }
    
