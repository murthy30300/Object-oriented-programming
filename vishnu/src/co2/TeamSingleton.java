package co2;

public class TeamSingleton
{
	
	public static void main(String[] args)
	{
		
		
	}

}
class Captain extends player
{
	Player player=null;
	Captain captain=null;
	private Captain(Player player)
	{
		super.Player(player;
	}
	private Captain(String name, String number)
	{
		
	}
	public Captain getInstance(String name, String numebr)
	{
		if(captain!=null && player!=null)
		{
			return captain;
		}
		else
		{
			captain=new captain;
		}
	}
	
}

