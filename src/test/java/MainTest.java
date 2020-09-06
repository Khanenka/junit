import org.junit.runner.JUnitCore;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Second example in MainTest");
		JUnitCore core = new JUnitCore();
		core.addListener(new CalcTestListener());
		core.run(SimpleMathTets.class);

		System.out.println("");
		System.out.println("Third example in MainTest");
	}
}
