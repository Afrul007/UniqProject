class A
{
	void m1()
	{
		System.out.println("hello");
	}
	
	void m1(int a,int b)
	{
		System.out.println(a+b);
	}
	
}

class B extends A
{
	void m2()
	{
			System.out.println("this my task");	
				A e=new A();
				e.m1();
				e.m1(5,5);
	}
	void m3()
	{
		System.out.println("hi");
		B s=new B();
		s.m2();
		
	
	}

 
	
	public static void main(String[] args)
	{
		B c=new B();
		c.m3();
	}
		
}	