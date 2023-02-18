class A
{
 A()
 {
	 this(5);
	 System.out.println("this is end");
 }
 A(int a)
 {
	 this(5,10);
	 System.out.println(a);
 }
 A(int c,int d)
 {
	 
	 System.out.println(c+d);
 }
 
 
public static void main(String[] args)
{
	A s=new A();
	
}
}