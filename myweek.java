//calculate month,year,week and days

public class myweek
{
public static void main(String[] args)
{
int num=8500;

int years=num/365;
int remainingDaysAfterYear=num%365;

int months=remainingDaysAfterYear/30;
int remainingDaysAfterMonth=remainingDaysAfterYear%30;

int weeks=remainingDaysAfterMonth/7;
int days=remainingDaysAfterMonth%7;

System.out.println(years+" "+months+" "+weeks+" "+days);

System.out.println("years is:"+years);
System.out.println("months is:"+months);
System.out.println("weeks is:"+weeks);
System.out.println("Days is:"+days);
}
}