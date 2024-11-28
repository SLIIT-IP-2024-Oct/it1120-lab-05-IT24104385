import java.util.Scanner;
public class IT24104385Lab5Q2 {
public static void main (String[] args){
	
		// Declare variables
		int newMembers;
		
		//Create a Scanner object to read input
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		//Promt user for input
		System.out.print("Enter the number of new members introduced:");
		newMembers = scanner.nextInt();
		
		
		// Determine the prize based on members
		switch (newMembers){
			
			case 0:
			System.out.println();
			System.out.println("No Prize");
			
			break;
			
			case 1:
			System.out.println();
			System.out.println("The prize is: Pen");
			
			break;
			
			case 2:
			System.out.println();
			System.out.println("The prize is: Umbrella");
			
			break;
		
			case 3:
			System.out.println();
			System.out.println("The prize is: Bag");
			
			
			break;
			
			case 4:
			System.out.println();
			System.out.println("The prize is: Travelling Chair");
			
			break;
			
			
			default:
				if (newMembers>=5) {
				System.out.println();
				System.out.println("The prize is: Headphone");
				
				}else {
			// Invalid input (Negative Number)
			
				System.out.println("input must be a number 0 or greater");
				
			}
			break;
		
			
			
		}
	}
}