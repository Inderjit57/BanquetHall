package BanquetPackage;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banquet banquet = new Banquet();

		// TOTAL BASE COST
		System.out.println("Enter base cost");
		banquet.baseCost = sc.nextDouble();
		System.out.println("Enter food cost");
		banquet.foodCost = sc.nextDouble();
		System.out.println("Enter beverage cost");
		banquet.beverageCost = sc.nextDouble();
		System.out.println("Enter the desired Tip amount");
		banquet.tip = sc.nextDouble();
		double setCalculateBaseCost = banquet.calculateBaseCost(banquet.baseCost, banquet.foodCost,
				banquet.beverageCost, banquet.tip);
		System.out.println("Total Base cost: " + setCalculateBaseCost);

		// TOTAL TAX ON BASE COST
		System.out.println("Enter total tax in decimal number, example 13% is 0.13: ");
		banquet.taxPercent = sc.nextDouble();
		double setTaxPercentage = banquet.calculatetax(banquet.taxPercent);
		System.out.println("Total tax on Base Cost: " + setTaxPercentage);

		// TOTAL SERVICE CESS BASED ON NO. OF GUESTS
		for (int x = 0; x <= 2; x++) {
			System.out.println("Enter no. of guests present: ");
			banquet.noOfGuests = sc.nextDouble();
			double setNoOfGuests = banquet.calculateCess(banquet.noOfGuests);
			if (banquet.isValid = false) { // WHEN A NEGATIVE NUMBER OR >500 IS ENTERED, ASK TO PUT VALID ENTRY THREE
											// TIMES
				break;
			} else if (banquet.isValid = true) {
				System.out.println("Service cess based on no. of guests is: " + setNoOfGuests);
				double setTotalCost = banquet.calculateTheTotalCost();
				System.out.println("Total Cost is: " + setTotalCost);
			}
		}

	}

}
