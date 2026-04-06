package com.loan;

public abstract class Loan {
	
	protected double amount;
	protected int duration;
	
	public Loan(double amount,int duration) {
		this.amount=amount;
		this.duration=duration;
	}
	
	public abstract double getRate();
	public abstract boolean checkEligibility(Customer c);
	
	public double calculateEMI() {
		double R=getRate()/(12*100);
		int N = duration;
		return (amount * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1); 
	}
	
}
