package co4;
import java.util.Scanner;
import java.io.*;

public class StudentDemo2
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		try
		{
			writer=new PrintWriter("D:\\studentinfo.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not Avalible");
		}
		for(int i=1;i<=3;i++)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter Student Details");
			writer.write(in.next()+"\t"+in.next()+"\t"+in.nextInt()+"\t"+in.nextInt()+"\t"+in.nextInt()+"\n");
			writer.flush();
		}
		File f=new File("D:\\studentinfo.txt");
		Scanner in=null;
		try
		{
			in =new Scanner(f);
			for(int i=1;i<=3;i++)
			{
				System.out.print("Reg.no"+in.next()+"\t");
				System.out.print("Name:"+in.next()+"\t");
				int sum=0;
				for(int j=1;j<=3;j++)
				{
					sum+=in.nextInt();
				}
				System.out.print("Average: "+(sum/3));
				System.out.println("\n");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not Avalible");
		}
		
		

	}
}

