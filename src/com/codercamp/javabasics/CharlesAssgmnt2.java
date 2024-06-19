package com.codercamp.javabasics;

import java.util.Scanner;

public class CharlesAssgmnt2 {

	public static void main(String[] args) {
		
		//public CharlesAssgmnt2() {
	
		Scanner scanner = new Scanner(System.in);
		
		String initialInvestment = userInput(scanner, "Enter Initial Investment");
		String interestRateInput = userInput(scanner, "Enter Interest Rate");
		
		double endOfYearBalance = Integer.parseInt(initialInvestment);
		double interestRate = Double.parseDouble(interestRateInput);
		
		for(int  i = 0; i < 6; i++) {
			endOfYearBalance = output(endOfYearBalance, interestRate, i);
		}
				
		//System.out.println("Enter Initial Investment");
		//String initialInvestment = scanner.nextLine();
		
		//System.out.println("Enter Interest Rate");
		//String interestRate = scanner.nextLine();
		
		scanner.close();
	//}
		
	}
	
	private static double output(double endOfYearBalance, double interestRate, int index) {
		for (int i =0; i < 5; i++); {
			endOfYearBalance = endOfYearBalance * (interestRate + 1.00);
		}
		System.out.println("In " + ((index * 5) + 5) + " years, you should get: " + Math.round(endOfYearBalance));
		return endOfYearBalance;
		
	}
	private static String userInput(Scanner scanner, String message) {
		System.out.println(message);
		String userInput = scanner.nextLine();
		return userInput;
	}
	
}
