package demo;

import java.util.*;
class Cs{
	String book;
	int bookno;
	
	Cs(String book,int bookno){
		this.book=book;
		this.bookno=bookno;
	}
}
class Ece{
	String book;
	int bookno;
	
	Ece(String book,int bookno){
		this.book=book;
		this.bookno=bookno;
	}
}
class Mech{
	String book;
	int bookno;
	
	Mech(String book,int bookno){
		this.book=book;
		this.bookno=bookno;
	}
}
public class Array {
	
	public static void main(String[]args) {
		ArrayList<Cs> a=new ArrayList<Cs>();
		ArrayList<Ece> b=new ArrayList<Ece>();
		ArrayList<Mech>c=new ArrayList<Mech>();
		
		Cs a1=new Cs("java",1);
		Cs a2=new Cs("c",2);
		Cs a3=new Cs("python",3);
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		
		Ece b1=new Ece("electric",1);
		Ece b2=new Ece("circuit",2);
		Ece b3=new Ece("engneering",3);
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		
		Mech c1=new Mech("thermo",1);
		Mech c2=new Mech("fuck",1);
		Mech c3=new Mech("you",1);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		String departmentname,mass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you Student or Staff");
		mass=sc.next();
		
		if(mass.equalsIgnoreCase("Student")) {
			System.out.println("Enter your id");
			mass=sc.next();
			System.out.println("Enter your Department");
			departmentname=sc.next();
			switch(departmentname) {
			case "cs":
				
				Iterator<Cs> i = a.iterator();
				
			while(i.hasNext()) {
				Cs l=i.next();
			 System.out.println(" BookName : "+l.book+" -----  bookid : "+l.bookno);
			 int ff=sc.nextInt();
			 System.out.println("Successfull");
			 break;
			}
			case "ece":
				
				Iterator<Ece> i1 = b.iterator();
				
			while(i1.hasNext()) {
				Ece l1=i1.next();
			 System.out.println(" BookName : "+l1.book+" -----  bookid : "+l1.bookno);
			 int dd=sc.nextInt();
			 System.out.println("Successfull");
			 break;
			 
			}
	case "mech":
				
				Iterator<Mech> i11 = c.iterator();
				
			while(i11.hasNext()) {
				Mech l11=i11.next();
			 System.out.println(" BookName : "+l11.book+" -----  bookid : "+l11.bookno);
			 int fff=sc.nextInt();
			 System.out.println("Successfull");
			 break;
			}
				
			}
			
			
			
			
		}
		
		
	}


