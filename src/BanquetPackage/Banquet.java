package BanquetPackage;

public class Banquet {

	double baseCost;
	double foodCost;
	double beverageCost;
	double tip;
	double totalBaseCost;
	double taxPercent;
	double taxOnBaseCost;
	double cessPercent;
	double noOfGuests;
	double totalCost;

	public Banquet() {
		System.out.println("WELCOME TO THE BANQUET HALL. FILL INFORMATION BELOW");
	}

	double calculateBaseCost(double baseCost, double foodCost, double beverageCost, double tip) {
		this.baseCost = baseCost;
		this.foodCost = foodCost;
		this.beverageCost = beverageCost;
		this.tip = tip;
		totalBaseCost = (baseCost + foodCost + beverageCost + tip);
		return totalBaseCost;
	}

	double calculatetax(double taxPercent) {
		this.taxPercent = taxPercent;
		taxOnBaseCost = (taxPercent * totalBaseCost); // PERCENTAGE IN DECIMAL NUMBERS
		return taxOnBaseCost;
	}

	double calculateCess(double noOfGuests) {
		this.noOfGuests = noOfGuests;

		if (noOfGuests <= 40) {
			cessPercent = 0.04 * totalBaseCost; // CESS IS 4% OF TOTAL BILL BEFORE TAX
		} else if (noOfGuests > 40 && noOfGuests <= 80) {
			cessPercent = 0.08 * totalBaseCost; // CESS IS 8% OF TOTAL BILL BEFORE TAX
		} else if (noOfGuests > 80 && noOfGuests <= 150) {
			cessPercent = 0.1 * totalBaseCost; // CESS IS 10% OF TOTAL BILL BEFORE TAX
		} else if (noOfGuests > 150) {
			cessPercent = 0.125 * totalBaseCost; // CESS IS 12.5% OF TOTAL BILL BEFORE TAX
		}
		return cessPercent;
	}

	double calculateTotalCost() {
		totalCost = (totalBaseCost + taxOnBaseCost + cessPercent);
		return totalCost;
	}
}
