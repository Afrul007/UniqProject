import java.util.Scanner;
class Member
{

	String name="Afrul";
	int age=22;
	int phonenumber=9999999;
	String address="Emaneswaram";
	int salary=20000;
void work()
	{
	System.out.println("name  :"+name+"  Age :"+age+"   Phonenumber :"+phonenumber+"  Address : "+address+"  Salary="+salary);
	
	}
}
class Employee extends Member
{
 void display()
 {
	 name="Akil";
     age=19;
	 phonenumber=2223660;
	 address="madurai";
	 salary=70000;

	System.out.println("name  :"+name+"  Age :"+age+"   Phonenumber :"+phonenumber+"  Address : "+address+"  Salary="+salary);
 }
}
class Employee2 extends Member
{
 void display1()
 {
	 name="salim";
	age=25;
	phonenumber=2223377;
	address="paramakudi";
	salary=80000;
	

System.out.println("name  :"+name+"  Age :"+age+"   Phonenumber :"+phonenumber+"  Address : "+address+"  Salary="+salary);

 }
}
class Manager extends Member
{
	void display2()
	{
	 name="Rahman";
	 age=23;
    phonenumber=223800;
 address="  chennai";
    salary=50000;
	String department="team lead";
	String specilization="java full stack development";

System.out.println("name  :"+name+"  Age :"+age+"   Phonenumber :"+phonenumber+"  Address : "+address+"  Salary="+salary+" Department : "+department+" Specilization : "+specilization);
	
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.employee");
		System.out.println("2.employee2");
		System.out.println("3.manager");
		
		int a=sc.nextInt();
		
		Employee x=new Employee();
		Employee2 y=new Employee2();
		Manager z=new Manager();
		if(a==1)
		{
			System.out.println("this is first employee detail");
			x.display();
			
		}
		if(a==2)
		{
			System.out.println("this is second employee detail");
			y.display1();
			
		}
		if(a==3)
		{
			System.out.println("this is manager detail");
			z.display2();
			
		}
		
			
		
		
		
		
	}
}