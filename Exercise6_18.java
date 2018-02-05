import java.util.Scanner;

public class Exercise6_18 {
	public static void main(String[] args) {
		final int NUMBER_LENGTH = 100;
		Scanner input = new Scanner(System.in);
		double[] number = new double[10];

		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			number[i] = input.nextDouble();
		}

		System.out.println("My list is: ");
		printList(number);

		bubbleSort(number);

		System.out.println("After sort list is: ");
		printList(number);		
	}

	public static void bubbleSort(double[] list) {
		boolean changed = false;
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 10 - i; j++) {
				/* maybe occurs ArrayIndexOutOfBoundsException
				if (list[j] > list[j+1]) {
          			//swap list[j] and list[j+1]
          			double temp = list[j];
          			list[j] = list[j + 1];
          			list[j + 1] = temp;
          			changed = true;
        		}
        		*/
				
				if (list[j - 1] > list[j]) {
					double temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
					changed = true;
				}
			}

			if (!changed)
				break;
		}

		
	}

	public static void printList(double[] list) {
		for (int i = 0; i < 10; i++) {
			System.out.print(list[i] + " ");
		}

		System.out.println();
	}
}

