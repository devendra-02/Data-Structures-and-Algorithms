//package _1apractice;
//
//import java.util.Scanner;
//
//public class in_time_tech {
//
//	public static String solution(String s) {
//
//		int n = s.length();
//		String ans = "";
//		ans += s.charAt(0);
//		for (int i = 1; i < n - 1; i++) {
//
//			char c = s.charAt(i);
//			char cleft = s.charAt(i - 1);
//			char cright = s.charAt(i + 1);
//
//			if (c == 'a' || c == 'A') {
//				if (cleft == 'a' || cleft == 'A' || cright == 'a' || cright == 'A') {
//					ans += c;
//				}
//			}
//
//			else if (c == 'e' || c == 'E') {
//				if (cleft == 'e' || cleft == 'E' || cright == 'e' || cright == 'E') {
//					ans += c;
//				}
//			}
//
//			else if (c == 'i' || c == 'I') {
//				if (cleft == 'i' || cleft == 'I' || cright == 'i' || cright == 'I') {
//					ans += c;
//				}
//			}
//
//			else if (c == 'o' || c == 'O') {
//				if (cleft == 'o' || cleft == 'O' || cright == 'o' || cright == 'O') {
//					ans += c;
//				}
//			}
//
//			else if (c == 'u' || c == 'U') {
//				if (cleft == 'u' || cleft == 'U' || cright == 'u' || cright == 'U') {
//					ans += c;
//				}
//			}
//
//			else {
//				ans += c;
//			}
//			if (i == n - 2) {
//				if (cright == c || cright != 'a' && cright != 'e' && cright != 'i' && cright != 'o' && cright != 'u'
//						&& cright != 'A' && cright != 'E' && cright != 'I' && cright != 'O' && cright != 'U') {
//					ans += cright;
//				}
//			}
//			c != cright &&       HeAlOooWorLdEa
//
//		}
//
//		return ans;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a string ");
//		String s = sc.nextLine();
//
//		String ans = solution(s);
//		System.out.println("ans is: " + ans);
//	}
//
//}

package _1apractice;

import java.util.Scanner;

public class in_time_tech {

	public static boolean isboolean(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';
	}

	public static String solution(String s) {

		int n = s.length();
		String ans = "";
		ans += s.charAt(0);
		for (int i = 1; i < n - 1; i++) {
			char c = s.charAt(i);

			if (isboolean(c)) {
				boolean left = i > 0 && Character.toLowerCase(s.charAt(i - 1)) == Character.toLowerCase(s.charAt(i));
				boolean right = i < n - 1
						&& Character.toLowerCase(s.charAt(i + 1)) == Character.toLowerCase(s.charAt(i));

				if (left || right) {
					ans += c;
				}
			} else {
				ans += c;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string ");
		String s = sc.nextLine();

		String ans = solution(s);
		System.out.println("ans is: " + ans);
	}

}
