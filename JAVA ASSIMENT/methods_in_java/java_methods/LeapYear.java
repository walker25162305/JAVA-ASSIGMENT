//This programe checks if a year is a leap year based on the user input//
//declare the package//
package java_methods;
// import scanner to read the inputs//
import java.util.Scanner;
//class declaration//
public class LeapYear{
	//calling the methods for leap year//
	public static void main(String[] args){
		LeapYear();
	}
	public static void LeapYear(){
		//input the scanner to read user input//
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		//using if statment to check if if the year is a leap year or not//

		if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)){
			System.out.println("The year you have entered is a leap year.");
		}else{
			System.out.println("The year you hve entered in not a leap year.");

		}
		scanner.close();
	}
}
