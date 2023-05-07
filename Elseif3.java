//nested/cascade ifelse
public class Elseif3
{
	public static void main(String[] args)
	{
		int amount=1200;
		
		if(amount>5000)
		System.out.println("5 Star");
		else
		{
			if(amount>1000)
			System.out.println("Kfc");
			
			else
			{
				if(amount>500)
				System.out.println("MacD");
				else
				{
					if(amount>100)
					System.out.println("Thali");
					else
					System.out.println("Mess");
				}
			}
		}
	}
}