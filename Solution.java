package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution extends BankAccount {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
    double amnt;
    int noOfTransxn;
    
   
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		session.beginTransaction();
        System.out.println("Enter Accno");
        long accNo= Long.valueOf(bf.readLine());
        System.out.println("Enter account holder");
        String accHolder = bf.readLine();
        System.out.println("Enter address ");
        String address = bf.readLine();
        System.out.println("Enter phone number ");
        long phoneNo = Long.valueOf(bf.readLine());
        System.out.println("Enter mailId ");
        String mailId = bf.readLine();
        System.out.println("Enter Balance");
        double balance = Double.valueOf(bf.readLine());
        
        BankAccount ba = new BankAccount (accNo,accHolder,address,phoneNo,mailId,balance);
        session.save(ba);
        session.getTransaction().commit();
    
        session.close();
        sf.close();
        System.out.println("!.savings \n 2.Cuurent");
        int n = Integer.valueOf(bf.readLine());
        switch(n)
        {
        case 1:
        	Savings s1 =Savings new Savings(accNo, accHolder, address, phoneNo, mailid, balance, maxAmntCanBeTransferred, maxNoofTransaction, amntTransferred, noOfTransactionHeld);
        	amnt = Double.valueOf(bf.readLine());
        	noOfTransxn = Integer.valueOf(bf.readLine());
            s1.withDraw(amnt);	
        }
	}
	

}
