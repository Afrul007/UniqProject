import java.util.Scanner;
class A
{
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of employees");
	int a=sc.nextInt();
	System.out.println("Enter the employee name");
	String b[]=new String[a];
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.next();
	}
	System.out.println("Enter the position of employee mame");
	int c=sc.nextInt();
	
	try
	{
		System.out.println(b[c-1]);
	}
	catch (Exception e)
	{
		System.out.println("hello");
	}
}
}
	

