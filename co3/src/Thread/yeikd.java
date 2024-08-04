package Thread;

public class yeikd extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)
	{
		yeikd t=new yeikd();
		t.start();
		for(int i=1;i<=5;i++)
		{
			Thread.yield();
			System.out.println("main thread"+i);
		}

	}

}
