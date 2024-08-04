package weekeight;


import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */
public class OneThreeFive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    while(n--!=0){
	    {
	        int m = sc.nextInt();
	        int n1 = sc.nextInt();
	        int k = sc.nextInt();
	        int arr[] = new int[m];
	        for(int i=0;i<m;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int sum=0;
	        for(int i=0;i<m;i++){
	            sum+=arr[i];
	        }
	        if(sum==m){
	            System.out.println("100");
	        }
	        int part=0;
	        for(int i=0;i<n1;i++){
	            part+=arr[i];
	        }
	        if(sum!=m&&part==n1){
	            System.out.println(k);
	        }
	        if(sum!=m && part!=n1){
	            System.out.println("0");
	        }
	    }
	   
	}
}
}



/* package codechef; // don't place package name! */

/*import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        char c[]=new char[n];
	        for(int j=0;j<n;j++)
	        {
	            c[j]=sc.next().charAt;
	        }
	        for(int j=0;j<n;j++)
	        {
	            if(c[j]==c[n-j])
	            System.out.println("YES");
	            else
	            System.out.println("NO");
	        }
	    }
	}
}*/
