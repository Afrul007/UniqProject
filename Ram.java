package demo;
import java.util.*;
class Productdetails{
	private int productid;
	private String productname;
	private String productdescription;
	private Long prize;
	
public void setA(int productid) {
	this.productid=productid;
}
public int getA() {
	return productid;
}

public void setB(String productname) {
	this.productname=productname;
}
public String getB() {
	return productname;
}
public void setC(String productdescription) {
	this.productdescription=productdescription;
}
public String getC() {
	return productdescription;
}	
public void setD(Long prize) {
	this.prize=prize;
}
public Long getD() {
	return prize;
}
	
}
class Orderdetails{
	private int orderid;
	private int productid;
	private String orderdescription;
	
	public void setA1(int orderid) {
		this.orderid=orderid;
	}
	public int getA1() {
		return orderid;
	}
	public void setB1(int productid) {
		this.productid=productid;
	}
	public int getB1() {
		return productid;
	}
	public void setC1(String orderdescription) {
		this.orderdescription=orderdescription;
	}
	public String getC1() {
		return orderdescription;
	}
}
class Responce{
	List<Productdetails> getProductdetails() {
		LinkedList<Productdetails> list=new LinkedList <Productdetails>();
		Productdetails p1=new Productdetails();
		Productdetails p2=new Productdetails();
		Productdetails p3=new Productdetails();
		p1.setId(001);
		
		
	}
	
}
public class Ram {

}
