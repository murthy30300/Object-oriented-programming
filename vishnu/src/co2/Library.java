package co2;
import java.util.Scanner;
public class Library
{
	static Book[] Books;
	private static int index=0;
	public static void main(String[] args)
	{
		Books=new Book[3];
		Scanner in=new Scanner(System.in);
		int choice;
		while(true)
		{
			displayMenu();
			System.out.println("choose from menu");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				Book b=new Book();
				System.out.println(()
				)
			case 2:
				printAll();
				break;
			case 3:
				printByName();
			case 4:
				Book b=searchByName();
				if(b==null)
					System.out.println("NO Book with that name ");
				else
					System.out.println(b);
				break;
			case 5:
				Book b=searchByID();
				if(b==null)
					System.out.println("NO BOOK WITH THAT ID");
					else
						System.out.println();
				break;
			}
		}
	}
}
