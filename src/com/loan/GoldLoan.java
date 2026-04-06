package com.loan;

public class GoldLoan extends Loan{

	public GoldLoan(double amount, int duration) {
		super(amount, duration);
	}

	@Override
	public double getRate() {
		return 10.0;
	}

	@Override
	public boolean checkEligibility(Customer c) {
		return c.balance>=20000 && amount<=1000000;
	}

}
