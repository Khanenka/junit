import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


	@RunWith(Parameterized.class)
	public class TestParametr2 {
		private int valueA;
		private int valueB;
		private int expected;

		public TestParametr2(int valueA, int valueB, int expected) {
			this.valueA = valueA;
			this.valueB = valueB;
			this.expected = expected;
		}

		@Parameterized.Parameters(name = "{index}:divideOf({0}/{1})={2}")
		public static Iterable<Object[]> dataForTest() {
			return Arrays.asList(new Object[][] { 
				{ 1, 1, 1 },
				{ 6, 3, 2 },
				{ -9, 3, -3 },
				{ 15,-3, -5 },
				{ 3, 3, 1 }
				}
			);
		}
		@Test
		public void paramTest() {
			assertEquals(expected, new Calculator().getDivide(valueA, valueB));
		}

}
