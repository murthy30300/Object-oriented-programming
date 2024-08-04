package Week7;

import static org.junit.Assert.*;

import org.junit.Test;

public class passTester 
{
	@Test
	public void test() 
	{
		assertEquals("Valid password: rejected",pasVal.password("A123"));
	}

	
}
