package recursion;

public class PrintingNumbers {
	public static void main(String[] args) {
		printNumber(10);
	}

	private static void printNumber(int i) {
		// TODO Auto-generated method stub
		if (i > 0)
		printNumber(i - 1);

		System.out.println(i);
	}
}
