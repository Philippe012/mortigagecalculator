package com.example.mortigagecalculator.mortigagecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mortgage Calculator!");

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        com.example.mortgagecalculator.MortgageCalculator.calculateMortgage(loanAmount, annualInterestRate, loanTermYears);

        scanner.close();
    }
}
