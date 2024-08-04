package co1;
import co2.Ticket;
public class ticketDemo 
{
	
	public static void main(String[] args)
	{
		Ticket varisu=new Ticket();
		varisu.setMobile("8019570391");
		varisu.setSeatsBooked(66);
		System.out.println("Mobile:"+varisu.getMobile());
		System.out.println(" Seats Booked="+varisu.getSeatsBooked());
		System.out.println("Total Tickets Booked:"+Ticket.getTotalBooked());
		varisu.setSeatsBooked(5);
		System.out.println();
		
	}

}
