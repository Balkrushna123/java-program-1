public class simple6
{
	public static void main(String[] args) 
	{
		int x=6;
		int y=0;
		mycode(x,y);
	}
	private static void mycode(float x, float y)
	{
		outer:for(int first=0;first<x;first++)
		{
			for(int second=3;second>=y;second--)
			{
				if(first==second)
					continue outer;
				System.out.println(first + " " + second);
		      }
	     }
	 }
}