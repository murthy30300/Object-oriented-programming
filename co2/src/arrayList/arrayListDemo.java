package arrayList;
import java.util.*;
public class arrayListDemo
{
	public static void main (String args[])
	{
		ArrayList<String> a=new ArrayList();
		a.add("abhi");
		a.add("balu");
		a.add("dhanush");
		a.add("mahesh");
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		a.remove(1);
		System.out.println(a);
		System.out.println(a.size());
		a.clear();
		System.out.println(a);
 	}
}
