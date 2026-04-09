package com.model;

public class GoldLoan extends Loan {

	public GoldLoan(double amount, int duration) {
		super(amount, duration);
	}

	@Override
	public double getRate() {
		return 12.5;
	}

	@Override
	public boolean checkEligibility(Customer customer) {
		return customer.getSalary()>35000;
	}

}
