package lambda;
import lambda.Compute;
import lambda.Compute1;
import lambda.Compute2;
import lambda.Compute3;

interface Compute {
int add (int a, int b);
}
interface Compute1 {
int substract (int a, int b);
}
interface Compute2 {
int multiply (int a, int b);
}
interface Compute3 {
int division (int a, int b);
}

public class ArithmeticOperations {
	public static void main(String args[])
	{

	Compute c1 = ( a, b) -> a + b;
	System.out.println(c1.add(50, 20));

	Compute1 c2 = ( a, b) -> a - b;
	System.out.println(c2.substract(30, 10));

	Compute2 c3 = ( a, b) -> a * b;
	System.out.println(c3.multiply(40, 30));

	Compute3 c4 = ( a, b) -> a / b;
	System.out.println(c4.division(300, 10));

	}
	}


