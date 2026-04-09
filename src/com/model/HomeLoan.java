package com.model;


public class HomeLoan extends Loan{

	public HomeLoan(double amount, int duration) {
		super(amount, duration);
	}

	@Override
	public double getRate() {
		return 8.5;
	}

	@Override
	public boolean checkEligibility(Customer customer) {
		return customer.getSalary()>25000;
	}

}