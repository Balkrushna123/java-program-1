public class swap
{
public static void main(String[] args)
{
int num1=5;
int num2=6;

swap(num1,num2);
}
public static void swap(int no1,int no2)
{
System.out.println(no1+" "+no2);
no1=no1+no2;
no2=no1-no2;
no1=no1-no2;

//no1=no1*no2;
//no2=no1/no2;
//no1=no1/no2;

System.out.println(no1+ " "+no2);
}
}