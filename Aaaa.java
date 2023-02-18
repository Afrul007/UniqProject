class A
{
int a=5;
}
class B
{
	int b=10;
}
class C
{
	int sum;
}
class Main
{
public static void main(String[] args)
{
	A obj=new A();
	
	B Ab=new B();
	
	C Abc=new C();
	Abc.sum=obj.a+Ab.b;
	System.out.println(Abc.sum);
}
}
	



	