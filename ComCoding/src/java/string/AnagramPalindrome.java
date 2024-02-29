package java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramPalindrome {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());

		while (tasks-- > 0) {
			String data = br.readLine();
			int[] check = new int[26];
			int result = 0;
			for (int i = 0; i < data.length(); i++) {
				check[data.charAt(i) - 97] += 1;
				check[data.charAt(i) - 97] %= 2;
			}

			for (int i = 0; i < 26; i++) {
				result += check[i];
			}

			if (result == 1 || result == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
	}
}
