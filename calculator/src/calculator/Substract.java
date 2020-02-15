package calculator;

public class Substract extends ParentCalculator{
	public void substract(int a, int b) {
		super.set(a-b);
		printresult();
	}

}
