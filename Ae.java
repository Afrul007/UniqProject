class A
{
	A()
	{
		this(5,5);
		System.out.println("hi");
	}
	
	A(int a, int b)
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	B()
	{  super();
	
		
		System.out.println("bye");
		
	}
	B(int c, int d)
	{ this();
		System.out.println(c-d);
	}
	public static void main(String[] args)
	{
		B s=new B(12,12);
	}
}