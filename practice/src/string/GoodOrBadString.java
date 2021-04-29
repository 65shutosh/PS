package string;

import java.util.Scanner;

public class GoodOrBadString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String data = scanner.next();
			StringBuilder sb = new StringBuilder();
			sb.append(data);
			sb = sb.reverse();
			String dataReverse = sb.toString();
			if (goodOrBad(data) && goodOrBad(dataReverse))
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

	public static boolean goodOrBad(String data) {
		boolean bad = false;
		int checkConsonants = 0;
		int checkVowels = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == '?') {
				checkConsonants += (checkConsonants != 0) ? 1 : 0;
				checkVowels += (checkVowels != 0) ? 1 : 0;
				if (checkConsonants > 3 || checkVowels > 5) {
					bad = true;
					break;
				}

			} else if (data.charAt(i) == 'a' || data.charAt(i) == 'i' || data.charAt(i) == 'o' || data.charAt(i) == 'e'
					|| data.charAt(i) == 'u') {
				checkConsonants = 0;
				checkVowels += 1;
				if (checkVowels > 5) {
					bad = true;
					break;
				}
			} else {
				checkVowels = 0;
				checkConsonants += 1;
				if (checkConsonants > 3) {
					bad = true;
					break;
				}
			}
		}
		if (bad == true)
			return false;
		else
			return true;
	}
}
