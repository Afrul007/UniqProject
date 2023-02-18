import java.util.Scanner;
class A
{
public static void main(String[] args)
{

Scanner sc=new Scanner (System.in);
System.out.println("Enter the Number of Student list");
int y=sc.nextInt();
StringBuffer n=new StringBuffer(sc.nextLine());

System.out.println("This are the 5 Student list");

StringBuffer a=new StringBuffer();
a.append("Student one : Afrul");
System.out.println(a);
StringBuffer b=new StringBuffer();
b.append("Student two : Rahman");
System.out.println(b);
StringBuffer c=new StringBuffer();
c.append("Student three : Akil");
System.out.println(c);
StringBuffer d=new StringBuffer();
d.append("Student four: Arsath");
System.out.println(d);
StringBuffer e=new StringBuffer();
e.append("Student five : Aathil");
System.out.println(e);

System.out.println("Total Student Count is :" + n);
System.out.println("Add the any other student name inside the list");
StringBuffer x=new StringBuffer(sc.nextLine());

if(x.equals("yes"))
{
	System.out.println("Add the name");
}	

System.out.println("Enter the position you want to add");
int r=sc.nextInt();


x.insert(a,e);
System.out.println(x);

}
}