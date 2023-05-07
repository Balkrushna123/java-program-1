//dispaly 101 to 199 numbers last digit is 7
public class checknumber
{
	public static void main(String[] args) 
	{
		int start=101;
		int end=200;

		for(int i=start;i<end;i++)
		{
			if(i%10==7)
			{
				System.out.println(i);
			}
		}
		
	}
}