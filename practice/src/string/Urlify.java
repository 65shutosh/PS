package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Urlify {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());
		while (tasks-- > 0) {
			String data = br.readLine().trim();
			int stringLenth = Integer.parseInt(br.readLine());
			String answer = "";
			for (int i = 0; i < data.length(); i++) {
				if (data.charAt(i) == ' ')
					answer += "%20";
				else
					answer += data.charAt(i);
			}
			System.out.println(answer);
		}
	}
}
