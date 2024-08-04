package co2;
//Dyname
import java.util.ArrayList;

public class Demoo
{
	public static void main(String[] args) 
	{
		ArrayList<GenericShape> s;
		s=new ArrayList<>();
		s.add(new Rectangle(5,7));
		s.add(new Circle(5.35));
		s.add(new Rectangle(2,8));
		for(GenericShape Shape:s)
			printArea(Shape);
		GenericShape s1=new GenericShape();
		printArea(s1);
		GenericShape s2= new Rectangle(5,15);
		printArea(s2);
		GenericShape s3=new Circle(12);
		printArea(s3);
	}
	static void printArea(GenericShape s)
	{
		double area=s.calculateArea();
		System.out.println(s);
		System.out.println("Area="+area);
		System.out.println();
	}

}
class GenericShape
{
	double calculateArea()
	{
		return -1;
	}
	public String toString()
	{
		return "Shape Details"+"\n"+"_______________"+"\n";
	}
}
class Rectangle extends GenericShape
{
	private int length;
	private int breadth;
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	double calculateArea()
	{
		return length*breadth;
	}
	public String toString()
	{
		return super.toString()+"Length="+length+"\n"+"Breadth="+breadth;
	}
}
class Circle extends GenericShape
{
	private double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	public String toString()
	{
		return super.toString()+"Radius="+radius+"\n";
	}
}
