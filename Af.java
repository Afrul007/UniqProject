class A
{
	int a=10;
	void m1()
	{
		
		System.out.println("First number:"+a);
	}
	
	
}
class B extends A
{
	int b=70;
	void m2()
	{
		
		super.m1();
		System.out.println("Second number:"+b);	
		this.m3();
		
	}
	void m3()
	{
		int c=super.a+b;
		System.out.println("The Total number:"+c);
		
		
		
	}
	public static void main(String[] args)
	{
		B s=new B();
		s.m2();
	}
}