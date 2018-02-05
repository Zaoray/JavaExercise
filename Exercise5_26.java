public class Exercise5_26 {
	public static void main(String[] args) {
		System.out.println("Print the first 100 palindromic primes: ");

		int count = 1;
		for (int i = 2; true; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				//System.out.printf("%4d", i);
				System.out.print(i + " ");
				
				if (count % 10 == 0) {
					System.out.println();
				}
				if (count == 100) {
					break;
				}

			count ++;
			}			
		}
	}

	public static boolean isPrime(int num) {
		int division;
		for (division = 2; division <= num / 2; division++) {
			if (num % division == 0)
				return false;
		} 
		return true;
	}

	public static int reversal(int num) {
		int result = 0;
		int digits;

		while (num != 0) {
			digits = num % 10;
			result = result * 10 + digits;
			num = num / 10;
		}
		return result;
	}
	public static boolean isPalindrome(int num) {
		return num == reversal(num);
	}
}

