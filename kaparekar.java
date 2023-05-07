//check kaparekar number or not

public class kaparekar
{
	public static void main(String[] args) 
	{
		int num=45;
		int sq=num*num;

		int num2=sq;
		int count=0;

		while(num2>0)   //count number of digit
		{
			num2=num2/10;
			count++;
		}
		if(count%2!=0)//odd number +1 
			count++;
		count=count/2;//divide 2 partas for ex-45//4  5

		int den=(int)Math.pow(10,count);//square 

		int leftPart=sq/den;
		int rightPart=sq%den;

		if(leftPart+rightPart==num)
			{
				System.out.println("kaparekar number");
			}
			else
			{
				System.out.println("Not kaparekar number");
			}
		
	}
}