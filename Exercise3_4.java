import java.util.Scanner;

public class Exercise3_4 {
	public static void main(String[] args) {
		int randNumber1 = (int)(Math.random() * 100) ;
		int randNumber2 = (int)(Math.random() * 100) ;
		int num = randNumber1 + randNumber2;

		System.out.print("Please enter your guess answer: ");

		Scanner input = new Scanner(System.in);
		int answerNum = input.nextInt();

		System.out.println((answerNum == num) ? "Your guess is right!" : "guess is incorrect");
		System.out.println("randNumber1 is " + randNumber1 );
		System.out.println("randNumber2 is " + randNumber2 );
		System.out.println("answer is " + num );

	}
}