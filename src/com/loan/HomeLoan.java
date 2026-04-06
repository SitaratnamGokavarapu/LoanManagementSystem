package com.loan;

public class HomeLoan extends Loan{

	public HomeLoan(double amount, int duration) {
		super(amount, duration);
	}

	@Override
	public double getRate() {
		return 8.5;
	}

	@Override
	public boolean checkEligibility(Customer c) {
		return c.age>=25 && c.balance>=100000 && amount<=5000000;
	}

}
