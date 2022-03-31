/*****************************************************************/
/* This program is to find population after 5 years              */
/*****************************************************************/
import java.util.Scanner;
public class EstimatePopulationAfter5Years {//open class

	public static void main(String[] args) {//open public
		
		//Create a scanner object
		Scanner input = new Scanner (System.in);
		
		//Declare all variables into int data types
		String x = "first";
		int population, DaytoSec, birth5years, death5years, immigrant5years, population5years;
		
		
		//Read current population and store into population variable
		System.out.print("Please enter current population :");
		population = input.nextInt();
		
		//This process to calculate the population after 5 years
		DaytoSec = 365*24*60*60;//31536000
		birth5years = DaytoSec/7;//4505142
		death5years = DaytoSec/13;//2425846
		immigrant5years = DaytoSec/45;//700800
		population5years = birth5years + immigrant5years - death5years;//2780096
		int newpop = population + population5years;
		
		//Display population after 5 years result
		System.out.println(" ");
		System.out.printf("New population "+x+" years estimated %,d\n",newpop);
		int newpop1 = newpop + population5years;
		x="second";
		System.out.printf("New population "+x+" years estimated %,d \n",newpop1);
		int newpop2 = newpop1 + population5years;
		x="third";
		System.out.printf("New population "+x+" years estimated %,d \n",newpop2);
		int newpop3 = newpop2 + population5years;
		x="fourth";
		System.out.printf("New population "+x+" years estimated %,d \n",newpop3);
		int newpop4 = newpop3 + population5years;
		x="fifth";
		System.out.printf("New population "+x+" years estimated %,d \n",newpop4);
		
		input.close();

	}//close public

}//close class
