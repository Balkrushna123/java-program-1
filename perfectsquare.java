public class perfectsquare
{
	public static void main(String[] args) 
	{
		int number=25;
		int sqrt=(int) Math.sqrt(number);
		if(sqrt*sqrt==number)
		{
			System.out.println(number+" Perfect square");
		}
		else 
		 {
			System.out.println(number+" not perfect");
		 }
	}
}