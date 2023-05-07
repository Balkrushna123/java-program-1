//sum of digits oaf a number
public class sumdigitno
{
	public static void main(String[] args) 
	{
		int num=1947;
		int sum=0;
		while(num>0)
		{
			//1947  194 19 4 quotient
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			// 194 19 1 0 remainder
		}
		System.out.println(sum);
		
	}
}