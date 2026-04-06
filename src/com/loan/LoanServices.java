package com.loan;

import java.util.Scanner;

public class LoanServices implements Loanreq {

	String customerName;
	int customerAge;
	double customerBalance;
	long phoneNumber;
	String email;
	String panNumber;
	String city;
	String state;
	String country;
	int pincode;
	String LoanType;
	double loanAmount;
	int duration;
	double rate;

	Scanner sc = new Scanner(System.in);

	@Override
	public String customerName() {
		System.out.println("Enter Name:");
		return customerName = sc.next();
	}

	@Override
	public int customerAge() {
		System.out.println("Enter Age:");
		return customerAge = sc.nextInt();
	}

	@Override
	public double customerBalance() {
		System.out.println("Enter Balance:");
		return customerBalance = sc.nextDouble();
	}

	@Override
	public long phoneNumber() {
		System.out.println("Enter phoneNumber:");
		return phoneNumber = sc.nextLong();
	}

	@Override
	public String email() {
		System.out.println("Enter Email: ");
		sc.nextLine();
		return email = sc.nextLine();
	}

	@Override
	public String address_city() {
		System.out.println("Enter City:");
		return city = sc.nextLine();
	}

	@Override
	public String address_state() {
		System.out.println("Enter State:");
		return state = sc.nextLine();
	}

	@Override
	public String address_country() {
		System.out.println("Enter Country:");
		return country = sc.nextLine();
	}

	@Override
	public int pincode() {
		System.out.println("Enter Pincode:");
		return pincode = sc.nextInt();
	}

	@Override
	public String panNumber() {
		System.out.println("Enter PAN Number:");
		return panNumber = sc.next();
	}

	@Override
	public boolean isValidPAN(String panNumber) {
		if (panNumber == null || panNumber.isEmpty()) {
			throw new IllegalArgumentException("PAN is required");
		}
		return panNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	// Loan Details
	@Override
	public String loanType() {
		System.out.println("1.Personal Loan");
		System.out.println("2.Gold Loan");
		System.out.println("3.Home Loan");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			return LoanType = "Personal";
		case 2:
			return LoanType = "Gold";
		case 3:
			return LoanType = "Home";
		default:
			throw new IllegalArgumentException("Invalid choice");
		}
	}

	@Override
	public double loanAmount() {
		System.out.println("Enter Amount:");
		return loanAmount = sc.nextDouble();
	}

	@Override
	public int loanDuration() {
		System.out.println("Enter Duration:");
		return duration = sc.nextInt();
	}

}
