public class Main {
	public static void main(String[] args) {
		
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		
		System.out.println(java.util.Arrays.equals(list1, list2));
		System.out.println(java.util.Arrays.equals(list2, list3));

		int[] array1 = {2, 4, 7, 10};
		int[] array2 = {2, 4, 7, 10};
		java.util.Arrays.fill(array1, 5);
		java.util.Arrays.fill(array2, 1, 3, 8);

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}

		System.out.println();


	}
}