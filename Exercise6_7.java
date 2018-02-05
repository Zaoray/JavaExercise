public class Exercise6_7 {
	public static void main(String[] args) {
		final int NUM = 100;
		int[] intNumber = new int[NUM];	
		int[] counts = new int[10];
		//int i;

		for (int i = 0; i < NUM; i++) {
			intNumber[i] = (int)(Math.random() * 10);
		}

		for (int i = 0; i < intNumber.length; i++) {			
				counts[intNumber[i]]++;			
		}

		for (int j = 0; j < counts.length; j++) {
			if (counts[j] == 0)
				continue;
			if (counts[j] == 1) {
				System.out.printf("%d is occurence 1 time", j);
				System.out.println();
			}
			else {
				System.out.printf("%d is occurence %d times", j,counts[j]);
				System.out.println();
			}
		}

	}
}