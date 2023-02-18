import java.util.Scanner;
class A
{	
String a;
String b;
int c;
int d;
void register()
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name");
    a=sc.next();
	System.out.println("Enter your Email Id");
	b=sc.next();
	System.out.println("Enter your Phone No");
	c=sc.nextInt();
	System.out.println("Enter your Password");
	d=sc.nextInt();

}

void Login()
{
	Scanner sca=new Scanner(System.in);
	System.out.println("Enter your Name");
	String a1=sca.next();
	System.out.println("Enter your Password");
	int b1=sca.nextInt();
if (a.equals(a1))
{
	if(d==b1)
	{
		System.out.println("Success fully login");
	}
	else
	{
		System.out.println("Password Incorrect");
	}
}
else{
	System.out.println("Name is Incorrect");
}
}
public static void main(String[] args)
{
	A obj=new A();
	obj.register();
	obj.Login();
}
}
	

	
	