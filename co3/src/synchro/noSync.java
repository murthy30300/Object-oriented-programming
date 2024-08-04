package synchro;
class BookTheaterSeat{
	int ts=10;
	void bookS(int seats)
	{
		if(ts>=seats)
		{
			System.out.println("Successfully booked");
			ts=ts-seats;
			System.out.println("Seats left "+ts);
		}
		else
		{
			System.out.println("Seats canot be booked");
			System.out.print("Seats Left "+ts);
		}
	}
}
public class noSync extends Thread
{
	static BookTheaterSeat b;
	int seats;
	public void run()
	{
		b.bookS(seats);
	}
	public static void main(String args [])
	{
		b=new BookTheaterSeat();
		noSync v=new noSync();
		v.seats=7;
		v.start();
		noSync m=new noSync();
		m.seats=6;
		m.start();
		
	}
}
