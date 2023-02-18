class A
{
A()
{
	
	System.out.println("this is constructor");
}
void m1()
{
	this();
	System.out.println("this is method ");
}
public static void main(String[] args)
{
	A s=new A();
	
}
}