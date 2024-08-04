package square;
import static org.junit.Assert.*;
import org.junit.Test;
public class ttd 
{
	@Test
	public void test() 
	{
		Square1 ob =new Square1(); 
	//	fail("Not yet implemented");
		int output=ob.square(5);
		assertEquals(27,output);
	}
}
