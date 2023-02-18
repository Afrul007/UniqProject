class A
{
 int a=10;
 void count()
 {
		System.out.println("A class");
 }
}
class B extends A
{
	int a=20;
	void count()
	{
		System.out.println("B class");
	}
public static void main(String[] args)
{
	A obj=new A();
	System.out.println(obj.a);
	obj.count();
	
	B obj1=new B();
	System.out.println(obj1.a);
	obj1.count();
	
	A obj2=new B();
	System.out.println(obj2.a);
	obj2.count();
	
}  
}