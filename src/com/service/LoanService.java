package com.service;

import com.model.*;

public class LoanService {
	public void processLoan(Loan loan,Customer customer) {
		if(loan.checkEligibility(customer)) {
			double emi=loan.calculateEMI();
			System.out.println("Loan Approved ...");
            System.out.println("EMI: " + emi);
        } else {
            System.out.println("Loan Rejected ");
		}
	}
}
