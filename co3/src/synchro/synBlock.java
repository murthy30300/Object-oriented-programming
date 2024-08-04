package synchro;
class BookSeat
{
	int ts=10;
	void bs(int seats)
	{
		System.out.println("HI:"+Thread.currentThread().getName());
		System.out.println("hi: "+Thread.currentThread().getName());
		 System.out.println("hi: "+Thread.currentThread().getName());
		 System.out.println("hi: "+Thread.currentThread().getName());
		 synchronized(this)
		 {
			 if(ts>=seats)
			 {
				 System.out.println("seats booked successfully");
					ts=ts-seats;
					System.out.println("seats left"+ts);
			 }
			 else
				{
					System.out.println("seats cannot bebooked");
					System.out.println("seats left"+ts);
				}
			             System.out.println("hi: "+Thread.currentThread().getName());
					 System.out.println("hi: "+Thread.currentThread().getName());
					 System.out.println("hi: "+Thread.currentThread().getName());
					 System.out.println("hi: "+Thread.currentThread().getName());
					 System.out.println("hi: "+Thread.currentThread().getName());
		 }
	}
}
public class synBlock extends Thread
{
	static BookSeat b;
	int seats;
	public void run()
	{
	b.bs(seats);
	}
	public static void main(String args[])
	{
		b=new BookSeat();
		synBlock hari=new synBlock();
		hari.seats=7;
		hari.start();
		synBlock giri=new synBlock();
		giri.seats=6;
		giri.start();
	}
}
