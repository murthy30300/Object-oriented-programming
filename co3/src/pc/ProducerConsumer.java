package pc;
import java.util.*;
public class ProducerConsumer {
public static void main(String args[])
{
	List<Integer> sharedlist=new ArrayList<Integer>();
	Thread thread1=new Thread(new Producer(sharedlist));
	Thread thread2=new Thread(new Consumer(sharedlist));
	thread1.start();
	thread2.start();
	}
}
class Producer implements Runnable
{
	List<Integer> sharedlist=null;
	final int MAX_SIZE=5;
	private int i=0;
	public Producer(List<Integer> sharedlist)
	{
		super();
		this.sharedlist=sharedlist;
	}
	public void run()
	{
		while(true)
		{
			try {
			produce(i++);
		
			}
			catch(InterruptedException e)
			{
			}
			 
		}
	}
	public void produce(int i)throws InterruptedException
	{
		synchronized(sharedlist)
		{
			while(sharedlist.size()==MAX_SIZE)
			{
				System.out.println("shared list id full....waiting for consumer to consume");
				sharedlist.wait();
			}
		}
		synchronized(sharedlist)
		{
			System.out.println("producer produced element"+i);
			sharedlist.add(i);
			Thread.sleep(100);
			sharedlist.notify()	;
			}
	}
}
class Consumer implements Runnable
{
	List<Integer> sharedlist=null;
	public Consumer(List<Integer> sharedlist)
	{
		super();
		this.sharedlist=sharedlist;
	}
	public void run()
	{
		while(true)
		{
			try {
			consume(); 
		
			}
			catch(InterruptedException e)
			{
			}
			 
		}
	}
	public void consume()throws InterruptedException
	{
		synchronized(sharedlist)
		{
			while(sharedlist.isEmpty())
			{
				System.out.println("shared list is empty....waiting for producer to produce the objects");
				sharedlist.wait();
			}
		}
		synchronized(sharedlist)
		{
			Thread.sleep(1000);
			System.out.println("consumer element"+sharedlist.remove(0));
			sharedlist.notify()	;
			}
	}
}