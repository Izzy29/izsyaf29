/*****************************************************************/
/* This program is to determine shipping cost based on weight    */
/*****************************************************************/
import java.util.Scanner;
public class CalculateShippingCostBasedOnWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weightInPound;
		
		//Prompt a user to enter weight in pounds
		System.out.print("Please enter parcel weight (pounds) : ");
		weightInPound = input.nextDouble();
		
		//Determine the shipping cost based on weight(pound)
		if (weightInPound > 0 && weightInPound <= 2) 
			System.out.print("Shipping cost : RM2.50");
		
		else if (2 < weightInPound && weightInPound <= 4 ) 
			System.out.print("Shipping cost : RM4.50");
		
		else if (4 < weightInPound && weightInPound <= 10 ) 
			System.out.print("Shipping cost : RM7.50");
		
		else if (10 < weightInPound && weightInPound <= 20 ) 
			System.out.print("Shipping cost : RM10.50");
		
		else 
			System.out.print("This package cannot be shipped");
		
		input.close();

	}

}
