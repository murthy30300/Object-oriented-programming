package Week7;

public class pasVal
{
	public static String password(String c)
	{
		if(c.length()>=5&&c.length()<=10)
		{
			return "Valid password: accepted";
		}
		else
		return "Valid password: rejected";
	}
}
