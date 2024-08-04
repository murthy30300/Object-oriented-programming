package co1;

public class Counter {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int odd=5;
		int even=2;
		for(String s:args)
		{
			if(Integer.parseInt(s)%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("# of odds:"+odd);
		System.out.println("# of even:"+even);

	}

}
