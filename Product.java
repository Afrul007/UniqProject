package demo;
import java.util.*;
import java.util.Scanner;

public class Products {
	Scanner in = new Scanner(System.in);
	

void phone() {
	ArrayList<String> mobile=new ArrayList<String>();
	ArrayList<Integer> price=new ArrayList<Integer>();
	
	System.out.println("This are the phones avaliable in our stores ");
	mobile.add("1.iphone");
	mobile.add("2.samsung");
	mobile.add("3.redmi");
	price.add(100000);
	price.add(40000);
	price.add(10000);
	
	for(int i=0;i<mobile.size();i++)
	{
		System.out.println(mobile.get(i) + " Rs-" +price.get(i));
	}
	System.out.println("Select Model : ");
	int num = in.nextInt()-1;
	for(int i=0;i<=mobile.size();i++)
	{
		if(i==num)
		{
		System.out.println("Sucessfully Purchased "+ mobile.get(i));
		mobile.remove(i);
		System.out.println("Remaining Products : "+ mobile.size());
		System.out.println(mobile);
		}
	}
	
	

}
	
void Tv() {
	
	ArrayList<String> tv=new ArrayList();
	ArrayList<Integer> price=new ArrayList();
	System.out.println("This are the Tv avaliable in our stores ");
	tv.add("1.sony");
	tv.add("2.samsung");
	tv.add("3.redmi");
	price.add(1000000);
	price.add(400000);
	price.add(1000);
	

	for(int i=0;i<tv.size();i++)
	{
		System.out.println( tv.get(i) + " Rs-" +price.get(i));
 	}
	System.out.println("Select Model : ");
	int num = in.nextInt()-1;
	for(int i=0;i<=tv.size();i++)
	{
		if(i==num)
		{
		System.out.println("Sucessfully Purchased "+ tv.get(i));
		tv.remove(i);
		System.out.println("Remaining Products : "+ tv.size());
		System.out.println(tv);
		}
	}
	
} 
void Wat() {
	
	ArrayList<String> watch=new ArrayList<String>();
	ArrayList<Integer> price=new ArrayList<Integer>();
	System.out.println("This are the Watch avaliable in our stores ");
	
	watch.add("1.iwatch");
	watch.add("2.galaxyband");
	watch.add("3.redmiband");
	price.add(50000);
	price.add(25000);
	price.add(10000);
	

	for(int i=0;i<watch.size();i++)
	{
		System.out.println( watch.get(i) + " Rs-" +price.get(i));
	}
	System.out.println("Select Model : ");
	int num = in.nextInt()-1;
	for(int i=0;i<=watch.size();i++)
	{
		if(i==num)
		{
		System.out.println("Sucessfully Purchased "+ watch.get(i));
		watch.remove(i);
		System.out.println("Remaining Products : "+ watch.size());
		System.out.println(watch);
		}
	}
	
}


public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Welcome to our store this are the products");
	System.out.println("Which product do you want");
	
	ArrayList<String> list=new ArrayList();
	list.add("mobile");
	list.add("tv");
	list.add("watch");
	System.out.println(list);
	Products obj=new Products();
	String c=sc.next();
	String r ="";
	r=sc.next();
	switch(c) {
	case "mobile":
	{
		obj.phone();
		break;
	}
	case "tv":
	{
		obj.Tv();
		break;
	}
	case "watch":
	{
		obj.Wat();
		break;
	}
	
	}
	System.out.println("Do you want to continue the purchase");
	products ob = new products();
	if(r.equals("Yes"))
	{
		ob.main();
		
	}
	}

}
