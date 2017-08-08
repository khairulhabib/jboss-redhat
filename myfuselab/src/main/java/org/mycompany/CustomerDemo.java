package org.mycompany;

import java.io.Serializable;

public class CustomerDemo implements Serializable {

	private String customerId;
	private String vipstatus;
	private Integer balance;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	
	

}
