// This programe enables the user to input marks for three units (java, networking and maths) and then looks for the average and then displays the marks and average//
package java_methods;
//importing scanners to read user inputs//
import java.util.Scanner;

public class Lecturer{
	public static void main(String[]args){
		//Add scanner//
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter marks for java Programming:");
		double javaMarks = scanner.nextDouble();
		System.out.println("Enter marks for Networking:");
		double networkingMarks = scanner.nextDouble();
		System.out.println("Enter marks for Maths:");
		double mathsMarks = scanner.nextDouble();

		// to compute the avarage//

		double average =(javaMarks + networkingMarks + mathsMarks) / 3;

		System.out.println("The marks for java Programming: "+javaMarks);
		System.out.println("The marks for Networking: " +networkingMarks);
		System.out.println("The marks for maths: "+mathsMarks);
		System.out.println("The average score is: "+average);

		scanner.close();

	}
}