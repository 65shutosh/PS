package java.string;

import java.util.Arrays;
import java.util.Scanner;

public class KAnagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			int k = scanner.nextInt();

			if (isKAnagram(s1, s2, k)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	private static boolean isKAnagram(String s1, String s2, int k) {
		if (s1.length() != s2.length())
			return false;
		char[] sc1 = s1.toCharArray();
		char[] sc2 = s2.toCharArray();
		Arrays.sort(sc1);
		Arrays.sort(sc2);
		int result = 0;
		int[] check = new int[26];
		for (int i = 0; i < sc1.length; i++) {
			check[sc1[i] - 97] += 1;
			check[sc2[i] - 97] -= 1;
		}
		for (int i = 0; i < 26; i++) {
			result += Math.abs(check[i]);
		}
		System.out.println(result);
		if (result/2 > k)
			return false;
		else
			return true;
	}
}
