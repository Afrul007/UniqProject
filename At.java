abstract class A
{
	abstract void m1();
	A()
	{
		this(5,5);
		System.out.println("hii");
		 
	}
	
	A(int a,int b)
	{
		System.out.println(a+b);
	}
}
class B  extends A
{
	B()
	{
		super();
		System.out.println("How are you");
	}	
	
	B(int c, int d)
	{
		this();
		System.out.println(c+d);
	}
	
	void m1()
	{
		System.out.println("This are the constructor");
	}
	
	public static void main(String[] args)
	{
		B s=new B(6,6);
		s.m1();
		
	}
}

	