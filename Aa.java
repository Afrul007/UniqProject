class A
{
int a=5;
static int b=10;
	
	void m1()
	{
		this.m2(6,6);
		System.out.println(a);
	}
	void m2(int x , int y)
	{
		  this.b=x;
		  System.out.println(b);
		  
			System.out.println("This is add number :"+(x+y));
	}
	A()
	{
		this(5);
		System.out.println("There are many numbers");
	}
	A(int z)
	{
		this.a=z;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
		A s=new A();
		s.m1();
		
	}
}