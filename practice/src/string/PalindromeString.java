package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());

		while (tasks-- > 0) {
			boolean palindrome = true;
			int stringLength = Integer.parseInt(br.readLine());
			char[] data = br.readLine().toCharArray();
			for (int i = 0, j = stringLength - 1; i < stringLength / 2; i++, j--) {
				if (data[i] != data[j]) {
					palindrome = false;
					break;
				}
			}
			if (palindrome)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
