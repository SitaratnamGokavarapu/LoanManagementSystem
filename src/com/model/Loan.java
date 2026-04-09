package com.model;

import com.service.LoanOperations;

public abstract class Loan implements LoanOperations{
	private double amount;
	private int duration;
	
	public Loan(double amount,int duration) {
		this.amount=amount;
		this.duration=duration;
	}
	public double getAmount() {
		return amount;
	}
	
	public double getDuration() {
		return duration;
	}
	
//	public abstract double getRate();
	
	public double calculateEMI() {
		double R=getRate()/(12*100);
		int N=duration;
		
		return (amount * R * Math.pow(1+R, N))/(Math.pow(1+R, N)-1);
	}
}
