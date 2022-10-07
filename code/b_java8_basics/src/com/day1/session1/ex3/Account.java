package com.day1.session1.ex3;

public class Account implements Comparable<Account>{
	private int accId;
	private String name;
	private double balance;
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {}
	public Account(int accId, String name, double balance) {
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public int compareTo(Account o) {
		return Integer.compare(this.getAccId(), o.getAccId());
	}
	
	
}
