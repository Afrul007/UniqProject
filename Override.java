class A
{
	static void m1()
	{
		System.out.println("hi");
	}
	
	void m2()
	{
		System.out.println("hello");
		A s=new A();
		m1();
		
	}
	void m3()
	{
		
	}
	public static void main(String[] args)
	{
		A b=new A();
		b.m2();
	}
}