package facadePattern;
interface shape
{
	public void draw();
}
class circle implements shape
{
	public void draw()
	{
		System.out.println("circle");
	}
}
class square implements shape
{
	public void draw()
	{
		System.out.println("Square");
	}
}
class rectangle implements shape
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
class ShapeMaker
{
	private shape circle;
	private shape rectangle;
	private shape square;
	public ShapeMaker()
	{
		circle=new circle();
		rectangle=new rectangle();
		square=new square();
	}
	public void drawCircle()
	{
		circle.draw();
	}
	public void drawSquare()
	{
		square.draw();
	}
	public void drawRectangle()
	{
		rectangle.draw();
	}
}
public class facadeDemo
{
	public static void main(String[] args)
	{
	ShapeMaker s=new ShapeMaker();
	s.drawCircle();
	s.drawRectangle();
	s.drawSquare();
	
	}
	
}
