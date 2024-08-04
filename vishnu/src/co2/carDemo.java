package co2;
//Association and compostion
public class carDemo 
{
	public static void main(String [] args)
	{
		MusicPlayer p=new MusicPlayer("Sony",100);
		Car c=new Car("Honda",p);
		System.out.println("Car Details\n");
		System.out.println("\n"+c.toString());
	}
}
class MusicPlayer
{
	String make;
	int power;
	MusicPlayer(String m,int p)
	{
		make=m;
		power=p;
	}

	public String toString()
	{
		return "Make="+make+"\npower="+power;
	}
}
class Car
{
	String make;
	MusicPlayer player;
	Car(String m, MusicPlayer p)
	{
		make=m;
		player=p;
	}
	public String toString()
	{
		return "Make="+make+"\nMusic Player:\n"+player.toString();
	}
}
