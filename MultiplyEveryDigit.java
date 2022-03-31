/*****************************************************************/
/* This program is to calculate multiplication all digits        */
/*****************************************************************/
import java.util.Scanner;
public class MultiplyEveryDigit {//open class

	public static void main(String[] args) {//open public
		
		//Create a scanner object
		Scanner input = new Scanner (System.in);
		
		//Declaring number, num1, num2, num3 and multiply into int data types
		int number, num1, num2, num3, multiply;
		
		//Read integer number and store into number variable
		System.out.println("Please enter any integer number between 100 - 999");
		System.out.print("->");
		number = input.nextInt();
		
		//This process is to seperate each number and store into particular variable
		num1 = number/100;
		number = number%100;
		num2 = number/10;
		num3 = number%10;
		
		//This process is to multiply all seperate variable
		multiply = num1 * num2 * num3;
		
		//Display the multiplication result
		System.out.println(" ");
		System.out.printf("Multiplication all number : %d",multiply);
		
		input.close();

	}//close public

}//close class
