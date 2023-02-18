package demo;

import java.util.ArrayList;
import java.util.Scanner;
class Phone{
	String name;
	int amount;
	Phone(String name,int amount){
		this.name=name;
		this.amount=amount;
	}
}

public class kamala {

	public static void main(String[] args) {
		ArrayList<Phone> list=new ArrayList<Phone>();
        Phone p1=new Phone("p1",10000);
        Phone p2=new Phone("p2",20000);
        Phone p3=new Phone("p3",30000);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount :");
        int a=s.nextInt();
        for(Phone p:list)
        {
        	if(p.amount<=a)
        	{
        		System.out.println("phone :"+p.name+" amount:"+p.amount);
        	}
        }

	}

}
