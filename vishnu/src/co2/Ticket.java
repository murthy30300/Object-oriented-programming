package co2;
public class Ticket
{
	private String mobile;
	private int SeatsBooked;
	private static int totalSeatsBooked=0;
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
	public int getSeatsBooked()
	{
		return SeatsBooked;
	}
	public void setSeatsBooked(int SeatsBooked)
	{
		int temp=this.SeatsBooked;
		this.SeatsBooked=SeatsBooked;
		totalSeatsBooked+=(SeatsBooked-temp);
	}
	public static int getTotalBooked()
	{
		return totalSeatsBooked;
	}
}
