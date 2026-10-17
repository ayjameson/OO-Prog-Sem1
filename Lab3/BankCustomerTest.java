package Lab3;

public class BankCustomerTest
{
	public static void main(String[] args)
	{
		BankCustomer customer = new BankCustomer("Alex Murphy", "1 College Road");
		SavingsAccount first = new SavingsAccount(2000.00);
		SavingsAccount second = new SavingsAccount(3000.00);
		SavingsAccount third = new SavingsAccount(500.00);
		SavingsAccount extra = new SavingsAccount(100.00);

		System.out.println("Added first account: " + customer.addAccount(first));
		System.out.println("Added second account: " + customer.addAccount(second));
		System.out.println("Added third account: " + customer.addAccount(third));
		System.out.println("Added account beyond limit: " + customer.addAccount(extra));
		customer.summary();
		System.out.printf("Total balance: EUR %.2f%n", customer.balance());
	}
}