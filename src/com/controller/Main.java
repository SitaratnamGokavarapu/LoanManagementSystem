package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.model.*;
import com.service.LoanService;
import com.Factory.LoanCreator;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		//input
		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		
		if(salary<=0) {
			System.out.println("Salary must be positive");
			return;
		}
		
		Customer customer=new Customer(name,salary);
		
		// Loan Input
        System.out.println("\n Select Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Gold Loan");
        System.out.println("3. Personal Loan");
        
        int choice = sc.nextInt();

        System.out.print("Enter Loan Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Duration (months): ");
        int duration = sc.nextInt();
        
        if(amount==0|| duration<=0) {
        	System.out.println("Amount and Duration must be positive!!");
        	return;
        }
        Loan loan=LoanCreator.getLoan(choice, amount, duration);
        if(loan==null) {
        	System.out.println("Invalid Loan Type");
        	return;
        }
        // Process Loan
        LoanService service = new LoanService();
        service.processLoan(loan, customer);
		}catch(InputMismatchException i) {
			System.err.println("*** Invalid input *** Enter in Numbers only ***");
		}catch(Exception e) {
			System.out.println("Something went wrong...!!");
		}finally {
			sc.close();
		}
	}

}
