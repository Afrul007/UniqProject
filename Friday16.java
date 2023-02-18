import java.util.Scanner;
class Phone
{
  void call()
  {
	  System.out.println("Afrul is calling");
  }
  void msg()
  {
	  System.out.println("Afrul is messaging");
  }
}
class Redmi
{
  void videocall()
  {
	  System.out.println("Afrul is videocalling");
  }
  void camera()
  {
	  System.out.println("Afrul is taking a picture");
  }
}
class Iphone extends Phone
{
  void safe()
  {
	  System.out.println("Afrul iphone more safer than other phones");
  }
   void call()
  {
	  System.out.println("Afrul is calling");
  }
  void msg()
  {
	  System.out.println("Afrul is messaging");
  }
}
class Samsung extends Phone
{
  void fingerlock()
  {
	  System.out.println("new locking system");
  }
   void call()
  {
	  System.out.println("Afrul is calling");
  }
  void msg()
  {
	  System.out.println("Afrul is messaging");
  }
}
class Main
{
public static void main(String[] args)
{
	String ss="";ss
	do{
	Scanner sc=new Scanner(System.in);
	System.out.println("phones");
	System.out.println("1.Redmi");
	System.out.println("2.Iphone");
	System.out.println("3.Samsung");
	System.out.println("Enter your Phone");
	
	Redmi obj1=new Redmi();
	Iphone obj2=new Iphone();
	Samsung obj3=new Samsung();
	
	
	int num=sc.nextInt();
	
	switch(num)
	{
		case 1:
			System.out.println("my phone");
			obj1.videocall();
			obj1.camera();
			break;
		case 2:
			System.out.println("my phone");
			obj2.safe();
			obj2.call();
			obj2.msg();
			break;
		case 3:
			System.out.println("my phone");
			obj3.fingerlock();
			obj3.call();
			obj3.msg();
			break;
	}
				System.out.println("do u want to continue?");
				 ss=sc.next();
				
	
	}while(ss.equals("yes"))
}
}