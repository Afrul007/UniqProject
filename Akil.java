package demo;

import java.util.ArrayList;

public class Akil {
	public static void main(String[]args) {
		ArrayList<Integer>a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList<Integer>a2=new ArrayList();
		a2.add(50);
		a2.add(100);
		a2.add(150);
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2,a2);
		System.out.println(a1);
		a1.add(0,40);
		System.out.println(a1);
		a1.remove(20);
		System.out.println(a1);
	}

}
