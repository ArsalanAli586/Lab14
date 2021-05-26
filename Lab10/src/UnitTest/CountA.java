package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountA {

	@Test
	public void test() {
		JunitTesting obj =new JunitTesting();
		int output = obj.countA("AlphaAAA");
		assertEquals(5, output);
	}

}
