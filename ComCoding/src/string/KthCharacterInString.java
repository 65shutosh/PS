package string;

import java.io.IOException;
import java.util.Scanner;

public class KthCharacterInString {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			scanner.nextLine();
			int m = scanner.nextInt();
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			String binaryData = DecimalToBinary(m);
			while (n-- > 0) {
				String tempData = "";
				for (int j = 0; j < binaryData.length(); j++) {
					if (binaryData.charAt(j) == '0')
						tempData += "01";
					else
						tempData += "10";
				}
				binaryData = tempData;
				// System.out.println(binaryData + " iteration no . " + n);
			}

			System.out.println(binaryData.charAt(k));
		}

	}

	public static String DecimalToBinary(int number) {
		if (number == 0 || number == 1)
			return "" + number;
		return DecimalToBinary(number / 2) + DecimalToBinary(number % 2);
	}
}
