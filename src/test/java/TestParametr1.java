import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParametr1 {
	private int valueA;
	private int valueB;
	private int expected;

	public TestParametr1(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:multyOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { 
			{ 1, 1, 1 },
			{ 2, 3, 6 },
			{ 9, 2, 18 },
			{ 5, 2, 10 },
			{ 1, 5, 5 }
			}
		);
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getMulti(valueA, valueB));
	}
}
