import java.util.Scanner;

// CSE 110     : CLASS #75326
// ASSIGNMENT  : ASSIGNMENT 03
// AUTHOR      : DONOVAN MOSES, 1210366219
// DESCRIPTION : AUTOMATIC STOCK TRADER	

public class Assignment03 {
	
	public static void main(String[] args) {
		
		// declare and instantiate a scanner
		Scanner scan = new Scanner(System.in);
				
		// declare and initialize variables
		int currentShares;
		int purchasePrice;
		int marketPrice;
		int availableFunds;
		
		// prompt for and collect inputs
		System.out.println("Current Shares: ");
		currentShares = scan.nextInt();
		System.out.println("Purchase Price: ");
		purchasePrice = scan.nextInt();
		System.out.println("Market Price: ");
		marketPrice = scan.nextInt();
		System.out.println("Available Funds: ");
		availableFunds = scan.nextInt();
		
		// compute required values
		int transactionFee = 10; //10 dollar transaction fee for when the user buys or sells
		int numberOfSharesToBuy = (int) Math.floor((availableFunds - transactionFee) / marketPrice);
		int totalBuyCost = 10 + (marketPrice * numberOfSharesToBuy);
		int perShareBuyValue = (purchasePrice - marketPrice);
		int totalBuyValue = (perShareBuyValue * numberOfSharesToBuy);
		int perShareSellValue = (marketPrice - purchasePrice);
		int totalSellValue = (perShareSellValue * currentShares);
		// display required outputs
		if (totalBuyValue > 10) {
			System.out.println("Buy " + (availableFunds - transactionFee) + " shares");
		}
		
		else if (totalSellValue > 10) {
			System.out.println("Sell " + currentShares + " shares");
		}
		
		else {
			System.out.println("Hold Shares");
		}
	}
	
}
