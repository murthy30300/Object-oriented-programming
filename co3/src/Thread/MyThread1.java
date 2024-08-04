package Thread;

public class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("thread is runing.....");
	}

	public static void main(String[] args)
	{
	MyThread1 p1=new MyThread1();
	p1.start();
	System.out.println("max thread priorir"+p1.MAX_PRIORITY);
	System.out.println("min thread priority"+p1.MIN_PRIORITY+"normal thread priority"+p1.NORM_PRIORITY);
	

	}

}
