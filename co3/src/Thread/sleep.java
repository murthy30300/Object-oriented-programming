package Thread;
public class sleep extends Thread 
{
	public void run() {
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		sleep s1=new sleep();
		sleep s2=new sleep();
		s1.start();
		s2.start();
	}
}
