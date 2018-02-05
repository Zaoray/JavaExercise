public class PrimeNumberMethod {
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_LINE = 10; // Display 10 per line
		int count = 0;
		int number = 2;

		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count ++;
				if (count % NUMBER_OF_PRIMES_LINE == 0) {
					System.out.printf("%-5s\n", number);
				}
				else {
					System.out.printf("%-5s", number);
				}
			}

			number++;
		}
	}

	public static boolean isPrime(int number) {		
		/*double division = number / 2;
		for (int k = 2; k < division; k++) {  // becase k is compare with division, k casting to double
			if (number % k == 0) {
				return false;
			}
			
		}*/
		for (int division = 2; division <= number / 2; division++) {
			if (number % division == 0) {
				return false;
			}
		}
		return true;		
	}
}