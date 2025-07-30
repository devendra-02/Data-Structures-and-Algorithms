package sring_in_java;

public class most_frequent_character {
	public static void main(String[] args) {
		String s = "devendra";

		int[] fre = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			fre[c - 'a']++;
		}

		int frequency = 0;
		char maxchar = 'z' + 1;

		for (int i = 0; i < fre.length; i++) {
			if (fre[i] > frequency) {
				frequency = fre[i];
				maxchar = (char) ('a' + i);
			}
		}
		System.out.println(frequency + " " + maxchar);
	}
}