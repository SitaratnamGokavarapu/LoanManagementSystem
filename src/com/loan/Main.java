package com.loan;

public class Main {

	public static void main(String[] args) {
		LoanServices ls=new LoanServices();
		Customer c=new Customer(ls.customerName(),ls.customerAge(),ls.customerBalance(),ls.phoneNumber(),ls.email(),ls.address_city(),ls.address_state(),ls.address_country(),ls.pincode(),ls.panNumber());
		
		String type=ls.loanType();
		double amt=ls.loanAmount();
		int dur=ls.loanDuration();
		
		Loan loan=null;
		
		switch(type) {
		case "Personal": loan=new PersonalLoan(amt,dur);break;
		case "Home": loan=new HomeLoan(amt,dur);break;
		case "Gold": loan=new GoldLoan(amt,dur);break;
		}
		
		if(loan.checkEligibility(c)) {
			System.out.println("Approved for"+c.name);
			System.out.println("EMI for given duration is : "+loan.calculateEMI());
		}else{
			System.out.println("Rejected for "+c.name);
		}
	}

}
