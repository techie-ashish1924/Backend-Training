package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private int bid;
	private String bName;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bid, String bName) {
    		super();
		this.bid = bid;
		this.bName = bName;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	

}
