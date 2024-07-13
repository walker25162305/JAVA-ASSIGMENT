//This programe interacts with integers to check for the prime number//
package java_programs;
// Method for checking if a number is prime//
public class PrimeNumber{
	public static boolean isPrime(int number){
		if(number <= 1){
			return false;
		}
		if (number ==2 || number ==3){
			return true;
		}
		if (number % 2 ==0 || number % 3 == 0){
			return false;
		}
		int sqrtNum =(int) Math.sqrt(number) +1;
		for (int i=5; i < sqrtNum; i += 6){
			if (number % i == 0 || number % (i + 2)==0){
				return false;
			}
		}
		return true;
	}
	// main method to display prime numbers from 1 to 500//
	public static void main(String[] args){
		System.out.println("Prime numbers between 1 and 500:");
		for (int i = 1; i <= 500; i++){
			if (isPrime(i)){
				System.out.print(i + "");
			}
		}
		System.out.println();
	}
}
