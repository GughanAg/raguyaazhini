package org;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@Table(name="Bank_Details")
@DiscriminatorColumn(name="Bank_type",discriminatorType= DiscriminatorType.STRING)
public class BankAccount {
    @Id
	private long accNo;
	private String accHolder;
	private String address;
	private long phoneNo;
	private String mailid;
	protected double balance;
	//private double amount;
	
	public boolean withDraw(double amount){
		return true;
		
	}
	public boolean deposit(double amount){
		return true;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(long accNo, String accHolder, String address, long phoneNo, String mailid, double balance) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.address = address;
		this.phoneNo = phoneNo;
		this.mailid = mailid;
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

}
