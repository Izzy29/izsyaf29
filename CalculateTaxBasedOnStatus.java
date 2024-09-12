/*****************************************************************/
/* This program is to find determine total tax for each status   */
/*****************************************************************/
import java.util.Scanner;
public class CalculateTaxBasedOnStatus {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Declaring variables
		int status;
		double income, tax=0;
		
		System.out.println("|*******************************|");
		System.out.println("|Status:-                       |\n|"
				+ " Single-0                      |\n|"
				+ " Married Filing Jointly-1      |\n|"
				+ " Married Filing Separately-2   | \n|"
				+ " Head of Household-3           |");
		System.out.println("|*******************************|");
		System.out.println("");
		
		//Prompt a user to enter status
		System.out.print ("Enter status : ");
		status = input.nextInt();
		
		//Prompt a user to enter income
		System.out.print("Enter taxable income : RM");
		income = input.nextDouble();
		
		//Determine tax based on status
		if (status == 0) {
			
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			
		} else if (status == 1) {
			
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
				(income - 208850) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
				(372950 - 208850) * 0.33 + (income - 372950) * 0.35;
			
		} else if (status == 2) {
			
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			
		} else if (status == 3) {
			
			if (income <= 11950)
				tax = income * 0.10;
			else if (income <= 45500)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 117450)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 190200)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
			
		} else {
			
			//Display if status is invalid
			System.out.println("Error : Invalid status");
			System.exit(1);
			
		}
		
		//Display result required
		System.out.println("");
		System.out.printf("Your tax is RM%1.2f",tax);
		
		input.close();
	}

}
