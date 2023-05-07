//print the simple calculator

import java.util.Scanner;
public class calculator
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();

		System.out.println("enter second number");
		int num2=sc.nextInt();

		System.out.println("press 1-add 2-sub 3-mult 4-div");
		int operation=sc.nextInt();

		int result=0;
		if(operation==1)
		{
			result=num1+num2;
		}
		else if(operation==2)
		{
			result=num1-num2;
		}
		else if(operation==3)
		{
			result=num1*num2;
		}
		else if(operation==4)
		{
			result=num1/num2;
		}
			else
			{
				System.out.println("Invalid number");
			}
			System.out.println("the result is :"+result);
	}
}