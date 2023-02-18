class A
{
public static void main(String[] args)
{
StringBuffer a=new StringBuffer("cat");
StringBuffer r=new StringBuffer();
r=a.reverse();
r.append("at");
System.out.println(r);
}
}