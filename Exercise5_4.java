import java.util.Scanner;

public class Exercise5_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int  number = input.nextInt();
		
		reverse(number);
	}

	public static void reverse(int n) {
		String tag = "";
		int ch;
		if (n < 0) {
			tag = "-";
			n = -n;
		}
			
		System.out.print(tag);
		while (n != 0) {
			ch = n % 10;
			System.out.print(ch);
			n = n / 10;
			
		}
		System.out.println();
	}
}
/*public class Exercise5_4 {
  public static void main(String[] args) {
    System.out.print("Enter an integer: ");
    java.util.Scanner input = new java.util.Scanner(System.in);
    int number = input.nextInt();
    reverse(number);
  }

  public static void reverse(int number) {
    while (number != 0) {
      int remainder = number % 10;
      System.out.print(remainder);
      number = number / 10;
    }

    System.out.println();
  }
}*/