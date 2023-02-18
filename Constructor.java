class A
{
	A()
	{
		System.out.println("hello");
	}
	A(int a, int b)
	{
		System.out.println(a+b);
	}
	
public static void main(String[] args)
{
	A s=new A();
	A c=new A(5,10);
	
}	
}