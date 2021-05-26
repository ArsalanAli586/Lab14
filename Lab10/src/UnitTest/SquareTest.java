package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitTesting obj=new JunitTesting();
		int output=obj.square(2);
		assertEquals(4, output);
	}
}
