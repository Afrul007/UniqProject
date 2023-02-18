import java.util.Scanner;
class A
{
public static void main(String[] args)
{

Scanner sc=new Scanner (System.in);
System.out.println("Enter the Number of Student list");
int s=sc.nextInt();
StringBuffer n=new StringBuffer();

System.out.println("This are the 5 Student list");
for(int i=0;i<=s;i++)
{
StringBuffer a=new StringBuffer(sc.nextLine());
n.append(a);
}
System.out.println("append string:"+n);
System.out.println("Enter the Student list");
StringBuffer b=new StringBuffer(sc.nextLine());
System.out.println("Ente the position");
int c=sc.nextInt();
n.insert(c,b);
System.out.println("append String :"+n);

}
}