//check maximum number of three numbers
public class max
{
	public static void main(String[] args) {
		int num1=5;
		int num2=7;
        int num3=6;

        if(num1>num2 && num1>num3)
        {
        	System.out.println("num1 is greater");
        }
        else if(num2>num1 && num2>num3)
        	{
        		System.out.println("num2 is greater");
        	}
        	else
        	{
        		System.out.println("num3 is greatere");
        	}
        }
    }