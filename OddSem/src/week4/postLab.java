package week4;
interface DrawAPI
{
	 void drawCircle(int x, int y, int radius);
}
class RedCircle implements DrawAPI 
{
public void drawCircle(int x, int y, int radius)
{
	 System.out.println("Drawing a red circle at (" + x + ", " + y + ") with radius " +radius);
}
}
class GreenCircle implements DrawAPI 
{
	public void drawCircle(int x, int y, int radius)
	{
	 System.out.println("Drawing a green circle at (" + x + ", " + y + ") with radius "+ radius);
	 }
}
abstract class Shape
{
	 protected DrawAPI drawAPI;
	 public Shape(DrawAPI drawAPI)
	 {
	 this.drawAPI = drawAPI;
	 }
	 public abstract void draw();
}
class Circle extends Shape 
{
	 private int x, y, radius;
	 public Circle(int x, int y, int radius, DrawAPI drawAPI) 
	 {
	 super(drawAPI);
	 this.x = x;
	 this.y = y;
	 this.radius = radius;
	 }
	 public void draw()
	 {
	 drawAPI.drawCircle(x, y, radius);
	 }
}
public	class postLab
{
	 public static void main(String[] args) 
	 {
	 Shape redCircle = new Circle(10, 20, 30, new RedCircle());
	 Shape greenCircle = new Circle(50, 60, 40, new GreenCircle());
	 redCircle.draw();
	 greenCircle.draw();
	 }
}
