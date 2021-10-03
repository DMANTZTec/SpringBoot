package src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
  private int custid;
  private String custname;
  private String custcourse;
  @Autowired
  private Technologies techdetail;
  public Technologies getTechdetail() {
	return techdetail;
}
public void setTechdetail(Technologies techdetail) {
	this.techdetail = techdetail;
}

  public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCustcourse() {
	return custcourse;
}
public void setCustcourse(String custcourse) {
	this.custcourse = custcourse;
}
public void display()
{
	System.out.println("Object Created Successfully");
    techdetail.tech();
}

}
