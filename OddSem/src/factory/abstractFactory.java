package factory;
interface shape{
	 void draw();
}
 class roundedRectangle implements shape
 {
	 public void draw()
	 {
		 System.out.println("inside round rectangle");
	 }
 }
 class roundedSquare implements shape
 {
	 public void draw()
	 {
		 System.out.println("inside round square");
	 }
 }
 class rectangle implements shape{
	 public void draw()
	 {
		 System.out.println("Inside Rectangle draw");
	 }
 }
 class square implements shape{
	 public void draw()
	 {
		 System.out.println("Inside square draw");
	 }
 }

 abstract class abstractFactor
{
	abstract shape getShape(String shapeType);
}


 class shapeFactory extends abstractFactor
 {
	public shape getShape(String shapeType)
	 {
		 if(shapeType.equalsIgnoreCase("rectangle"))
		 {
			 return new rectangle(); //anonymus objects
		 }
		 else if(shapeType.equalsIgnoreCase("square"))
		 {
			 return new square();
		 }
		 return null;
			 
	 }
 }
 class RoundedshapeFactory extends abstractFactor
 {
	public shape getShape(String shapeType)
	 {
		 if(shapeType.equalsIgnoreCase("rectangle"))
		 {
			 return new roundedRectangle(); //anonymus objects
		 }
		 else if(shapeType.equalsIgnoreCase("square"))
		 {
			 return new roundedSquare();
		 }
		 return null;
			 
	 }
 }
class FactoryProducer 
 {
	 public static abstractFactor getFactory(boolean rounded)
	 {
		 if(rounded)
			 return new RoundedshapeFactory();
		 else
			 return new shapeFactory();
		 
	 }
 }
public class abstractFactory {

	public static void main(String[] args) 
	{
		abstractFactor shapeFactory=FactoryProducer.getFactory(false);
		
		shape shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		
		shape shape2=shapeFactory.getShape("Square");
		shape2.draw();
		
		abstractFactor shapeFactory2=FactoryProducer.getFactory(true);
		
		shape shape3= shapeFactory.getShape("rectangle");
		shape3.draw();
		
		shape shape4=shapeFactory.getShape("square");
		shape4.draw();
		
	}
}

