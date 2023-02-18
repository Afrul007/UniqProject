package demo;
import java.util.*;
public class Aaaa {

void mass()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Student names");
	int n=sc.nextInt();
	ArrayList<String> a=new ArrayList<String>();
	
   for (int i=0;i<n;i++)
   {
	   
	   System.out.println("Enter the names ");
	   a.add(sc.next());
	   
   }
   
}
	public static void main(String[] args) {
		Aaaa c=new Aaaa();
		c.mass();
	}
}

