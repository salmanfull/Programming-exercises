import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
	public static void printNumbers(int n) {
		if (n < 0) { // if n is -ve
			System.out.println("Invalid input");
			return;
		} else if (n == 0 || n == 1) // if n is 0 or 1
		{
			System.out.println(n);
			return;
		}
		StringBuilder str = new StringBuilder("1");
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			str.append("+" + i);
			sum = sum + i;
			System.out.println(str + " = " + sum);
		}
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n;
		try {
			n = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Only numbers are allowed");
			return;
		} finally {
			in.close();
		}
		printNumbers(n);
	}

}
