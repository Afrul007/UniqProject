 class A
{
public static void main(String[] args)
{
String a="jahangir";
String a1="afrul";

System.out.println("firstname: " + a+ " secondname: " + a1);
a=a.concat(a1);
a1=a.substring(0,((a.length()-a1.length())));
a=a.substring(a1.length());
System.out.println("string swap: " + a + a1);

}
}



