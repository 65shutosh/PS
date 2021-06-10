package string;

import java.util.Scanner;

public class NearestMultipleOfTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String data = scanner.next();
			StringBuilder sb = new StringBuilder();
			sb.append(data);
			if (sb.charAt(sb.length() - 1) - '0' > 5) {
				if (sb.length() == 1)
					data = "10";
				else {
					sb.setCharAt(sb.length() - 2, (char) (sb.charAt(sb.length() - 2) + 1));
					sb.setCharAt(sb.length() - 1, '0');
					data = sb.toString();
				}
			} else {
				sb.setCharAt(sb.length() - 1, '0');
				data = sb.toString();
			}

			System.out.println(data);
		}
	}
}
