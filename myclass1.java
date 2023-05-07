public class myclass1
{
	public static void main(String[] args) {
		int x = 17;
		{
			int y = 20;
			System.out.println(x + ", " + y);
		}
		{
			int y = 10;
			x = 15;
			System.out.println(" - " + x + ", " + y);
		}
		System.out.print(" - " + x);
		
	}
}