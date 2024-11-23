import java.util.Scanner;

public class IT24104385Lab5Q3 {
	public static void main(String[] args) {
	
	// Declare and Initialize Constants
	final double ROOM_CHARGE_PER_DAY = 48000.00;
	final double DISCOUNT_3_TO_4_DAYS = 0.1;
	final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
	
	// Declare the variables
	int startDate , endDate , numberOfDaysReserved;
	double totalAmountBeforeDiscount , discountAmount ,totalAmountToBePaid;
	
	// Declate amd Initialise variables
	double discountRate = 0;
	
	// Create a Scanner oject to read input
	Scanner input = new Scanner(System.in);
	
	//Promt user for start date
	System.out.print("Enter Star date (1-31):");
	startDate = input.nextInt();
	
	// Prompt user for end date
	System.out.print("Enter End date (1-31):");
	endDate = input.nextInt();
	
	// Validation checks
	if (startDate<1||startDate>31|| endDate<1||endDate>31) {
	
		return; 
	}
	
	if (startDate>= endDate) {
		System.out.println("Error: Start Date must be less than End Date");
		
			return; //exit the programme
	}	
		//Calculate number of days reserved
		numberOfDaysReserved = endDate-startDate;
	
		// check if reservation is elidgible for discountAmount
		if (numberOfDaysReserved>=3 && numberOfDaysReserved <=4){
			discountRate = DISCOUNT_3_TO_4_DAYS;
		}
		else if (numberOfDaysReserved >= 5){
			discountRate = DISCOUNT_5_OR_MORE_DAYS;
		}
		
		//Calculate the total amount to be paid
		totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
		discountAmount = totalAmountBeforeDiscount * discountRate;
		totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
		
		System.out.println();
		System.out.print("ROOM CHARGE PER DAY: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("Numer of Days Reserved:" + numberOfDaysReserved);
		System.out.println("Total Amount to be Paid" + totalAmountToBePaid);

		}
	}