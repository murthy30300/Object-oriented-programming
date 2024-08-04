package factory;
 interface car{
	void drive();
}
 class honda implements car
{
	public void drive()
	{
		System.out.println("he drive honda");
	}
}
 class ford implements car
 {
 	public void drive()
 	{
 		System.out.println("he drive ford");
 	}
 }
 class royce implements car
 {
	 public void drive()
	 {
		 System.out.println("he drive rolls royce");
	 }
 }
 class carFactory
 {
	 public car getCar(String carType)
	 {
		 if(carType==null)
		 {
			 return null;
		 }
		 else
		 {
			 if(carType.equalsIgnoreCase("honda"))
			 {
				 return new honda();
 			 }
			 else if(carType.equalsIgnoreCase("ford"))
			 {
				 return new ford();
 			 }
			 else if(carType.equalsIgnoreCase("royce"))
			 {
				 return new royce();
 			 }
			 
		 }
		return null;
	 }
 }
public class carDemo {

	public static void main(String[] args) 
	{
		carFactory CarFactory=new carFactory();
		car car1=CarFactory.getCar("Honda");
		car1.drive();
		car car2=CarFactory.getCar("ford");
		car2.drive();
		car car3=CarFactory.getCar("royce");
		car3.drive();
	}
}
