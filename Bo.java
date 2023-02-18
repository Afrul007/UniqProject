class A extends Thread{
public void run(){
for(int i=1;i<4;i++){
System.out.println(i+"=Afrul");
try{
Thread.sleep(500);
}
catch(Exception e){
	System.out.println(e);
}
}
}
}
class B implements Runnable{
	public void run (){
		for(int i=1;i<4;i++){
			System.out.println(i+"=Rahman");
		}
	}
}
class Main{
	public static void main(String[] args){
		A t1=new A();
		B t=new B();
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}
}