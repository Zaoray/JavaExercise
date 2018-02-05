import java.util.Scanner;

public class Exercise5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number = input.nextDouble();

		System.out.println("The square root for 9 is " + SquareRoot.sqrt(number));
	}
}

class SquareRoot {
	public static double sqrt(double n) {
		double nextGuess = 1.0;
		double lastGuess;

		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (n / lastGuess)) * 0.5;
		}while (Math.abs(nextGuess - lastGuess) >= 0.00001); 
	return nextGuess;
	}

}

/*public class Exercise5_22 {
  // Main method
  public static void main(String[] args) {
    System.out.print("Enter a positive number: ");
    java.util.Scanner input = new java.util.Scanner(System.in);
    double number = input.nextDouble();
    
    System.out.println(
      "The square root for 9 is " + SquareRoot.sqrt(number));
  }
}

// This class contains sqrt method
class SquareRoot {
  // Find the square root of the value
  public static double sqrt(double num) {
    double nextGuess = 1.0;
    double lastGuess;

    do {
      lastGuess = nextGuess;
      nextGuess = (lastGuess + (num / lastGuess)) * 0.5;
    } while (Math.abs(nextGuess - lastGuess) >= 0.00001);

    return nextGuess;
  }
}
*/