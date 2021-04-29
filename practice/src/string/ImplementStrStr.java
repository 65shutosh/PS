package string;

import java.util.Scanner;

public class ImplementStrStr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();

		while (tasks-- > 0) {
			int ans = solution(scanner.next(), scanner.next());
			// scanner.close();
			System.out.println(ans);
		}
	}

	private static int solution(String str1, String str2) {
		boolean success = false;
		int startIndex =0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0, k = 0; j < str2.length(); j++) {
				if (str1.charAt((i + j) % str1.length()) != str2.charAt(j)) {
					break;
				}
				if (j == str2.length() - 1) {
					success = true;
					startIndex =i;
					break;
				}
			}
			if (success == true)
				break;
		}
		if (success == true)
			return startIndex;
		else
			return -1;
	}
}
