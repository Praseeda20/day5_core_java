
public class SavingsAccount extends Account{
	final double minBal=500;

	@Override
	public void withdraw(double amt) {
		double balance=getBalance();
		System.out.println("Withdrawal Amount: "+amt);
		if(balance-amt>=minBal)
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("You cannot withdraw. Minimum balance 500"
					+ " sholud be there. \nYour current balance: "+getBalance());
		}
		
	}
	@Override
	public String toString() {
		return "\nAccount Type: Savings Account"+super.toString();
	}
	
	
}
