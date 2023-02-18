class A
{
public void methodname()
{
int a=0;
String dayname;
switch(a)
{
	case 1:
System.out.println("monday");
	break;
	case 2:
	System.out.println("tuesday");

	break;
	case 3:
	System.out.println("wednesday");

	break;
	default:
	System.out.println("holiday");

	
	
}
System.out.println(a);
}
public static void main(String[] args){
A obj=new A();
obj.methodname();
}
}