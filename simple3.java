public class simple3
{
	public static void main(String[] args) {
	int a=2;
	int var=0;
	var*=a;
	a*=var;
	var+=var*a;
	System.out.println("a: " + a);
	System.out.println("var: "+var);	
	}
}