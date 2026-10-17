package Lab3;

public class SavingsAccountTest
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		printBalance(saver1);
		printBalance(saver2);

		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		printBalance(saver1);
		printBalance(saver2);
	}

	private static void printBalance(SavingsAccount account)
	{
		System.out.printf("Account %d balance: EUR %.2f%n",
				account.getAccountNumber(), account.getSavingsBalance());
	}
}