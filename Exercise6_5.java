import java.util.Scanner;

public class Exercise6_5 {
	public static void main(String[] args) {
		final int NUMBER = 10;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten numbers: ");
		int[] number1 = new int[NUMBER];
		//int[] number2 = new int[NUMBER];
		int i, j;

		for (i = 0; i < NUMBER; i++) {
			number1[i] = input.nextInt();
		}

		for (i = 0; i < NUMBER; i++) {
			for (j = 0; j < i; j++) {
				if (number1[j] == number1[i])
					break;
			}

			if (j == i)
				System.out.print(number1[i] + " ");
		}
	System.out.println();
	}
}