package Thread;

public class myThread3 extends Thread
{
	public void run() 
	{ 
		System.out.println("Thread Running... "+Thread.currentThread()); 
	} 

	public static void main(String[]args) 
	{ 
		myThread3 p1 = new myThread3();
		myThread3 p2 = new myThread3();
		// Starting thread
		p1.start();
		p2.start();
		// Setting priority
		p1.setPriority(2);
		// Getting -priority
		p2.setPriority(1);
		int p = p1.getPriority();
		int p22 = p2.getPriority();
		
		System.out.println("first thread priority : " + p);  
		System.out.println("second thread priority : " + p22);
		
	} 
}
