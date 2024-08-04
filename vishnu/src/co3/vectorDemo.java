package co3;
import java.util.*;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class vectorDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<Integer> values;
		values=new Vector<Integer>();
		values.add(10);
		values.add(20);
		values.add(1,30);
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
			System.out.println("\n ");
		}
		//method2
		for(int i:values)
		{
			System.out.println(i);
			values.remove(0);
			System.out.println("\n ");
		}
		//method 3
		Iterator<Integer> it=values.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				System.out.println("\n ");
			}
		values.set(2, 100);
		//method4
		values.forEach(new Consumer<Integer>() {public void accept(Integer i){	System.out.println(i);	System.out.println("\n ");}	});

	}

}
