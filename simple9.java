public class simple9
{
	public static void main(String[] args) 
	{
		int val=1235;
		var loop=0;
		while(val>0)
		{
			val=val/10;
			loop++;
		}
		System.out.println(val);
	}
}