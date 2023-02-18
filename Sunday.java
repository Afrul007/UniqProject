import java.util.Scanner;
class Member
{
		void name()
		{
			System.out.println("Afrul");
		}
		void age()
		{
			System.out.println("22");
		}
		void phonenumber()
		{
			System.out.println("9585132606");
		}
		void address()
		{
			System.out.println("Emaneswarm");
		}
		void salary()
		{
			System.out.println("20 Thousand");
		}
}

class Employee extends Member
{
	void name()
		{
			System.out.println("Akil");
		}
		void age()
		{
			System.out.println("19");
		}
		void phonenumber()
		{
			System.out.println("9994922249");
		}
		void address()
		{
			System.out.println("madurai");
		}
		void salary()
		{
			System.out.println("40 Thousand");
		}
		void department()
		{
			System.out.println("java developer");
		}
		void specilization()
		{
			System.out.println("java");
		}
		
}
class Manager extends Member
{
	void name()
		{
			System.out.println("Rahman");
		}
		void age()
		{
			System.out.println("23");
		}
		void phonenumber()
		{
			System.out.println("7397552240");
		}
		void address()
		{
			System.out.println("Chennai");
		}
		void salary()
		{
			System.out.println("70 Thousand");
		}
		void department()
		{
			System.out.println("ceo");
		}
		void specilization()
		{
			System.out.println("team lead");
		}
}
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Employee");
		System.out.println("2.Manager");
		
		
		
		Employee obj1=new Employee();
		Manager  obj2=new Manager();
		int a=sc.nextInt();
		if (a==1)
		{
			System.out.println("This are employee details");
			obj1.name();
			obj1.age();
			obj1.phonenumber();
			obj1.address();
			obj1.salary();
			obj1.department();
			obj1.specilization();
		}
		
		if (a==2)
		{
			System.out.println("This are manager details");
			obj2.name();
			obj2.age();
			obj2.phonenumber();
			obj2.address();
			obj2.salary();
			obj2.department();
			obj2.specilization();
		}
		
	}
}