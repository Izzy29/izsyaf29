/*****************************************************************/
/* This program is to convert the area from square feet to acres */
/* Name: Muhamad Izrin Syafiq bin Ahmad Jalil                    */
/* Matric Number: 206845                                         */
/* Assignment 1 : Question 1(a)                                  */
/* Course: SSK3100 Computer Programming I                        */
/* Date: 5 Nov 2020                                              */
/*****************************************************************/
import java.util.Scanner;
public class ConvertSquareFeetToAcre {//open class

	public static void main(String[] args) {//open public
		
		//Create a scanner object
		Scanner input = new Scanner (System.in);
		
		//Declaring square feet and number of acre into variables double
		double squareFeet;
		double numberAcre;
		
		//Read square feet area and store squareFeet variable
		System.out.print("Enter Area in Square Feet : ");
		squareFeet = input.nextDouble();
		
		//This is the process to convert square feet area to number of acres based on stored variable
		numberAcre = squareFeet / 43560 ;
		
		//This to print out the value result
		System.out.println(" ");
		System.out.println("Area convert sqft -> acre");
		System.out.printf("%1.2f sqft -> %1.2f acre ",squareFeet,numberAcre);
		
		input.close();
		
	}//close public

}//close class

