package demo;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
	
	Scanner sc=new Scanner(System.in);
	
	String name;
	
	int password;
	int a;
	void log()
	{
		System.out.println("Enter user name");
		name=sc.next();
		System.out.println("password");
		password=sc.nextInt();
	}
void login()
{
	
	System.out.println("Enter the Name");
	String name1=sc.next();
	System.out.println("Enter the password");
	int password2=sc.nextInt();
	
	if(name.equals(name1))
	{
		if(password==password2)
		{
			System.out.println("Enter the count" );
			a=sc.nextInt();
		}
	}
}
	void details()
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String>a1=new ArrayList();
		ArrayList<String>a2=new ArrayList();
		ArrayList<String>a3=new ArrayList();
		ArrayList<String>a4=new ArrayList();
		
		
	
		
		
	
		
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the Name");
			a1.add(sc.next());
			System.out.println("Enter the Gmail");
			a2.add(sc.next());
			System.out.println("Enter the phone no");
			a3.add(sc.next());
			System.out.println("Enter the address");
			a4.add(sc.next());
			
		}
		
		
		
		
		if(a>0)
		{
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		}
		
		
	}

	
	public static void main(String[] args)
	{
		Arraylist b=new Arraylist();
		b.log();
		b.login();
		b.details();
	}

}
