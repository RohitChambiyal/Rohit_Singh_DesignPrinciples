package calculator;

public class Add extends ParentCalculator {
	public void add(int a, int b) {
		super.set(a+b);
		printresult();
	}
}
