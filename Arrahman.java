package demo;
import java.util.*;
class Student{
	String name;
	int rollno;
	int age;
	Student(String name,int rollno,int age){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
}
public class Arrahman {

	public static void main(String[] args) {
		ArrayList <Student> a=new 	ArrayList <Student>();
		Student b=new Student("Afrul  ",001,23);
		Student c=new Student("Afrul  ",001,23);
		Student d=new Student("Afrul  ",001,23);
		a.add(b);
		a.add(c);
		a.add(d);
		//Iterator g=a.iterator();
		for(int i=0;i<a.size();i++)
		{
			Student g=a.get(i);
			System.out.println(g.name+g.rollno+" "  +g.age);
		}

	}

}
