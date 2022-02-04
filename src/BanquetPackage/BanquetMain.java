package BanquetPackage;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banquet banquet = new Banquet();

		int fixedBaseCost = 1500;
		int minimumFoodCost = 1000;
        boolean isValidEntry = true;
        int guestMaxCapacity = 500;
        int guestMinCapacity = 20;
        
		// TOTAL BASE COST
		while (isValidEntry) {
			System.out.println("\nEnter base cost");
			banquet.baseCost = sc.nextDouble();
			if (banquet.baseCost < fixedBaseCost) {
				System.out.println("Minimum base cost is $1500");
				break;
			}
			System.out.println("Enter food cost");
			banquet.foodCost = sc.nextDouble();
			if (banquet.foodCost < minimumFoodCost) {
				System.out.println("Minimum food cost is $1000");
				break;
			}

			System.out.println("Enter beverage cost");
			banquet.beverageCost = sc.nextDouble();
			System.out.println("Enter the desired Tip amount");
			banquet.tip = sc.nextDouble();
			double setCalculateBaseCost = banquet.calculateBaseCost(banquet.baseCost, banquet.foodCost,
					banquet.beverageCost, banquet.tip);

			// TOTAL TAX ON BASE COST
			System.out.println("Enter total tax in decimal number, example 13% is 0.13: ");
			banquet.taxPercent = sc.nextDouble();
			double setTaxPercentage = banquet.calculatetax(banquet.taxPercent);

			// TOTAL SERVICE CESS BASED ON NO. OF GUESTS
			System.out.println("Enter no. of guests present: ");
			banquet.noOfGuests = sc.nextDouble();
			if (banquet.noOfGuests < guestMinCapacity) {
				System.out.println("Minimum Capacity is 20 people"); // ANY NEGATIVE NUMBER IS NOT APPLICABLE
			    break;
			} else if (banquet.noOfGuests > guestMaxCapacity){
			    System.out.println("MAX CAPACITY IS 500"); // Banquet Hall Max Capacity is 500
			    break; 
			} else {
			double setNoOfGuests = banquet.calculateCess(banquet.noOfGuests);
			double setTotalCost = banquet.calculateTotalCost();
			
			System.out.println("\nNo of guests: " + banquet.noOfGuests);
			System.out.println("Total Base cost: " + setCalculateBaseCost);
			System.out.println("Service cess: " + setNoOfGuests);
			System.out.println("Tax applied: " + banquet.taxPercent);
			System.out.println("Total tax on Base Cost: " + setTaxPercentage);
			System.out.println("Total Cost is: " + setTotalCost);
			System.out.println("Have a nice day");
			break;
			}
		}
	}

}
