//the number is palindrome or not
public class palindrome
{
	public static void main(String[] args) 
	{
		int num1=1111;
		int originalnum=num1;
		int num2=0;

		while(num1>0)
		{
			int rem=num1%10;
			num1=num1/10;
			num2=num2*10+rem;
		}
		if(originalnum==num2)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
}