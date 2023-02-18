class A
{
	int a=10;
	static int h=100;

	A()
	{
		
		System.out.println("This is first number:"+(a+h));
	}
	A(int c, int d)
	{
		this();
		this.a=h;
		System.out.println("There is another number"); 
	}
}
class B extends A
{
	int b=20;
	B()
	{
		super(5,5);
		
		System.out.println("This is second number:"+(b+h));
	}
	B(int x , int y)
	{
		this();
		int c=super.a+b+h;
		
		System.out.println("Finally");
		System.out.println("The Total number:"+c);
		
		
	}
	public static void main(String[] args)
	{
		B s=new B(10,10);
	}
}