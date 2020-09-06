
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTets extends Assert {
	
	@BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }
 
    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }
 
    @Before
    public void initTest() {
        Calculator calculator= new Calculator();
    }
 
    @After
    public void afterTest() {
        Calculator calculator= null;
    }
	@Test
    public void testGetDivide() throws Exception {
        assertEquals(20, Calculator.getDivide(100,5));
    }
	@Test
    public void testGetMulti() throws Exception {
 
    }

	@Test
	public void testMathPlus() {
		assertEquals(5, Calculator.getSum(3, 2));
	}
	@Test(expected=ArithmeticException.class)
	public void divisionWithException() {
		Calculator.getDivide(1, 0);
	}
	@Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }
 
    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
}