package string;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestWindow {
	public static void main(String[] args) {
		long startTimem = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String data1 = scanner.next();
			String data2 = scanner.next();
			char[] data2temp = data2.toCharArray();
			Arrays.sort(data2temp);
			data2 = new String(data2temp);
			long startTime = System.currentTimeMillis();
			String[] data = findAllSubstrings(data1, data2.length() - 1);
			long endTime = System.currentTimeMillis();
			System.out.println(endTime - startTime);
			String window = "";
			boolean success = false;
			for (int i = 0; i < data.length; i++) {
				String answer = data[i];
				char[] datatemp = data[i].toCharArray();
				Arrays.sort(datatemp);
				data[i] = new String(datatemp);

				for (int j = 0, k = 0; j < data[i].length(); j++) {
					if (data[i].charAt(j) == data2.charAt(k))
						k++;
					if (k == data2.length()) {
						success = true;
						break;
					}
				}
				if (success) {
					System.out.println(answer);
					break;
				}

			}
			if (!success) {
				System.out.println(-1);
			}
		}
		long endTimem = System.currentTimeMillis();
		System.out.println(endTimem - startTimem);
	}

	private static String[] findAllSubstrings(String data1, int len) {
		String[] data = new String[((data1.length() - len) * (data1.length() - len + 1)) / 2];
		int k = 0;
		for (int i = 0; i < data1.length(); i++) {
			for (int j = i + 1; j <= data1.length(); j++) {
				if (data1.substring(i, j).length() > len)
					data[k++] = data1.substring(i, j);
			}
		}
		return sortStringArrayWithLength(data);
	}

	private static String[] sortStringArrayWithLength(String[] data) {
		Arrays.sort(data, (x, y) -> Integer.compare(x.length(), y.length()));
		return data;
	}
}
