package Decorator;
interface Shape
{
	public void draw();
	public void erase();
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Shape Circle");
	}
	public void erase()
	{
		System.out.println("Circle is erased");
	}
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Shape Rectangle");
	}
	public void erase()
	{
		System.out.println("Rectangle is erased");
	}
}
abstract class ShapeDecorator implements Shape
{
	Shape decorator;
	public ShapeDecorator(Shape decorator)
	{
		this.decorator=decorator;
	}
	public void draw()
	{
		decorator.draw();
	}
	public void erase()
	{
		decorator.erase();
	}
}
class  RedShapeDecorator extends ShapeDecorator
{
	public RedShapeDecorator(Shape decorator)
	{
		super(decorator);
	}
	public void draw()
	{
		decorator.draw();
		setRedBorder(decorator);
	}
	public void erase()
	{
		decorator.erase();
		resetBorder(decorator);
	}
	private void setRedBorder(Shape decorator)
	{
		System.out.println("Border color:red");
	}
	private void resetBorder(Shape decorator)
	{
		System.out.println("Border color resetted to red");
	}
}
public class decratorDemo
{
	public static void main(String args[])
	{
		Shape Circle=new Circle();
		Circle.draw();
		Circle.erase();
		Shape Rect=new Rectangle();
		Rect.draw();
		Rect.erase();
		Shape redRect=new RedShapeDecorator(new Rectangle());
		redRect.draw();
		redRect.erase();
		Shape redCircle=new RedShapeDecorator(new Circle());
		redCircle.draw();
		redCircle.erase();
  }
}