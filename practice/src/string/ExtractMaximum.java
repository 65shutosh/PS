package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtractMaximum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tasks = Integer.parseInt(br.readLine());
		while (tasks-- > 0) {
			char[] data = br.readLine().toCharArray();
			List<Integer> finalData = new ArrayList<Integer>();
			for (int i = 0; i < data.length; i++) {
				if (!(data[i] >= '0' && data[i] <= '9')) {
					data[i] = ' ';
				}
			}
			List<String> dataAL = Arrays.asList(new String(data).trim().split(" "));
			for (int i = 0; i < dataAL.size(); i++) {
				if (!dataAL.get(i).equals(""))
					finalData.add(Integer.parseInt(dataAL.get(i)));
			}
			Collections.sort(finalData, Collections.reverseOrder());
			System.out.println(finalData.get(0));
		}
	}
}
