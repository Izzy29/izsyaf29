/*****************************************************************/
/* This program is to generate random number for random month    */
/*****************************************************************/
import java.util.Scanner;
public class GenerateRandomNumberMonth {//open class

	public static void main(String[] args) {//open public
		
		Scanner input = new Scanner(System.in);
		
		//Declaring months into String
		String monthName;
		
		//The system will randomly choose number within 1-12
		int monthNumber = 1 +(int)(Math.random()*12);
		
		//Determining the months based on random number generated
		switch (monthNumber) {
		
		case 1 : monthName = "January";
			break;
		case 2 : monthName = "February";
			break;
		case 3 : monthName = "March";
			break;
		case 4 : monthName = "April";
			break;
		case 5 : monthName = "May";
			break;
		case 6 : monthName = "Jun";
			break;
		case 7 : monthName = "July";
			break;
		case 8 : monthName = "August";
			break;
		case 9 : monthName = "September";
			break;
		case 10 : monthName = "October";
			break;
		case 11 : monthName = "November";
			break;
		default : monthName = "December";
		
		}
		
		//Display all the result required
		System.out.println(" Month : "+monthNumber);
		System.out.print(" Name : "+monthName);
		
		input.close();
		
	}//close public

}//close class
