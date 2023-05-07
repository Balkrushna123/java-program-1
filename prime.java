//check number is prime or not
public class prime
{
	public static void main(String[] args) 
	{
		int num=17;
		int count =0;
		for( int i=2;i<num;i++)
		{
			int rem=num%i;
			if(rem==0)
				count++;
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
}