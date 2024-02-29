package java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstRepeatedCharacter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());

		while (tasks-- > 0) {
			int[] check = new int[26];
			char answerChar = ' ';
			char[] data = br.readLine().toCharArray();
			for (char c : data) {
				if (check[c - 97] == 1) {
					answerChar = c;
					break;
				}
				check[c - 97] = 1;
			}
			if (answerChar == ' ')
				System.out.println("-1");
			else
				System.out.println(answerChar);
			check = null;
		}
	}
}
