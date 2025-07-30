package _2D_Array;

public class maximum_subarray_53 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, -1, 7, 8 };

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i; j < arr.length; j++) {
				temp += arr[j];
				if (temp > max) {
					max = temp;

				}
			}
		}
		System.out.println("largest sum = " + max);

//******************************************* OR *****************************************************************************************************************************

		int maxsum = arr[0];
		int currmax = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currmax = Math.max(arr[i], currmax + arr[i]);
			maxsum = Math.max(maxsum, currmax);
		}
		System.out.println("largest sum = " + maxsum);
	}

}
