import java.util.Scanner;
public class table
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Table of : "+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
		
	}
}