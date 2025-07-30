package _1apractice;

public class reverse_the_sentence {

	public static void main(String[] args) {
		String str = "my name is dev";
		int n = str.length();
		String ans = "";

		int end = n;
		for (int i = n - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				ans += str.substring(i + 1, end) + " ";
				end = i;
			}
		}
		ans += str.substring(0, end);
		System.out.println("reverse sentence is \n \n" + ans);
	}

}
