//Write a program that checks if the three numbers inputed by the user are small or large by using if statment to compare//
package java_methods;
//import scanner to read user ingormation/ to get user information//

import java.util.Scanner;
// declaring the class
public class Methods{
	public static void main(String[] args){
		//scanner object to read inputs//
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();
		System.out.println("Enter the third number:");
		int num3 = scanner.nextInt();

		int largest, smallest;

		//Determines the largest number

		if(num1 >= num2 && num1 >= num3){
			largest = num1;
		}else if(num2 >= num1 && num2 >=num3){
			largest = num2;
		}else{
			largest = num3;
		}
		//Determine the smallest number//
		if(num1 <= num2 && num1 <= num3){
			smallest = num1;

		}else if(num2 <= num1 && num2 <=num3){
			smallest = num2;
		}else{
			smallest = num3;
		}
		//Display//
		System.out.println("The smallest number: "+smallest);
		System.out.println("The largest number: "+largest);
		System.out.println(largest+"is your largest and"+smallest+"is your smallest number.");

		scanner.close();
	}
}