public class CheckingAccount extends BankAccount{
	final static double FEE = 0.15;
	
	public CheckingAccount (String name, double initialAmount) {
		super(name, initialAmount);
		String accountNumber = getAccountNumber();
		setAccountNumber(accountNumber + "-10");
	}
	
	public boolean withdraw (double amount) {
		return super.withdraw(amount+FEE);
	}
}