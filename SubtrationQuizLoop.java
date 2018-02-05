import java.util.Scanner;

public class SubtrationQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OFQUESTIONS = 5;
		int correctCount = 0;  // Count the number of correct answers
		int count = 0;  // Count the number of questions
		long startTime = System.currentTimeMillis();
		System.out.println("startTime is " + startTime);
		String output = "";  // output string is initially empty
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OFQUESTIONS) {
			// 1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);

			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int swap = number1;
				number1 = number2;
				number2 = swap;
			}

			// 3. Prompt the student to answer "What is number1 - number2?"
			System.out.print(
				"What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}
			else
				System.out.println("Your answer is wrong.\n" + number1 + " - " +
					number2 + "should be " + (number1 - number2));

			// Increase the count
			count++;

			output = output + "\n" + number1 + " - " + number2 + "=" + answer +
				((number1 - number2 == answer) ? " right" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		System.out.println("endTime is " + endTime);
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount + 
			"\nTest time is " + testTime / 1000 + "seconds\n" + output);
	}
}