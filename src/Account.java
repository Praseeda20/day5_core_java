
public abstract class Account {
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
	
	public void deposit(double amt){	
		System.out.println("Your balance was: "+balance);
		balance+=amt;
		System.out.println("Deposit Amount: "+amt);
		System.out.println("Your new balance is: "+balance);
	}
	
	public abstract void withdraw(double amt);
	
	
	@Override
	public String toString() {
		return "\nAccount [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder Name=" + accHolder.getName()
				+ ", accHolder Age=" + accHolder.getAge() + "]\n";
	}
	
	
	
	
	
	
	
}
