//Super clases
package co2;

public class Bbk 
{
	public static void main(String[] args)
{
		
	Mobile in=new Mobile();
	in.camera();
	oppo mo=new oppo();
	mo.camera();
	onePlus no=new onePlus();
	no.camera();
	vivo ko=new vivo();
	ko.display();
	
}

	
}
class oppo extends Bbk
{
	void camera()
	{
		System.out.println("camera sensor is Samsung");
	}
}
class vivo extends Bbk
{
	void display()
	{
		System.out.println("Amoled screen");
	}
}
class onePlus extends Bbk
{
	void camera()
	{
		System.out.println("Hasselblade camera");
	}
}
 class Mobile
{
	 void camera()
		{
			System.out.println("camera sensor is Sony");
		}

	}