
public class TestAccount {
	static long accNum;
	public static void main(String[] args) {
		accNum=1000023l;
		PersonDetail smith=new PersonDetail();
		smith.setName("Smith");
		smith.setAge(22);
		
		PersonDetail kathy=new PersonDetail();
		kathy.setName("Kathy");
		kathy.setAge(21);
		
		Account smithAc=new AccMethods();
		smithAc.setAccNum(accNum++);
		smithAc.setBalance(2000);
		smithAc.setAccHolder(smith);
		
		
		Account kathyAc=new AccMethods();
		kathyAc.setAccNum(accNum++);
		kathyAc.setBalance(3000);
		kathyAc.setAccHolder(kathy);
	
		
		System.out.println(smithAc.toString());
		smithAc.deposit(2000);
		
		System.out.println(kathyAc.toString());
		kathyAc.withdraw(2000);	
	}
}
