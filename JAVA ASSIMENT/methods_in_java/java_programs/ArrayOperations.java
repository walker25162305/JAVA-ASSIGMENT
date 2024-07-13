//This programe gets the sum of all elemnts of a array by using scanner to make the user to enter the inputs//
package java_programs;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // Step a: Input 15 integer values
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // Step a: Print the values stored in the array
        System.out.println("Values stored in the array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Step b: Check if a user-entered number is present in the array
        System.out.println("Enter a number to search:");
        int numberToSearch = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array.");
        }

        // Step c: Create another array and copy elements in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Elements of the new array in reverse order:");
        for (int value : reversedArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Step d: Get the sum and product of all elements
        int sum = 0;
        long product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
