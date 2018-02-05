//import java.util.Scanner;

public class Exercise4_26 {
	public static void main(String[] args) {
		final long I = 10000;
		double e = 1.0;
		double item = 1;
		for (int i = 1; i <= 100000; i++) {
      		item = item / i;
      		e += item;
		/*for (int i = 1; i <= I; i++) {
			item = item * i;
			double decimal = 1.0 / item;
			e += decimal;
		}*/ 
		}
		System.out.println("e is " + e);
	}
}