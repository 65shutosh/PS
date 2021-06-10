package string;

import java.util.Scanner;

public class MergeTwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String str1 = scanner.next();
			String str2 = scanner.next();
			String result = "";
			int length = 0;
			if (str1.length() > str2.length())
				length = str1.length();
			else
				length = str2.length();
			for (int i = 0; i < length; i++) {
				if (i < str1.length()) {
					result += str1.charAt(i);
				}
				if (i < str2.length()) {
					result += str2.charAt(i);
				}
			}
			System.out.println(result);
		}
	}
}
