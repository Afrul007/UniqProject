package List;

import java.util.*;

class Purchase{
		String productName;
		int count;
			Purchase(String productName,int count){
				this.productName=productName;
				this.count=count;
			}
}
class Phone{
		String PhoneName;
		int price;
			Phone(String PhoneName,int price){
				this.PhoneName=PhoneName;
				this.price=price;
				
				
			}
}
class Watch
{
	String name;
	int pri;
	Watch(String name,int pri)
	{
		this.name=name;
		this.pri=pri;
	}
	
}
class Laptop{
	String laptopname;
	int price;
	Laptop(String laptopname,int price){
			this.laptopname=laptopname;
			this.price=price;
		}
}
 public class PurchaseTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Purchase> al=new ArrayList<Purchase>();
		ArrayList<Phone> a1=new ArrayList<Phone>();
		ArrayList<Watch> a2=new ArrayList<Watch>();
		ArrayList<Laptop> a3=new ArrayList<Laptop>();
		
		Purchase p1=new Purchase("Phone",3);
		Purchase p2=new Purchase("Watch",3);
		Purchase p3=new Purchase("Laptop",3);
		
		Phone ph1=new Phone("Samsung",20000);
		Phone ph2=new Phone("apple",50000);
		Phone ph3=new Phone("redmi",18000);
		
		Watch cc1=new Watch("aaa",12000);
		Watch cc2=new Watch("bbb",24000);
		Watch cc3=new Watch("ccc",36000);
		
		Laptop lp1=new Laptop("lenovo",29000);
		Laptop lp2=new Laptop("acer",30000);
		Laptop lp3=new Laptop("dell",40000);


			al.add(p1);
			al.add(p2);
			al.add(p3);
		Iterator<Purchase> i = al.iterator();
		while(i.hasNext()) {
		      Purchase p = i.next();
		      System.out.println("Product Name : "+p.productName+" -----  Available count : "+p.count);
		      }
		
		int c=0;
		
		
		do {
			System.out.println("wat do u want to Purchase  ?");
			 c=sc.nextInt();
		
		switch(c)
		{
		case 1:
		{
			a1.add(ph1);
			a1.add(ph2);
			a1.add(ph3);
			
			
			Iterator<Phone> i1 = a1.iterator();
			while(i1.hasNext()) {
			      Phone ph = i1.next();
			      System.out.println(" Product Name : "+ph.PhoneName+" -----  price : "+ph.price);
			      }
			System.out.println("Enter the model number to Purchase it ");
			int choice=sc.nextInt();
			
			System.out.println("You have Purchased successfully");
			a1.remove(choice-1);
			Iterator<Phone> i7 = a1.iterator();
			while(i7.hasNext()) {
			      Phone ph = i7.next();
			      System.out.println("Product Name : "+ph.PhoneName+" -----  price "+ph.price);
			}
			System.out.println();
			p1.count--;
			
			Iterator<Purchase> i2 = al.iterator();
			while(i2.hasNext()) {
			      Purchase p = i2.next();
			      System.out.println("Product Name : "+p.productName+" -----  Available count : "+p.count);
			}
			break;
		}
		case 2:
		{
			a2.add(cc1);
			a2.add(cc2);
			a2.add(cc3);
			Iterator<Watch> i3 = a2.iterator();
			while(i3.hasNext()) {
			      Watch co = i3.next();
			      System.out.println(" Product Name : "+co.name+" -----  price : "+co.pri);
			      }
			System.out.println("Enter the model number to Purchase it ");
			int choice1=sc.nextInt();
			
			System.out.println("You have Purchased successfully");
			
			p2.count--;
			Iterator<Purchase> i4 = al.iterator();
			while(i4.hasNext()) {
			      Purchase p = i4.next();
			      System.out.println("Product Name : "+p.productName+" -----  Available count : "+p.count);
			      
				}
			break;
		}
		case 3:{
			a3.add(lp1);
			a3.add(lp2);
			a3.add(lp3);
			
			Iterator<Laptop> i5 = a3.iterator();
			while(i5.hasNext()) {
			      Laptop lp = i5.next();
			      System.out.println(" Product Name : "+lp.laptopname+" -----  price : "+lp.price);
			      }
			System.out.println("Enter the model number to Purchase it ");
			int choice2=sc.nextInt();
			
			System.out.println("You have Purchased successfully");
			p3.count--;
			Iterator<Purchase> i6 = al.iterator(); 
			while(i6.hasNext()) {
			      Purchase p = i6.next();
			      System.out.println("Product Name : "+p.productName+" -----  Available count : "+p.count);
			      
			}
			break;
		}
		
//		default:{
//			System.out.println("plz enter the correct name ");
//			
//		}
		}
		}while(c>3);
			
	
	}
}