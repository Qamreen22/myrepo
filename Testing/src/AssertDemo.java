import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
	public void checkassertequal() {
		int res = 2;
		int exp = 2;
		assertEquals(res,exp);
	}
	@Test
	public void check() {
		assertFalse("Hello".contains("m"));
		//assertTrue("Hello".contains("H"));
	}
	@Test
	public void another() {
		String s = "hello";
		assertNull(s);
	}
	@Test
	public void testassumption() {
		int a = 5, s = 25;
		Assumptions.assumeTrue(s==a*a);
		//Assumptions.assumeFalse(s==a*a);
		System.out.println("Hi");
	}
}
