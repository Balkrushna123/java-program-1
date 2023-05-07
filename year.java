// check leap year or not way2
public class year
{
	public static void main(String[] args) 
		{
		int year=2100;

		if((year%100==0 && year%400==0)||(year%100!=0 && year%4==0))
		{
			System.out.println("Leap");
		}
		else
		{
			System.out.println("Not leap");
		}
		
	}
}