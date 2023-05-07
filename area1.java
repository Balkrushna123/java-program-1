public class area1
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
peri=peri*10;
int temp=(int)peri;
peri=temp;
peri=peri/10;
System.out.println(area+" "+peri);
}
}

/*point value conversion
31.400000000*10
convert int 314
convert double 314.0
314.0/10
ans=31.4
*/