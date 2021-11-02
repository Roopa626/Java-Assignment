package exception;
import java.util.Scanner;
public class Exception {
	public static void main(String[] args) {
		try {
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number:");
			a=sc.nextInt();
			System.out.println("Enter the second number":);
			b=sc.nextInt();
			c=a/b;
			System.out.println("Result:"+c);
			}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
			System.out.println();
		}
		

	}

}
