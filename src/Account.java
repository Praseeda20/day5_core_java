
public class Account {
	private long accNum;
	private double balance;
	private PersonDetail accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public PersonDetail getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(PersonDetail accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amt)
	{
		System.out.println("Your balance was: "+balance);
		balance+=amt;
		System.out.println("Deposit Amount: "+amt);
		System.out.println("Your new balance is: "+balance);
	}
	
	public void withdraw(double amt)
	{
		System.out.println("Withdrawal Amount: "+amt);
		System.out.println("Your Balance before withdrawal: "+balance);
		balance-=amt;
		System.out.println("Balance after withdrawal is: "+balance);
	}
	
	@Override
	public String toString() {
		return "\nAccount [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder Name=" + accHolder.getName()
				+ ", accHolder Age=" + accHolder.getAge() + "]\n";
	}
	
	
	
	
	
	
	
}
