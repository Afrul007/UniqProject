class A
{
	void m1()
	{
		System.out.println("hello");
		this.m2(5);
		
	
	}
	void m2(int a)
	{
		System.out.println(a);
		this.m3(9);
	}
	
	void m3(int b)
	{
		System.out.println(b);
		this.m4();
	}
	void m4()
	{
		System.out.println("End");
		
	}
public static void main(String[] args)
{
	A s=new A();
	s.m1();
}
}