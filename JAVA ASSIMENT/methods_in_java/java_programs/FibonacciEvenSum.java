//This programe looks for the sum of even valued tersm by considering the terms in the Fibonacci seqence//

package java_programs;
public class FibonacciEvenSum{
	public static void main(String[] args){
		System.out.println("Sum of even-valued terms: " +sumEvenFibonacci(4000000));
	}
	// Method to find the sum of te even number
	public static int sumEvenFibonacci(int limit){
		//initialize variables//
		int sum = 0;
		int a = 1;
		int b = 2;
		// loop to check if 'a' is even//
		while(a <= limit){
			if(a % 2 == 0){
				sum += a;
			}
			int next = a + b;
			a = b;
			b = next;
		}
		// returns the sum//
		return sum;
	}
}