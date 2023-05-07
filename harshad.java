//check the given number is harshad number or not
public class harshad
{
	public static void main(String[] args) 
	{
		int num=25;
		int num2=num;
		int sum=0;
		while(num2>0)  //count of digit
		{
			int rem=num%10;
			sum=sum+rem;  //sum of digit
			num2=num2/10;
		}
		if(num2%sum==0)
		{
			System.out.println("harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
		
	}
}