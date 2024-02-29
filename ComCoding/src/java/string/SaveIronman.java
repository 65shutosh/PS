package java.string;

import java.util.Scanner;

public class SaveIronman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		scanner.nextLine();
		while (tasks-- > 0) {
			String data = scanner.nextLine();
			data = data.toLowerCase();
			int startIndex = 0;
			int endIndex = data.length() - 1;
			boolean isPalindrome = true;
			while (endIndex > startIndex) {
				if (((((data.charAt(startIndex) - '0' < 10) && (data.charAt(startIndex) - '0' >= 0))
						|| ((data.charAt(startIndex) - 'a' < 26) && (data.charAt(startIndex) - 'a' >= 0)))
						&& ((((data.charAt(endIndex) - '0' < 10) && (data.charAt(endIndex) - '0' >= 0))
								|| ((data.charAt(endIndex)) - 'a' < 26) && (data.charAt(endIndex) - 'a' >= 0))))) {
					if (data.charAt(startIndex) != data.charAt(endIndex)) {
						isPalindrome = false;
						break;
					}
					startIndex++;
					endIndex--;
				} else if (!(((data.charAt(startIndex) - '0' < 10) && (data.charAt(startIndex) - '0' >= 0))
						|| ((data.charAt(startIndex) - 'a' < 26) && (data.charAt(startIndex) - 'a' >= 0)))) {
					startIndex++;
				} else if (!(((data.charAt(endIndex) - '0' < 10) && (data.charAt(endIndex) - '0' >= 0))
						|| ((data.charAt(endIndex)) - 'a' < 26) && (data.charAt(endIndex) - 'a' >= 0))) {
					endIndex--;
				}
			}
			if (isPalindrome)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
