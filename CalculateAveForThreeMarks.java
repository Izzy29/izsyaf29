/*****************************************************************/
/* This program is to find average test mark                     */
/*****************************************************************/
import java.util.Scanner;
public class CalculateAveForThreeMarks {//open class

	public static void main(String[] args) {//open public
		
		//Create a object scanner
		Scanner input = new Scanner (System.in);
		
		//Declaring variable test1, test2, test3 and average into double data type
		double test1, test2, test3, average;
		
		//Read mark test 1 and store into test1 variable
		System.out.print("Please insert test 1 mark :");
		test1 = input.nextDouble();
		
		//Read mark test 2 and store into test2 variable
		System.out.print("Please insert test 2 mark :");
		test2 = input.nextDouble();
		
		//Read mark test 3 and store into test3 variable
		System.out.print("Please insert test 3 mark :");
		test3= input.nextDouble();
		
		//This process will calculate average based on the stored variable
		average = (test1 + test2 + test3)/3;
		
		//To display the average result
		System.out.println(" ");
		System.out.printf("The average of three test mark is %1.2f", average);
		
		input.close();

	}//close public

}//close class
