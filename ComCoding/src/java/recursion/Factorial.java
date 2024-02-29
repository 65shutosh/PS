package java.recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tasks = scanner.nextInt();
		while (tasks-- > 0) {
			System.out.println(findFactorial(scanner.nextInt()));
		}
	}

	private static double findFactorial(int number) {
		// TODO Auto-generated method stub
		if (number < 1)
			return 1;
		return number * findFactorial(number - 1);
	}

}
