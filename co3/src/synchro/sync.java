package synchro;
class BookTheaterSea

{
	int ts=10;
	synchronized void bookSeats(int seats)
	{
		if(ts>=seats)
		{
			System.out.println("Seats booked successfully");
			ts=ts-seats;
			System.out.println("seats left"+ts);
		}
		else
		{
			System.out.println("Seats cannot be booked");
			System.out.println("Seats left"+ts);
		}
	}
}
public class sync extends Thread
{
	static BookTheaterSea b;
	int seats;
	public void run()
	{
		b.bookSeats(seats);
	}
	public static void main(String args[])
	{
		b=new BookTheaterSea();
		sync v=new sync();
		v.seats=7;
		v.start();
		sync k=new sync();
		k.seats=7;
		k.start();
		
	}
}
