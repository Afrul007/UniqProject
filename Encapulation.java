class A
{
private int a=10;
public void setA(int a)
{
	this.a=a;
}
public int getA()
{
	return a;
}
}
class B 
{
	public static void main(String[] args)
	{
		A s=new A();
		s.setA(5);
		int z=s.getA();
		System.out.println(z);
	}
}