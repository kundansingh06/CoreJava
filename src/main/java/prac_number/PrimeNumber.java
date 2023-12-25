package prac_number;
import java.util.Scanner;
public class PrimeNumber {
	    public static void main(String args[]) {

			/*boolean b = checkPrime(10);
			System.out.println(b);*/

			boolean isPrime = true;
			String primeNumbersFound = "";
			for (int i = 2; i <= 100; i++) {
				isPrime = checkPrime(i);
				if (isPrime) {
					primeNumbersFound = primeNumbersFound + i + " ";
				}
			}
			System.out.println(primeNumbersFound);

		}
	static boolean checkPrime(int num){
			for (int i=2; i<=num/2; i++){
				if (num%i == 0){
					return false;
				}
			}
			return true;
	    }
	}

