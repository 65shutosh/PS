package java.string;
// This program is only for small binary addition

import java.util.Scanner;

public class BinaryAdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String data1 = scanner.next();
			String data2 = scanner.next();
			int decimalData = binaryToDecimal(data1) + binaryToDecimal(data2);
			System.out.println(decimalToBinary(decimalData));
		}
	}

	public static int binaryToDecimal(String data) {
		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			if (Integer.parseInt(data.charAt(data.length() - (1 + i)) + "") == 1) {
				result += Math.pow(2, i);
			}
		}
		return result;
	}

	public static String decimalToBinary(int number) {
		if (number == 0 || number == 1)
			return number + "";
		return decimalToBinary(number / 2) + decimalToBinary(number % 2);
	}
}
