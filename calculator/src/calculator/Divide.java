package calculator;

public class Divide extends ParentCalculator{
	public void divide(int a, int b) {
		try{
			super.set(a/b);
		printresult();
		}catch(ArithmeticException e) {
			System.out.println("Divide by 0 error");
		}
	}
}
