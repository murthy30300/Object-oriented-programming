package co3;

public class DecoratorDemo {

	public static void main(String[] args) {
		BasicCar c=new BasicCar();
		c.assemble();
		
		SportsCar s=new SportsCar(c);
		s.assemble();
		
		LuxuryCar mc= new LuxuryCar(s);
		mc.assemble();
	}
}

interface Car
{
	void assemble();
}

class CarDecorator implements Car
{
	Car car;
	CarDecorator(Car c)
	{
		car=c;
	}
	public void assemble()
	{
		car.assemble();
	}
}

class BasicCar implements Car
{
	public void assemble()
	{
		System.out.println("Basic car");
		
	}
}



class SportsCar extends CarDecorator
{
	SportsCar(Car c)
	{
		super(c);
	}
	public void assemble()
	{
		super.assemble();
		System.out.println("Sports");
		
	}
}

class LuxuryCar extends CarDecorator
{
	LuxuryCar(Car c)
	{
		super(c);
	}
	public void assemble()
	{
		super.assemble();
		System.out.println("Luxury car");
	}
}