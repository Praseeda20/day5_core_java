
public class AccMethods extends Account {

	@Override
	public void withdraw(double amt)
	{
		double balance=getBalance();
		System.out.println("Withdrawal Amount: "+amt);
		System.out.println("Your Balance before withdrawal: "+balance);
		balance-=amt;
		System.out.println("Balance after withdrawal is: "+balance);
	}
}
