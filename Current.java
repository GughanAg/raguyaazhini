package org;

import javax.persistence.Entity;

@Entity
public class Current extends BankAccount {


	private double minAmntCanBeTransferred = 500000;
	private int minNoofTransaction = 7;
	private double amntTransferred;
	private double noOfTransactionHeld;
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Current(long accNo, String accHolder, String address, long phoneNo, String mailid, double balance) {
		super(accNo, accHolder, address, phoneNo, mailid, balance);
		// TODO Auto-generated constructor stub
	}
	public Current(long accNo, String accHolder, String address, long phoneNo, String mailid, double balance,
			double minAmntCanBeTransferred, int minNoofTransaction, double amntTransferred,
			double noOfTransactionHeld) {
		super(accNo, accHolder, address, phoneNo, mailid, balance);
		this.minAmntCanBeTransferred = minAmntCanBeTransferred;
		this.minNoofTransaction = minNoofTransaction;
		this.amntTransferred = amntTransferred;
		this.noOfTransactionHeld = noOfTransactionHeld;
	}
	public double getMinAmntCanBeTransferred() {
		return minAmntCanBeTransferred;
	}
	public void setMinAmntCanBeTransferred(double minAmntCanBeTransferred) {
		this.minAmntCanBeTransferred = minAmntCanBeTransferred;
	}
	public int getMinNoofTransaction() {
		return minNoofTransaction;
	}
	public void setMinNoofTransaction(int minNoofTransaction) {
		this.minNoofTransaction = minNoofTransaction;
	}
	public double getAmntTransferred() {
		return amntTransferred;
	}
	public void setAmntTransferred(double amntTransferred) {
		this.amntTransferred = amntTransferred;
	}
	public double getNoOfTransactionHeld() {
		return noOfTransactionHeld;
	}
	public void setNoOfTransactionHeld(double noOfTransactionHeld) {
		this.noOfTransactionHeld = noOfTransactionHeld;
	}
	public boolean withDraw(double amount){
		return true;
		
	}
	public boolean deposit(double amount){
		return true;
	}
}
