import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOnePersonYelling() {
		
		Yelling y = new Yelling();
		String actualOutput = y.Scream("Peter");
		assertEquals("Peter is yelling", actualOutput);
	}

}
