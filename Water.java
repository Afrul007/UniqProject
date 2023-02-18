package demo;
import java.util.*;
public class Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap <Integer,String> list=new HashMap<Integer,String>();
		System.out.println("Enter the count that you want");
		int a=sc.nextInt();
		System.out.println("Enter the employee details");
		for(int i=1;i<a;i++) {
			list.put(sc.nextInt(), sc.next());
		}
		
	//	list.put(1,"Afrul");
	//	list.put(2,"rahman");
	//  list.put(3, "Akil");
	//	list.put(4, "Arsath");
	//	System.out.println(list);
		
		Set<Map.Entry<Integer,String>> s=list.entrySet();
		Iterator<Map.Entry<Integer,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer,String> f=i.next();
			System.out.println(f.getKey()  +  " : " + f.getValue());
		}

	}

	
}
