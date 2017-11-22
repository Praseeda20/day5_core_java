import static java.lang.Math.*;
public class TestForLoopDemo {
	public static void main(String[] args){
		int marks[]=new int[4];
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		marks[3]=60;
		for(int temp:marks)
		{
			System.out.println(temp);
		}
		
		System.out.println("***********************");
		String cities[]={"Pune","Bangalore","Chennai"};
		for(String temp:cities)
		{
			System.out.println(temp);
		}
		
		System.out.println("pi= "+PI);
	}
}
