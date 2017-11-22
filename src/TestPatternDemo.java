import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


//import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;


public class TestPatternDemo {
	public static void main(String[] args) {
		String inputStr= "Test String";
		String pattern= "Test String";
		
		boolean patternMatched = Pattern.matches(pattern, inputStr);
		System.out.println(patternMatched);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String firstName=sc.next();
		String namePattern="[A-Z][a-z]+";
		
		if(Pattern.matches(namePattern, firstName))
		{
			System.out.println("Hi " +firstName+"..!!");
		}
		else
		{
			System.out.println("Invalid name sholud have only characters "
					+ "and should start with capital.");
		}
		

		System.out.println("***********************");
		String input="Shop,Hop,Hopping,Chopping";
		Pattern patterns= Pattern.compile("hop");
		Matcher matcher=patterns.matcher(input);
		System.out.println("*********"+matcher.matches());
		while(matcher.find())
		{
			System.out.println(matcher.group()+": "+matcher.start()+": "+matcher.end());
		}
		
		sc.close();
	}
}
