package calculator;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number ");
		int a = s.nextInt();
		System.out.println("Enter Second number");
		int b = s.nextInt();
		System.out.println("Select Operation \n 1 for addition \n 2 for substraction \n 3 for divide \n 4 for multiply ");
		int select = s.nextInt();
		switch(select){
		case 1:
			 Add add1 = new Add();
			 add1.add(a,b);
			 break;
		case 2:
			Substract sub = new Substract();
			sub.substract(a, b);
			break;
		case 3:
			Divide div = new Divide();
			div.divide(a, b);
			break;
		case 4:
			Multiply mul = new Multiply();
			mul.multiply(a, b);
			break;
		default:
			System.out.println("Wrong input Selected");
			break;
		}
		s.close();
		


	}

}
