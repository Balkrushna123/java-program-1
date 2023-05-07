//check trangle is equilateral trangle,isolated trangle or bodmas
public class etrangle
{
	public static void main(String[] args) 
	{
		int s1=5;
		int s2=5;
		int s3=5;

		if(s1==s2 && s2==s3)
		{
			System.out.println("Equilateral trangle");
		}
		else if(s1==s2 || s2==s3 || s3==s1)
		{
			System.out.println("isolated trangle");
		}
		else
		{
			System.out.println("bodmos");
		}
		
	}
}