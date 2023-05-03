public class SavingsAccount extends BankAccount{
	final static double rate = .025;
	//interest rate per year^^^
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount (String name, double initialBalance) {
		super(name, initialBalance);
		this.accountNumber = (super.getAccountNumber()+"-"+savingsNumber);
		this.accountNumber = getAccountNumber();
	}
	
	public void postInterest() {
		super.deposit(getBalance() * rate / 12.0);
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public SavingsAccount (SavingsAccount name, double initialBalance) {
		super(name, initialBalance);
		this.savingsNumber = name.savingsNumber+1;
		this.accountNumber = (super.getAccountNumber()+"-"+savingsNumber);
	}
}