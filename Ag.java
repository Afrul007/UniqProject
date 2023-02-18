import java.util.Scanner;
class A
{
	private String a;
	private String b;
	private String c;
	private int d;
	private String e;
	
 public void setA(String s)
 {
	 this.a=s;
 }
 public String getA()
 {
	 return a;
 }
 public void setB(String s1)
 {
	 this.b=s1;
 }
 public String getB()
 {
	 return b;
 }
 public void setC(String s2)
 {
	 this.c=s2;
 }
 public String getC()
 {
	 return c;
 }
 public void SetD(int s4)
 {
	 this.d=s4;
 }
 public int getD()
 {
	 return d;
 }
 public void setE(String s5)
 {
	 this.e=s5;
 }
 public String getE()
 {
	 return e;
 }
}
class B
{
	public static void main(String[] args)
	{
		
			A s=new A();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your Firstname");
		s.setA(sc.next());
	
		System.out.println("Enter your Secondname");
		s.setB(sc.next());
		System.out.println("Enter your Email id");
		s.setC(sc.next());
		System.out.println("Enter your phone number");
		s.SetD(sc.nextInt());
		System.out.println("Enter your password");
		s.setE(sc.next());
		

			String x=s.getA();
			System.out.println(x);
			
			
			String y=s.getB();
			System.out.println(y);
			
			
			String z=s.getC();
			System.out.println(z);
			
			
			int t=s.getD();
			System.out.println(t);
			
			
			String g=s.getE();
			System.out.println(g);
	}
	
}