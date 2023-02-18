interface A
{
	void m1();
	void m2();
	void m3();
	void m4();	
	}
abstract class B implements A
{
	public void m1()
	{
		System.out.println("hiii");
	}
	public void m2()
	{
		System.out.println("hello");
	}
	
}

class C extends B
{
	/*public void m1()
	{
		System.out.println("afrul");
	}
	public void m2()
	{
		System.out.println("rahman");
	}*/
	public void m3()
	{
		System.out.println("Akil");
	}
	public void m4()
	{
		System.out.println("arsath");
	}
	
public static void main(String[] args)
{
	
	C s=new C();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		
}
	
	
}