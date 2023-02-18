package demo;
import java.util.*;
class A {

	private String username;
	private int password;
	
	public void setA(String username) {
		this.username=username;
	}
	public String getA() {
		return username;
	}
	public void setB(int password) {
		this.password=password;
	}
	public int getB() {
		return password;
	}
}
class Process{
		
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("count");
	int s=sc.nextInt();
	ArrayList <String> d=new ArrayList<String>();
	ArrayList <Integer> f=new ArrayList<Integer>();
 	A p=new A();
 	
	for(int i=0;i<s;i++) {
		System.out.println("Enter your username");
		p.setA(sc.next());
		String g=p.getA();
		d.add(g);
		System.out.println("Enter your password");
		p.setB(sc.nextInt());
		int h=p.getB();
		f.add(h);
		
	}
	

	}
}

	
