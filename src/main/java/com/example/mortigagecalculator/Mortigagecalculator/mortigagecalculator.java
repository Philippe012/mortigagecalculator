package com.example.mortigagecalculator.mortigagecalculator;

import java.util.Scanner;

public class Mortigage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mortgage Calculator!");

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        calculateMortgage(loanAmount, annualInterestRate, loanTermYears);

        scanner.close();
    }

    public static void calculateMortgage(double loanAmount, double annualInterestRate, int loanTermYears) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int loanTermMonths = loanTermYears * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        double totalPayment = monthlyPayment * loanTermMonths;

        System.out.println("\n--- Mortgage Calculation Result ---");
        System.out.printf("Monthly payment: %.2f\n", monthlyPayment);
        System.out.printf("Total payment: %.2f\n", totalPayment);
    }
}
