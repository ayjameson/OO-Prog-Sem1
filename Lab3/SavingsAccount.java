package Lab3;

public class SavingsAccount
{
	// Shared, every new account gets a unique number.
	private static int nextAccountNumber = 1;

	// This rate is shared by all savings accounts.
	private static double annualInterestRate;

	// Each account keeps its own number and balance.
	private final int accountNumber;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance)
	{
		accountNumber = nextAccountNumber++;

		this.savingsBalance = savingsBalance;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getSavingsBalance()
	{
		return savingsBalance;
	}

	public void calculateMonthlyInterest()
	{

		double monthlyRate = annualInterestRate / 12;
		savingsBalance += savingsBalance * monthlyRate;
	}

	public static void modifyInterestRate(double newAnnualInterestRate)
	{
		// Change the rate for all future monthly interest
		annualInterestRate = newAnnualInterestRate;
	}
}