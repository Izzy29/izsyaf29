/*****************************************************************/
/* This program is to create card numbers based on 4-digit number*/
/* Name: Muhamad Izrin Syafiq bin Ahmad Jalil                    */
/* Matric Number: 206845                                         */
/* Assignment 2 : Question 2                                     */
/* Course: SSK3100 Computer Programming I                        */
/* Date: 18 Nov 2020                                             */
/*****************************************************************/
import java.util.Scanner;
public class CreditCardNumberBasedOnFourDigit {//open class

	public static void main(String[] args) {//open public
		Scanner input = new Scanner(System.in);
		
		//Declaring variable into int data type
		int number, digit1, digit2, digit3, digit4, remainder, originalNumber, newNumber;
		
		//Prompt a user to enter 4 different digits
		
		System.out.print("Enter 4-digit number : ");
		originalNumber = input.nextInt();
		number = originalNumber;
		
		//This process is to seperate each digit to different variable
		digit1 = number/1000;
		number = number%1000;
		digit2 = number/100;
		number = number%100;
		digit3 = number/10;
		digit4 = number%10;
		
		//To calculate remainder 
		remainder = (digit1 + digit2 + digit3 + digit4) % 2;
		
		System.out.println("");
		
		//Determining either odd/even based on remainder and display required result
		if (remainder == 1) {
			//odd number
			newNumber = (originalNumber*10)+1;
			
		} else {
			//even number
			newNumber = (originalNumber*10);
		}
		
		input.close();
		
		System.out.println("Original number : "+originalNumber);
		System.out.println("New number : "+newNumber);

	}//close public

}//close class
