package Lab3;

public class BankCustomer
{
	private final String name;
	private final String address;
	private final SavingsAccount[] accounts = new SavingsAccount[3];
	private int accountCount;

	public BankCustomer(String name, String address)
	{
		this.name = name;
		this.address = address;
	}

	public boolean addAccount(SavingsAccount account)
	{
		if (account == null || accountCount == accounts.length)
		{
			return false;
		}

		accounts[accountCount++] = account;
		return true;
	}

	public double balance()
	{
		double total = 0;
		for (int i = 0; i < accountCount; i++)
		{
			total += accounts[i].getSavingsBalance();
		}
		return total;
	}

	public void summary()
	{
		System.out.printf("Customer: %s, %s%n", name, address);
		for (int i = 0; i < accountCount; i++)
		{
			SavingsAccount account = accounts[i];
			System.out.printf("Account %d: EUR %.2f%n",
					account.getAccountNumber(), account.getSavingsBalance());
		}
	}
}