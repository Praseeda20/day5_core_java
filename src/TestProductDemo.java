import java.util.Scanner;


public class TestProductDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Purchase Date:");
		String purDate=sc.next();
		System.out.println("Enter your Warranty period in Years and Months:");
		int warYear=sc.nextInt();
		int warMon=sc.nextInt();
		Product date= new Product(purDate, warMon, warYear);
		date.calcWarPeriod();
		sc.close();
	}

}
