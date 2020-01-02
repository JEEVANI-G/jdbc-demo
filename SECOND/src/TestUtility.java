import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUtility {
	
	Utility  u = null;

	@Before
	public void setUp() {
		u = new Utility();
	}

	@After
	public void tearDown() {
		u = null;
	}

	@Test
	public void testSqr() {
		assertEquals(100, u.sqr(10));

	}

	@Test
	public void testSum() {
		assertEquals(40, u.sum(50, -10));

	}

	@Test
	public void testPower() {
		assertEquals(16, u.power(2, 4));

	}

}
