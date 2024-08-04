package evenOdd;
import static org.junit.Assert.*;
import org.junit.Test;
//import Calculator.Calc;

public class EveTester
{
	@Test
	public void test() 
	{
		assertEquals(true,evenu.even(10));
		assertEquals(false,evenu.even(-107));
	}
}
