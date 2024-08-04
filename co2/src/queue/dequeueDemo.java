package queue;
import java.util.*;
public class dequeueDemo 
{
	public static void main(String[] args) 
	{
		Deque<String> d=new ArrayDeque<String>();
		d.add("murthy");
		d.add("vishnu");
		d.offerFirst("venkat");
		d.offer("ram");
		System.out.println(d);
		for(String str:d)
			System.out.println(str);
		d.poll(); //used to remove the element
		System.out.println(d);
			

	}

}
