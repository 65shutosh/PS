package java.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringSortingInDesc {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int tasks = scanner.nextInt();
	
	while(tasks -- > 0) {
		String data = scanner.next();
		char[] temp =data.toCharArray();
		Arrays.sort(temp);
		StringBuilder sb = new StringBuilder();
		sb.append(temp);
		sb = sb.reverse();
		System.out.println(sb);
	}
}
}
