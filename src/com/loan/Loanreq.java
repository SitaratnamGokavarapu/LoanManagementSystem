package com.loan;

public interface Loanreq {

	// Basic Details
	String customerName();
	int customerAge();
	double customerBalance();
	long phoneNumber();
	String email();
	
	String panNumber();
	boolean isValidPAN(String panNumber);
	
	String address_city();
	String address_state();
	String address_country();
	int pincode();



	// Loan Details

	String loanType();
	double loanAmount();
	int loanDuration();
//	double rateOfInterest();


}
