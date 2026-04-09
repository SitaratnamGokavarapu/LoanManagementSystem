package com.model;

public class PersonalLoan extends Loan{
	public PersonalLoan(double amount,int duration) {
		super(amount,duration);
	}

	@Override
	public double getRate() {
		return 10.0;
	}

	@Override
	public boolean checkEligibility(Customer customer) {
		return customer.getSalary() > 40000;
	}
}
