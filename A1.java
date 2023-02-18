import java.util.Scanner;
class A
{
	public static void main(String[]args)
	{
		int salary=1000;
		Scanner s=new Scanner(System.in);
		System.out.println("Are you employee");
		String a=s.next();
			if(a.equals("yes"))
			{
			System.out.println("What is your Age");
			
			int b=s.nextInt();
			if(b>=40)
			{
			salary=salary+500;
			System.out.println("Are you Boy or Girl");
			
			String c=s.next();
			if(c.equals("boy"))
			{	
			salary=salary+1000;
			System.out.println(salary);
			}
			else if(c.equals("girl"))
			{	
			salary=salary+500;
			System.out.println(salary);
			}
			}
			else if(b<40)
			{
				System.out.println("your salary is :"+salary);
			}
			}
			else
			{
			System.out.println("no");
			}
	}
}
			