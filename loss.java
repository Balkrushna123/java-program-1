public class loss
{
	public static void main(String[] args) {
		int pp=600;
		int sp=800;
		int profit=sp-pp;
		int loss=pp-sp;

		if(sp>pp)
		{
			System.out.println("profit is : "+profit);
		}
		else if(pp>sp)
		{
			System.out.println("loss is :"+loss);
		}
		else
		{
			System.out.println("no profit no loss");
		}
	}
}