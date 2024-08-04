package co4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExp 
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("[a-zA-Z]*sit[a-z]");//singleton pattern
		Matcher matcher=pattern.matcher("University"); //source 
		if(matcher.matches())
			System.out.println("Match Found");
		else
			System.out.println("Match Not Found");

	}

}
