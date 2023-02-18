 import java.util.Scanner;
 
public class Scan
{
public static void main(String []args)
{
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value");
	int a =scan.nextInt();
	System.out.println(a);
	System.out.println("Enter b value");
	int b =scan.nextInt();
	System.out.println(b);
	
	if(a>b)
{
	System.out.println("The condition is false");
}
else if(a<b)
{
	System.out.println("a is greater b");
}
else
{
	System.out.println("condition false");
}
}
}