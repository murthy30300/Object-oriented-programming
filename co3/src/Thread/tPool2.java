package Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class tPool2
{
	    public static void main(String[] args)
	    {
	        int numTasks = 5;
	        ExecutorService executor = Executors.newFixedThreadPool(numTasks);
	        for (int i = 1; i <= numTasks; i++)
	        {
	            executor.execute(new Ttask(i));
	        }
	        executor.shutdown();
	    }
}
class Ttask implements Runnable 
{
    private int taskId;
    public Ttask(int id) 
{ 
        taskId = id;
    }
    public void run() 
{
System.out.println("Task #" + taskId + " is being executed by " + Thread.currentThread().getName());
 }
}


