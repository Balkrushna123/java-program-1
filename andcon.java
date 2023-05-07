//check ascii value with and (&&) condition
public class andcon
{
	public static void main(String[] args) 
	{

		char ch='o';

		if(ch>'A' && ch>'Z')
		{
			System.out.println("capital");
		}
		else if(ch>'a' && ch<'z')
		{
			System.out.println("small");
		}
		else if(ch>'0' && ch<'9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("Somethong else");
		}
	}
}