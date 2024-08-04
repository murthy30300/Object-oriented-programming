package Co1;

public class singleTon {

	public static void main(String[] args) 
	{
		SingleObject obj=SingleObject.getInstance();
		obj.showMessage();

	}

}
class SingleObject
{
	private static SingleObject instance=new SingleObject();
	private SingleObject()
	{
		
	}
	public static SingleObject getInstance()
	{
		return instance;
	}
	public void showMessage()
	{
		System.out.println("Hello World");
	}
	
	
}
