package factory;

public class phoneDemo 
{
	public static void main(String[] args) 
	{
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("INPPUT_TEXT");
		obj.spec();
	}
}
class OperatingSystemFactory 
{
	public OS getInstance(String str)
	{
		if(str.equals("OPEN"))
			return new Android();
		else if(str.equals("CLOSED"))
			return new IOS();
		else 
			return new Windows();
	}
}
interface OS
{
	void spec();
}
class Android implements OS
{
	public void spec()
	{
		System.out.println("MOST POWERFULL OS; OPEN SOURCE");
	}
}
class IOS implements OS
{
	public void spec()
	{
		System.out.println("MOST SECURE OS; CLOSED SOURCE");
	}
}
class Windows implements OS
{
	public void spec()
	{
		System.out.println("I am about to die");
	}
}
