package calculator;

public class Multiply extends ParentCalculator {
	public void multiply(int a, int b) {
		super.set(a*b);
		printresult();
	}
}
