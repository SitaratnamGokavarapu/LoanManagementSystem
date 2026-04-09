package com.service;

import com.model.Customer;
public interface LoanOperations {
	double getRate();
	double calculateEMI();
	boolean checkEligibility(Customer customer);

}
