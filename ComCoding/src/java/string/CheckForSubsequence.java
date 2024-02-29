package java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForSubsequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());

		while (tasks-- > 0) {
			boolean complete = false;
			String[] data = br.readLine().split(" ");
			for (int j = 0, i = 0; j < data[1].length(); j++) {
				if (data[0].charAt(i) == data[1].charAt(j)) {
					if (i == data[0].length() - 1) {
						complete = true;
						break;
					}
					i++;
				}
			}
			if (complete)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}

}
