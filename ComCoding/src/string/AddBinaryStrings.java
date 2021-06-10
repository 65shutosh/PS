package string;

import java.util.Scanner;

public class AddBinaryStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String firstData = scanner.next();
			String secondData = scanner.next();
			StringBuilder data1 = new StringBuilder(firstData);
			StringBuilder data2 = new StringBuilder(secondData);

			if (firstData.length() > secondData.length())
				fillString(data2, firstData.length() - secondData.length());
			else
				fillString(data1, secondData.length() - firstData.length());

			String answer = "";
			int remainder = 0;
			for (int i = data1.length() - 1; i >= 0; i--) {
				int temp = 0;
				//System.out.println(data1.length() + " " + data2.length());
				if (Integer.parseInt((data1.charAt(i) + "")) + Integer.parseInt(data2.charAt(i) + "")
						+ remainder == 3) {
					temp = 1;
					remainder = 1;
				} else if (Integer.parseInt((data1.charAt(i) + "")) + Integer.parseInt(data2.charAt(i) + "")
						+ remainder == 2) {
					temp = 0;
					remainder = 1;
				} else if (Integer.parseInt((data1.charAt(i) + "")) + Integer.parseInt(data2.charAt(i) + "")
						+ remainder == 1) {
					temp = 1;
					remainder = 0;

				} else if (Integer.parseInt((data1.charAt(i) + "")) + Integer.parseInt(data2.charAt(i) + "")
						+ remainder == 0) {

					temp = 0;
					remainder = 0;
				}
				answer = temp + answer;
				if (i == 0 && remainder == 1) {
					answer = remainder + answer;
				}

			}
			System.out.println(answer);

		}
	}

	public static void fillString(StringBuilder data, int filling) {
		for (int i = 0; i < filling; i++)
			data.insert(0, 0);
	}

}
