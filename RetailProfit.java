/*****************************************************************/
/* This program is to find profit based on retail price          */
/*****************************************************************/

import java.util.Scanner;
public class RetailProfit {//open class

	public static void main(String[] args) {//open public
		
		//Create a scanner object
		Scanner input = new Scanner (System.in);
		
		//Declaring price and profit into double data types
		double price, profit;
		
		//Read retail price and store into price variable
		System.out.print("Enter the retail price : RM ");
		price = input.nextDouble();
		
		//This process is to calculate profit based on stored variable
		profit = price * 0.4;//Change the percent whatever you one
		
		//Display profit result
		System.out.println(" ");
		System.out.printf("The amount of profit obtained is RM %1.2f", profit);
		
		input.close();

	}//close public

}//close class
