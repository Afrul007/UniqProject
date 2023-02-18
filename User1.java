import java.util.Scanner;
class A
{
public static void main(String[] args)
{
	int sum=0;
	int avg;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		System.out.println("Enter the number");
		int b=sc.nextInt();
		sum=sum+b;
		
	}
	
	System.out.println(sum+"this is sum");
	avg=sum/a;
	System.out.println(avg+"this is average" );
	
	
	
}
}
