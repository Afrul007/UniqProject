import java.util.Scanner;

class A
{
public static void main(String[] args)
{
	Scanner d=new Scanner(System.in);
String a="Afrul";
String s=new String(a);
System.out.println(a.hashCode());
a="Rahman";
System.out.println(a.hashCode());
StringBuilder obj=new StringBuilder("AKIL");
System.out.println(obj.hashCode());
StringBuilder o=new StringBuilder(d.next());
System.out.println(o.hashCode());

}
}