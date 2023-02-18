package demo;

import java.util.*;
public class Mass {
	Scanner sc=new Scanner (System.in);
	void collage() {
		
		System.out.println("Tell about your self and which department do u want");
		System.out.println("Which department do you want");
		ArrayList<String> studentname=new ArrayList<String>();
		ArrayList<String> hrmarks=new ArrayList<String>();
		ArrayList<String> department=new ArrayList<String>();
		ArrayList<Cs> a=new ArrayList<Cs>();
		ArrayList<Ece> b=new ArrayList<Ece>();
		ArrayList<Mech>c=new ArrayList<Mech>();
		
		studentname.add("afrul");
		hrmarks.add("thousand one five");
		department.add("cse");
		
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
		
		
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("****Welcome to crescent collage****");
	
	}

}
