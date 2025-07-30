package sring_in_java;

public class remove_consicutive_character {

	public static void main(String[] args) {
		String s = "aabaa";

		StringBuilder ans = new StringBuilder();
		ans.append(s.charAt(0)); // first char add karo

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				ans.append(s.charAt(i)); // efficient append
			}
		}
		System.out.println("String without consicutive is : " + ans);
	}

}
