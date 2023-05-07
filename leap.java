//check leap year or not way1
public class leap
{
	public static void main(String[] args) {
		int year=2100;

		if(year%100==0)
		{
			if(year%4==0 && year%400==0)
			{
				System.out.println("Leap");
			}
			else
			{
				System.out.println("not leap");
			}
		}
	}
}