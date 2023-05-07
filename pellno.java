//check the given number is pell number or not
public class pellno
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;

		System.out.print("0,1");
		
		for(int i=0;i<10;i++)
		{
			int sum=a+2*b;  
			System.out.print(sum+", ");
			a=b;
			b=sum;
		}
		
	}
}