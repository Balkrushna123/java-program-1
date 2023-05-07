//caluculate simple interest
public class sInterest
{
	public static void main(String[] args) {
		int p=1000;
		int n=2;
		int r=10;
		simpleInterest(p,n,r);
	}
	public static void simpleInterest(int p,int n,int r)
	{
		double SI=p*r*n/100;

		System.out.println("simple interest is:"+SI);
	}
}