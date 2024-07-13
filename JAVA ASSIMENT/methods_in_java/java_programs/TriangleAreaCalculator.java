//This programe looks for the area of a triangle by asking the user to input the base and height then it calculates the area of a triangle//
package java_programs;
//We import the scanner to read the input of the user//

import java.util.Scanner;

public class TriangleAreaCalculator {
    //variable declaration//
    private double base;
    private double height;
    private double area;

    // Method to ask user for base and height of triangle
    public void getBaseAndHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
        scanner.close();
    }

    // Method to compute the area of the triangle
    public void calculateArea() {
        area = 0.5 * base * height;
    }

    // Method to output the calculated area
    public void displayArea() {
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getBaseAndHeight();
        calculator.calculateArea();
        calculator.displayArea();
    }
}
