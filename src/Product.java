import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Product {
	private String purDate;
	private int warntPeriodMonth;
	private int warntPeriodYear;
	
	public Product() {
		}
	public Product(String purDate, int warntPeriodMonth, int warntPeriodYear) {
		this.purDate = purDate;
		this.warntPeriodMonth = warntPeriodMonth;
		this.warntPeriodYear = warntPeriodYear;
	}
	
	public void calcWarPeriod()
	{
		DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate myPurDate= LocalDate.parse(purDate, myFormatter);
		myPurDate=myPurDate.plusMonths(warntPeriodMonth);
		myPurDate=myPurDate.plusYears(warntPeriodYear);
		System.out.println("Your warranty expires on:"+myPurDate.format(myFormatter));
	}
	
	
	

	
	
}
