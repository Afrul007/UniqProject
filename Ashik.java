package demo;
import java.util.*;
public class Ashik {
	String username;
	int password;
	void display()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the count");
		int a=sc.nextInt();
		ArrayList<String> b=new ArrayList<String>();
		ArrayList<Integer> c=new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			System.out.println("enter the name");
			username=sc.next();
			b.add(username);
			System.out.println("password");
			password=sc.nextInt();
			c.add(password);
				
		}
		Iterator s=b.iterator();
		Iterator o=c.iterator();
		while(s.hasNext()&& o.hasNext()) {
			System.out.println(s.next());
			System.out.println(o.next());
		}
	}
		public static void main(String[] args) {
			Ashik d=new Ashik();
			d.display();
		}
	
}
