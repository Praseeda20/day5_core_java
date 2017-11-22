
public class CurrentAccount extends Account{
	final double overDraftLimit=-1000;

	@Override
	public void withdraw(double amt) {
		double balance=getBalance();
		System.out.println("Withdrawal Amount: "+amt);
		if(balance-amt>=overDraftLimit)
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Over Draft Limit reached");
			System.out.println("Balance in Account: "+getBalance());
			
		}
		
	}

	@Override
	public String toString() {
		return "\nAccount Type: Current Account"+super.toString();
	}
	
	
}
