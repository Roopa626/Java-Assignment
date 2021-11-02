package bank;
import java.util.Scanner;
public class Account {
	static double current_balance=2000;
	long LoginID=12345;
	public void showInfo()
	{
		System.out.println("+ LoginId +\n" + "Balance:"+current_balance);
	}
	public static void main(String[]args)throws IllegalBankTransactionException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdrawal amount:");
		int n=sc.nextInt();
		try {
			if(n<0)
			{
				throw new IllegalBankTransactionException("illegal bank trans");
				}
			else
			{
				current_balance=-n;
				System.out.println("Please take the Money:"+n);
			}
		}
		catch(IllegalBankTransactionException eb) {
			eb.printStackTrace();
		}
		
		}

}



