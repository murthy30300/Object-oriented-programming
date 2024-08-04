package stati;
class bookTheaterSeat
{
	static int total_seats=20;
	static synchronized void bookSeats(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println(seats+"seats booked successfullyh");
			total_seats=total_seats-seats;
			System.out.println("seats left"+total_seats);		
		}
		else
		{
			System.out.println(seats+"Seats cannot be booked");
			System.out.println("seats left"+total_seats);
		}
	}
}
class MyThread1 extends Thread
{
	bookTheaterSeat b;
	int seats;
	MyThread1(bookTheaterSeat b, int seats)
	{
		this.b=b;
		this.seats=seats;
	}
	public void run()
	{
		b.bookSeats(seats);
	}
	
}
class MyThread2 extends Thread
{
	bookTheaterSeat b;
	int seats;
	MyThread2(bookTheaterSeat b,int seats)
	{
		this.b=b;
		this.seats=seats;
	}
	public void run()
	{
		b.bookSeats(seats);
	}
}s
public class statSyn
{
	public static void main(String[] args)
	{
		bookTheaterSeat b1=new bookTheaterSeat();
		MyThread1 t1=new MyThread1(b1,7);
		t1.start();
		MyThread2 t2=new MyThread2(b1,6);
		t2.start();
		bookTheaterSeat b2=new bookTheaterSeat();
		MyThread2 t3=new MyThread2(b2,7);
		t3.start();
		MyThread2 t4=new MyThread2(b1,6);
		t4.start();
		
	}
}
