package Sample;
import java.util.*;
public class some 
{
	public static void main(String[] args)
	{
		Scanner lk=new Scanner(System.in);
		int nem=lk.nextInt();
		String set=lk.next();
		int ac=0;
		int bc=0;
		int cc=0;
		int count=0;
		for(int iota=0;iota<nem;iota++)
		{
			char sh=set.charAt(iota);
			if(sh=='A')
			{
				ac++;
			}
			else if(sh=='B')
			{
				bc++;
			}
			else if(sh=='C')
			{
				cc++;
			}
			if(ac>0&&bc>0&&cc>0)
			{
				count=iota+1;
				break;
			}
		}
		System.out.println(count);

	}

}
