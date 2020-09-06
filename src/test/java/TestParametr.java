import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestParametr extends Assert {
	
	private int valueA;
	private int valueB;
	private int expected;

	public TestParametr(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(
				new Object[][] { 
									{ 1, 1, 2 }, 
									{ 2, 6, 8 }, 
									{ 18, 2, 20 }, 
									{ 13, 15, 28 }, 
									{ 1, 5, 6 } 
									}
				);
	}

	@Test
	public void paramTest() {
		new Calculator();
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}
	
	
	
}