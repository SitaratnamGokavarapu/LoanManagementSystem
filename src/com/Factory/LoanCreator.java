package com.Factory;

import com.model.*;

public class LoanCreator{

    public static Loan getLoan(int choice, double amount, int duration) {

        switch (choice) {
            case 1:
                return new HomeLoan(amount, duration);

            case 2:
                return new GoldLoan(amount, duration);

            default:
                return null;
        }
    }
}