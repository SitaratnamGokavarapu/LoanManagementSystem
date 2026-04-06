package com.loan;

public class PersonalLoan extends Loan {

	public PersonalLoan(double amount, int duration) {
		super(amount, duration);
	}

	@Override
	public double getRate() {
		return 12.5;
	}

	@Override
	public boolean checkEligibility(Customer c) {
		return c.age >= 21 && c.balance >= 50000 && amount <= 500000;
	}

}
