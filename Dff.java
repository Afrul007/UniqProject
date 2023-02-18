package Thread;


import java.util.*;
class EceBook{
	String bookName;
	int bookNo;
	EceBook(int bookNo,String bookName){
		this.bookNo=bookNo;
		this.bookName=bookName;
	}
}

class MechBook{
	String bookName;
	int bookNo;
	MechBook(int bookNo,String bookName){
		this.bookNo=bookNo;
		this.bookName=bookName;
	}
}

class CseBook{
	String bookName;
	int bookNo;
	CseBook(int bookNo,String bookName){
		this.bookNo=bookNo;
		this.bookName=bookName;
	}
}
public class LibraryArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EceBook> ec=new ArrayList<EceBook>();
		ArrayList<MechBook> mech=new ArrayList<MechBook>();
		ArrayList<CseBook> cs=new ArrayList<CseBook>();
		
		EceBook ec1=new EceBook(1,"aaa");
		EceBook ec2=new EceBook(2,"bbb");
		EceBook ec3=new EceBook(3,"ccc");
		EceBook ec4=new EceBook(4,"ddd");
		ec.add(ec1);
		ec.add(ec2);
		ec.add(ec3);
		ec.add(ec4);
		
		MechBook mech1=new MechBook(1,"aaa");
		MechBook mech2=new MechBook(2,"bbb");
		MechBook mech3=new MechBook(3,"ccc");
		MechBook mech4=new MechBook(4,"ddd");
		mech.add(mech1);
		mech.add(mech2);
		mech.add(mech3);
		mech.add(mech4);
		
		CseBook cs1=new CseBook(1,"aaa");
		CseBook cs2=new CseBook(2,"bbb");
		CseBook cs3=new CseBook(3,"ccc");
		CseBook cs4=new CseBook(4,"ddd");
		cs.add(cs1);
		cs.add(cs2);
		cs.add(cs3);
		cs.add(cs4);
		
		
		String deprtname,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you a student or admin?");
		 choice=sc.next();
		
		
		if(choice.equalsIgnoreCase("student")){
			
			
			System.out.println("Enter the name :");
			 String name=sc.next();
			System.out.println("Enter the id :");
			String id=sc.next();
			
			
			//if(al.contains(id)) {
				System.out.println("Enter the Department name :");
				deprtname=sc.next();
				switch(deprtname) {
				case "ece":
					
				Iterator<EceBook> i = ec.iterator();
				while(i.hasNext()) {
				      EceBook e = i.next();	
				      System.out.println(" BookName : "+e.bookName+" -----  bookid : "+e.bookNo);
				}
				System.out.println("Enter the book number that u want to purchase");
				int bp1=sc.nextInt();
				System.out.println("Thank u");
				break;
				
				case "mech":
					
				Iterator<MechBook> i1 = mech.iterator();
				while(i1.hasNext()) {
				      MechBook m = i1.next();	
				      System.out.println(" BookName : "+m.bookName+" -----  bookid : "+m.bookNo);
				}
				System.out.println("Enter the book number that u want to purchase");
				int bp2=sc.nextInt();
				System.out.println("Thank u");
				break;
				
				case "cse":
					
				Iterator<CseBook> i3 = cs.iterator();
				while(i3.hasNext()) {
				      CseBook c = i3.next();	
				      System.out.println(" BookName : "+c.bookName+" -----  bookid : "+c.bookNo);
				}
				System.out.println("Enter the book number that u want to purchase");
				int bp3=sc.nextInt();
				System.out.println("Thank u");
				break;
				}
				
		
		}
		else if(choice.equalsIgnoreCase("admin")) {
			System.out.println("Enter the admin name");
			String staffName=sc.next();
			System.out.println("Enter the password");
			String pwd=sc.next();
			if((staffName.equalsIgnoreCase("kamala"))&&(pwd.equalsIgnoreCase("kamala@123"))) {
					//if((pwd=="kamala@123")) {
			
				System.out.println("Enter the department name");
				deprtname=sc.next();
				switch(deprtname) {
				case "cse":
					System.out.println("Do you want to 1.add the book 2.remove the book");
					int c1=sc.nextInt();
					if(c1==1) {
						System.out.println("Enter the book name");
						String bname=sc.next();
						System.out.println("Enter the book id");
						int bid=sc.nextInt();
						CseBook cs5=new CseBook(bid,bname);
						cs.add(cs5);
						Iterator<CseBook> i6 = cs.iterator();
						while(i6.hasNext()) {
						      CseBook c = i6.next();	
						      System.out.println(" BookName : "+c.bookName+" -----  bookid : "+c.bookNo);
						}
					
										
					}
					else if(c1==2) {
						System.out.println("Enter the book id to reemove");
						int bid1=sc.nextInt();
						//if(mech.contains(bid1)) {
							cs.remove(bid1+1);
							Iterator<CseBook> i7 = cs.iterator();
							while(i7.hasNext()) {
							     CseBook c = i7.next();	
							      System.out.println(" BookName : "+c.bookName+" -----  bookid : "+c.bookNo);
							}		
						
						}
					break;
				case "mech":
					System.out.println("Do you want to 1.add the book,2.remove the book..enter the option");
					int c2=sc.nextInt();
					if(c2==1) {
						System.out.println("Enter the book name");
						String bname=sc.next();
						System.out.println("Enter the book id");
						int bid=sc.nextInt();
						MechBook mech5=new MechBook(bid,bname);
						mech.add(mech5);
						Iterator<MechBook> i6 = mech.iterator();
						while(i6.hasNext()) {
						     MechBook m = i6.next();	
						      System.out.println(" BookName : "+m.bookName+" -----  bookid : "+m.bookNo);
						}}
						else if(c2==2) {
							System.out.println("Enter the book id to reemove");
							int bid1=sc.nextInt();
							//if(mech.contains(bid1)) {
								mech.remove(bid1+1);
								Iterator<MechBook> i7 = mech.iterator();
								while(i7.hasNext()) {
								     MechBook m = i7.next();	
								      System.out.println(" BookName : "+m.bookName+" -----  bookid : "+m.bookNo);
								}		
							
							}
						
						
					break;

				case "ece":
					System.out.println("Do you want to 1.add the book 2.remove the book..enter the option");
					int c3=sc.nextInt();
					if(c3==1) {
						System.out.println("Enter the book name");
						String bname=sc.next();
						System.out.println("Enter the book id");
						int bid=sc.nextInt();
						EceBook ece5=new EceBook(bid,bname);
						ec.add(ece5);
						Iterator<EceBook> i6 = ec.iterator();
						while(i6.hasNext()) {
						     EceBook e = i6.next();	
						      System.out.println(" BookName : "+e.bookName+" -----  bookid : "+e.bookNo);
						}}
					else if(c3==2) {
						System.out.println("Enter the book id to reemove");
						int bid1=sc.nextInt();
						//if(mech.contains(bid1)) {
							ec.remove(bid1+1);
							Iterator<EceBook> i7 = ec.iterator();
							while(i7.hasNext()) {
							     EceBook e = i7.next();	
							      System.out.println(" BookName : "+e.bookName+" -----  bookid : "+e.bookNo);
							}		
						
						}
					break;

						
			
				}
					}
		}
	}

}