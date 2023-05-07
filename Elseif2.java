public class Elseif2
{
	public static void main(String[] args)
	{
		int amount=1200;
		
		if(amount<100)
		System.out.println("Mess");
		else if(amount<500)
		System.out.println("Thali");
		else if(amount<1000)
		System.out.println("Macd");
		else if(amount<5000)
		System.out.println("Kfc");
		else
		System.out.println("5Star");
	}
}