class A
{
	int a=10 ;
	int b=10 ;
	float y=10.0f;
	
}
class B extends A
{
	B()
	{
		System.out.println(a+b);
		
	}
	B(int c,int d)
	{
		System.out.println(c+d);
	}
}
class C extends B
{
	C()
	{
		System.out.println(y);
	}
 	
public static void main(String[] args)
{
	B s=new B();
	B x=new B(5,7);
	C u=new C();
		
}
}








