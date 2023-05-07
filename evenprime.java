//check the number is even ,odd or prime 
import java.util.Scanner;
public class evenprime
{
	public static void main(String[] args) 
	{
		int choice=0;
		Scanner sc=new Scanner(System.in);
		while(choice!=4)
		{
			System.out.println("Enter\n1:Prime\n2:Even\n3:Odd\n4:Exit");
			choice=sc.nextInt();

			if(choice==1)
			
				printPrimeNumbers();
			else if(choice==2)
				printEvenNumbers();
			else if(choice==3)
				printOddNumbers();
			else if(choice==4)
				System.out.println("tata bye bye khatam");
			else
				System.out.println("wrong input");
		
		}
	}
		public static void printPrimeNumbers()
		{
			for(int i=1;i<=100;i++)
				printIfPrime(i);
		}
		
	public static void printIfPrime(int num)
	{
		if(num==1)
			return;

		int count=0;

		for(int i=2;i<num;i++)
			if(num%i==0)
				count++;

			if(count==0)
			
				System.out.println(num);
		}
		public static void  printEvenNumbers()
		{
			for(int i=1;i<=100;i++)
				printIfEven(i);
		}
		public static void printIfEven(int num1)
		{
			if(num1%2==0)
				System.out.println(num1);
		}
		public static void printOddNumbers()
		{
			for(int i=1;i<=100;i++)
				printIfOdd(i);
		}
		public static void printIfOdd(int num2)
		{
			if(num2%2!=0)
				System.out.println(num2);
		}
	}