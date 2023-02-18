final class A
{
final void m1()
{
	System.out.println("Finilise the final");
}
final void m1(int a)
{
	System.out.println(a);
}
final int c,d;
static int x;

	A()
	{
		c=10;
		System.out.println(c);
	}
	
	
	static {
		
			x=10;
			System.out.println(x);
		}
		{
			this.m1();
			this.m1(40);
			d=30;
			System.out.println(d);
		}
		public static void main(String[] args)
		{
		
	A s=new A();
	
	
}
}