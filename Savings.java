package org;

import javax.persistence.Entity;

@Entity
public class Savings extends BankAccount {


	private double maxAmntCanBeTransferred = 500000;
	private int maxNoofTransaction = 7;
	private double amntTransferred;
	private double noOfTransactionHeld;
	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Savings(long accNo, String accHolder, String address, long phoneNo, String mailid, double balance) {
		super(accNo, accHolder, address, phoneNo, mailid, balance);
		// TODO Auto-generated constructor stub
	}
	public Savings(long accNo, String accHolder, String address, long phoneNo, String mailid, double balance,
			double maxAmntCanBeTransferred, int maxNoofTransaction, double amntTransferred,
			double noOfTransactionHeld) {
		super(accNo, accHolder, address, phoneNo, mailid, balance);
		this.maxAmntCanBeTransferred = maxAmntCanBeTransferred;
		this.maxNoofTransaction = maxNoofTransaction;
		this.amntTransferred = amntTransferred;
		this.noOfTransactionHeld = noOfTransactionHeld;
	}
	public double getMaxAmntCanBeTransferred() {
		return maxAmntCanBeTransferred;
	}
	public void setMaxAmntCanBeTransferred(double maxAmntCanBeTransferred) {
		this.maxAmntCanBeTransferred = maxAmntCanBeTransferred;
	}
	public int getMaxNoofTransaction() {
		return maxNoofTransaction;
	}
	public void setMaxNoofTransaction(int maxNoofTransaction) {
		this.maxNoofTransaction = maxNoofTransaction;
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
