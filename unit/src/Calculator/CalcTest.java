package Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalcTest 
{
	@Test
	public void test() 
	{
		assertEquals(30,Calc.add(10,20));
		assertSame(-10,Calc.sub(10,20));
		assertEquals(200,Calc.mul(10,20));
		assertEquals(1,Calc.div(20,20));
	}
}