package com.dmantz.BookStoreAppModel;

public class Customer {
	
	private Integer CustId;
	private String  CustName;
	private String  CustAddr;
	private Integer CustNum;
	
	/*@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CustName=" + CustName + ", CustAddr=" + CustAddr + ", CustNum="
				+ CustNum + "]";
	}
	*/
	
	public Integer getCustId() {
		return CustId;
	}
	public void setCustId(Integer custId) {
		CustId = custId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCustAddr() {
		return CustAddr;
	}
	public void setCustAddr(String custAddr) {
		CustAddr = custAddr;
	}
	public Integer getCustNum() {
		return CustNum;
	}
	public void setCustNum(Integer custNum) {
		CustNum = custNum;
	}

}
