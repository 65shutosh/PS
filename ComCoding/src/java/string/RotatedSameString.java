package java.string;

import java.util.Scanner;

public class RotatedSameString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();

		while (tasks-- > 0) {
			int ans = solution(scanner.next(), scanner.next());
			//scanner.close();
			System.out.println(ans);
		}
	}

	private static int solution(String str1, String str2) {
		boolean success = false;
		if (str1.length() != str2.length())
			return 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0, k = 0; j < str1.length(); j++) {
				if (str1.charAt((i + j) % str1.length()) != str2.charAt(j)) {
					break;
				}
				if (j == str1.length() - 1) {
					success = true;
					break;
				}
			}
			if (success == true)
				break;
		}
		if (success == true)
			return 1;
		else
			return 0;
	}
}
