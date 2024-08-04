 package weekfour;

public class BookDemo {
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		System.out.println(b1.toString());
		b1.Setter("Comics",23434,"someone",2009);
		System.out.println(b1.toString());
		b2.Setter("Travel-Diary",14234,"Shashank",2020);
		System.out.println(b2.toString());
	}
}
class Book{
	String BName;
	int BID;
	String BAuthor;
	int YOP;
	 
	public String getName() {
		return BName;
	}
	public int getId() {
		return BID;
	}
	public String getAuthor() {
		return BAuthor;
	}
	public int getYOP() {
		return YOP;
	}
	public void Setter(String a,int b,String c,int d) {
		this.BName= a;
		this.BID=b;
		this.BAuthor=c;
		this.YOP=d;
	}
	public String toString() {
		return "Book Name: "+BName+",Book ID: "+BID+",Book Author: "+BAuthor+",YOP: "+YOP;
	}
}