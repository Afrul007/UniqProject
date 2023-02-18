class A
{
	A()
	{
		System.out.println("Entr your name");
		
	}
	A(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
class B 
{
	B()
	{
		System.out.println("java");
	}
	B(int d , int e)
	{
		System.out.println(d-e);
	}
public static void main(String[] args)
{
	A s=new A();
	A c=new A(5,10);
	B z=new B();
	B q=new B(5,4);
	
}	
	
}		