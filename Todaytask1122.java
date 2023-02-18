import java.util.Scanner;
class A
{
void addreverse(){
	for(int i=21;i>=1;i--)
	{
		System.out.println(i);
	}
}
int add(int a, int b){
		System.out.println((a+b));
		return a+b;
	}
}

class B extends A{
	void mul(){
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		B obj=new B();
		obj.addreverse();
		obj.add(5,6);
		obj.mul();
	
}
}
