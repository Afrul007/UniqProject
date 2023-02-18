import java.util.Scanner;
class Bank
{
	void interest()
	{
		System.out.println("75 percentage");
	}
	void loan()
	{
		System.out.println("50 Thousand");
	}
}
class Sbi extends Bank
{
	void interest()
	{
		System.out.println("30 percentage");
	}
	void loan()
	{
		System.out.println("20 Thousand");
	}
}
class Icic extends Bank
{
	void interest()
	{
		System.out.println("90 percentage");
	}
	void loan()
	{
		System.out.println("40 Thousand");
	}
}
class Hdfc extends Bank
{
	void interest()
	{
		System.out.println("100 percentage");
	}
	void loan()
	{
		System.out.println("10 Thousand");
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("List of Banks");
		System.out.println("1.Sbi");
		System.out.println("2.Icic");
		System.out.println("3.Hdfc");
		System.out.println("Enter your bank");
		
		Sbi obj1=new Sbi();
		Icic obj2=new Icic();
		Hdfc obj3=new Hdfc();
		
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("This is your loan and interest Details");
			obj1.interest();
			obj1.loan();
		}
		if(a==2)
		{
			System.out.println("This is your loan and interest Details");
			obj2.interest();
			obj2.loan();
		}
		if(a==3)
		{
			System.out.println("This is your loan and interest Details");
			obj3.interest();
			obj3.loan();
		}
		
		
	}
}
