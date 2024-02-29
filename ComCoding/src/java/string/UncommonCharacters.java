package java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UncommonCharacters {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());

		while (tasks-- > 0) {
			String firstString = br.readLine();
			String secondString = br.readLine();
			char[] answer = new char[26];
			int[] check = new int[26];
			Arrays.fill(check, 0);
			for (int i = 0; i < firstString.length(); i++) {
				check[firstString.charAt(i) - 97] = 1;
			}
			for (int i = 0; i < secondString.length(); i++) {
				if (check[secondString.charAt(i) - 97] == 0 || check[secondString.charAt(i) - 97] == 7)
					check[secondString.charAt(i) - 97] = 7;
				else
					check[secondString.charAt(i) - 97] = 11;
			}
			for (int i = 0, j = 0; i < 26; i++) {
				if (check[i] == 1 || check[i] == 7) {
					answer[j++] = (char) (i + 97);
				}
			}
			Arrays.sort(answer);
			System.out.println((new String(answer)).trim());
		}
	}
}