package Thread;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class tPool extends Thread
{
	public static void main(String[] args) 
	{
		ExecutorService e=Executors.newFixedThreadPool(5);
		for(int i=1;i<=10;i++)
		{
			Task t=new Task("Task"+i);
			e.execute(t);
		}
		e.shutdown();
	}
}
class Task implements Runnable
{
	private String name;
	public Task(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		System.out.println("Executing "+name+" on Thread "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println(name + " finished execution.");
    }

	}
	
	

