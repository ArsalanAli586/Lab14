package Task02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxMinTest {
	int[] array = {7,8,5,6,9,1,15,17,16,22,13};
	MaxMin Obj = new MaxMin();
	@Test
public void min() {
	int output = Obj.min_int(array);
	assertEquals(1, output);
	}
	@Test
public void max() {
	int output = Obj.max_int(array);
	assertEquals(22, output);
	}
}
