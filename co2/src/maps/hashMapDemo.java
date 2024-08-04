package maps;
import java.util.*;

public class hashMapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer, String> hm1=new HashMap<Integer, String>(2,0.5f);
		hm1.put(101, "murthy");
		hm1.put(102, "vishnu");
		hm1.put(103, "venkat");
		hm1.put(104, "vsenkat");
		
		System.out.println(hm1);
		for(Map.Entry<Integer,String> e:hm1.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());

	}

}
