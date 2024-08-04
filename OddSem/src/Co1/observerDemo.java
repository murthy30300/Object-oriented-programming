lpackage Co1;
import java.util.ArrayList;
import java.util.List;
class Subject 
{
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;
   public int getState()
   {
      return state;
   }
   public void setState(int state) 
   {
      this.state = state;
      notifyAllObservers();
   }
   public void attach(Observer observer)
   {
      observers.add(observer);		
   }
   public void deattach(Observer observer)
   {
      observers.remove(observer);		
   }
   public void notifyAllObservers()
   {
      for (Observer observer : observers) 
      {
         observer.update();
      }
   } 	
}
/*Step2: Create Observer class.   
Observer.java*/
abstract class Observer 
{
		protected Subject subject;
		public abstract void update();
}

/*Step3: Create concrete observer classes

BinaryObserver.java*/

class BinaryObserver extends Observer
 {
   public BinaryObserver(Subject subject)
   {
      this.subject = subject;
      this.subject.attach(this);
   }
   public void update() 
   {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}
//OctalObserver.java
 class OctalObserver extends Observer
 {
   public OctalObserver(Subject subject)
   {
      this.subject = subject;
      this.subject.attach(this);
   }
   @Override
   public void update() 
   {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}
//HexaObserver.java
 class HexaObserver extends Observer
 {
   public HexaObserver(Subject subject)
   {
      this.subject = subject;
      this.subject.attach(this);
   }
   @Override
   public void update()
   {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}
//Step 4: Use Subject and concrete observer objects.
public class observerDemo 
{
     public static void main(String[] args) 
     {
     Subject subject = new Subject();
	      Observer hexaoberver=new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("\nFirst state change: 15");	
	      subject.setState(15);
	      System.out.println("\nSecond state change: 10");	
	      subject.setState(10);
	      
	      subject.deattach(hexaoberver);
	      System.out.println("\nthird state change: 17");
	      subject.setState(17);
   }
}