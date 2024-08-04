package Sample;
//interface
interface demo
{
	void draw();
}
class rectangle implements demo
{
	public void draw()
	{
		System.out.println("draw RECTANGLE");
	}
}
class circle implements demo
{
	public void draw()
	{
		System.out.println("Draw a circle");
	}
}

public class inheritance  {

	public static void main(String[] args)
	{
		demo d=new rectangle();
		d.draw();

	}

}
