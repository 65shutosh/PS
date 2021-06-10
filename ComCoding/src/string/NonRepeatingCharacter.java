package string;

import java.util.Scanner;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			int dataLength = scanner.nextInt();
			String data = scanner.next();
			char answer = ' ';
			int[] check = new int[26];

			for (int i = 0; i < dataLength; i++) {
				check[data.charAt(i) - 97] += 1;
			}

			for (int i = 0; i < dataLength; i++) {
				if (check[data.charAt(i) - 97] == 1) {
					answer = data.charAt(i);
					break;
				}
			}
			if (answer == ' ')
				System.out.println(-1);
			else
				System.out.println(answer);
		}
	}
}
