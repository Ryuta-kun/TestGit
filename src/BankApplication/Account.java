package BankApplication;

import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class Account implements Serializable{
	   private static final long serialVersionUID = 1L;
	   private int number;
	   private String owner;
	   private GregorianCalendar dateOpened;
	   private double balance;
	   
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public GregorianCalendar getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(GregorianCalendar dateOpened) {
		this.dateOpened = dateOpened;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
