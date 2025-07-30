package _2D_Array;

public class count_hill_and_vally_2210 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 1, 6, 5 };
		int n = arr.length;
		int count = 0;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] == arr[i + 1])
				continue;
			int l = i - 1, r = i + 1;
			while (l != 0) {
				if (arr[i] != arr[l]) {
					break;
				} else
					l--;
			}

			while (r < n) {
				if (arr[i] != arr[r])
					break;
				else
					r++;
			}

			if (arr[i] < arr[l] && arr[i] < arr[r] || arr[i] > arr[l] && arr[i] > arr[r]) {
				count++;
			}
		}
		System.out.println("no of vally and hills are " + count);
	}

}
