package Thread;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class myTask implements Runnable
{
	public void run()
	{
		System.out.println("executing.......");
	}
}
public class MainThread extends Thread
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		myTask t=new myTask();
		Thread tr=new Thread(t);
		tr.start();
		Executor e=Executors.newSingleThreadExecutor();
		e.execute(()->System.out.print("hey"));
		ExecutorService es=Executors.newFixedThreadPool(10);
		Future<String> f=es.submit(()->"hoi");
		String res=f.get();
	}
/*here we can make myTask extends to Thread and avoid creating Thread
 * in the main class
 * 2) we can also write new myTask("hey");*/
}
