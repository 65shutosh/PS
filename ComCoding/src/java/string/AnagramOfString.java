package java.string;

import java.util.Scanner;

public class AnagramOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			int[] check = new int[26];
			int result = 0;
			for (int i = 0; i < str1.length(); i++) {
				check[str1.charAt(i) - 97] += 1;
			}
			for (int i = 0; i < str2.length(); i++) {
				check[str2.charAt(i) - 97] -= 1;
			}

			for (int i = 0; i < 26; i++) {
				result += Math.abs(check[i]);
			}
			System.out.println(result);
		}
	}
}
