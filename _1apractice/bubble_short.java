package _1apractice;

public class bubble_short {
	public static void main(String[] args) {
		int[] arr = { 23, 5, 89, 12, 7, 45, 67, 3, 18, 34 };
		for (int x : arr) {
			System.out.print(x + " ");
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
