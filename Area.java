public class Area
{
public static void main(String[] args)
{
int r=5;
circle(r);
}
public static void circle(int r)
{
double area=3.14*r*r;
double peri=2*3.14*r;
System.out.println(area+" "+peri);
}
}