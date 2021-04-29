package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperCase {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(bufferReader.readLine());
		while (tasks-- > 0) {
			boolean first = true;
			char[] data = bufferReader.readLine().toCharArray();
			for (int i = 0; i < data.length; i++) {
				if (first) {
					if (data[i] >= 'a' && data[i] <= 'z')
						data[i] -= 32;
					first = false;
				}
				if (data[i] == ' ')
					first = true;
			}
			System.out.println(new String(data));
		}
	}

}
