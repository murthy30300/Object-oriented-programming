package co2;

import java.util.ArrayList;

import java.util.Scanner;
import java.co1
;
class Book
{
	public int id;
	public String title;
	public String author;
	public int price;
	public int noofpages;
	public String publication;
	
	Book()
	{
		id=0;
		title="";
	}
	Book(int id1, String title1,String a1,int p1,int n1,String pub1)
	{
		id=id1;
		title=title1;
		author=a1;
		price=p1;
		noofpages=n1;
		publication=pub1;
	}
	public String toString()
	{
		return id+"\n"+title+"\n"+author+"\n"+price+"\n"+noofpages+"\n"+publication;
	}
}

public class MenuArrayList
{
	/*	ArrayList is a generic class
	 * it is in util package and it is a predefined class
	 * Syntax ArrayList <RefrencedDataType> <Variable> = new ArrayList <RefrencedDataType> ();
	 * */
	 ArrayList<Book> al=new ArrayList<Book>();
	public void addition()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter id");
		int id2=sc.nextInt();
		System.out.print("enter title");
		String title2=sc.nextLine();
		System.out.print("enter author");
		String author2=sc.nextLine();
		System.out.print("enter price");
		int price2=sc.nextInt();
		System.out.print("enter number of pages");
		int noofpages2=sc.nextInt();
		System.out.print("enter publication");
		String publication2=sc.nextLine();
		Book b1= new Book(id2,title2,author2,price2,noofpages2,publication2);
		al.add(b1);
		System.out.println("book details you have given are added");
	
	}
	
	public void details()
	{
		System.out.println(al.size());
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	public void idSearch()
	{
		Scanner sc= new Scanner (System.in);
		int key=sc.nextInt();
		int f=0,x=0;
		for (int i=0;i<al.size();i++)
		{
			if((al.get(i).id)==key)
			{
				x=i+1;
				f=1;
			}
		}
		if (f==1)
			System.out.println("this is of book "+x);
		else
			System.out.println("id is present");
	}
	public void leastPrice()
	{
		int min=al.get(0).price;
		for (int i=0;i<al.size();i++)
		{
			if (al.get(i).price<=min)
				min=al.get(i).price;
		}
		System.out.println("least price is"+min);
	}
	public void sortId()
	{
		int temp;
		for (int i=0;i<al.size();i++)
		{
			for (int j=1;j<al.size()-i;j++)
			{
				if(al.get(j-1).id> al.get(j).id)
				{
					temp=al.get(j-1).id;
					al.get(j-1).id=al.get(j).id;
					al.get(j).id=temp;
				}
			}
		}
		System.out.println("sorted id data is");
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).id);
		}
	}
	public void searchAuthor()
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		int f=0,x=0;
		for(int i=0;i<al.size();i++)
		{
			if(s.equals(al.get(i).author))
			{
				x=i+1;
				f=1;
			}
		}
		if (f==1)
			System.out.println("this is the author of book"+x);
		else
			System.out.println("author not found");
	}
	public static void main(String[] args) 
	{
		
		MenuArrayList t= new MenuArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println(" 0.exit\n 1.add\n 2.details\n"
				+ " 3.id search\n 4.least price\n"
				+ " 5.sort id\n 6.search author");
		while(true)
		{
			System.out.println(" enter your choice:");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:t.addition();
				
				break;
			case 2:t.details();
			break;
			case 3:t.idSearch();
			break;
			case 4:t.leastPrice();
			break;
			case 5:t.sortId();
			break;
			case 6:t.searchAuthor();
			break;
			case 0: System.exit(0);
				break;
				default:System.out.println("enter correct choice");
				break;
			}
		}
	}
}



