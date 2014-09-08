package Main;

// Zayne Johnson 

import java.util.Scanner;
import java.lang.Math;

public class SocialSecurity {
	// User Interface for putting in values

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many years do you plan on working: ");
		
			int yearstowork = input.nextInt();

		System.out.print("What is your expected annual return percentage: ");
		
			double annualreturn = input.nextDouble() * .01;

		System.out.print("How many years will you be retired: ");
		
			int yearsretired = input.nextInt();

		System.out.print("What percentage do you expect to be returned annually: ");
		
			double annualprcnt = input.nextDouble() * .01;

		System.out.print("What is your required income: ");
		
			double incomerequired = input.nextDouble();

		System.out.print("What is your expected monthly SSI Income: ");
		
			double monthlyssi = input.nextDouble();

		// Functions for calculating amounts that needs to be saved

		double total = (incomerequired - monthlyssi)
				*((1 - (1 / (Math.pow((1 + (annualprcnt / 12)),
						(12 * yearsretired))))) / (annualprcnt / 12));
		double monthly = ((annualreturn / 12) * total)
				/ (Math.pow(1 + (annualreturn / 12), 12 * yearstowork) - 1);

		System.out.println("Each month, you need to save $"
				+ Math.round(monthly));
		System.out.println("The total amount you need to save is $"
				+ Math.round((total)));
 
		input.close();
	}
}