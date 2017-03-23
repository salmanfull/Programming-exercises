import java.util.Scanner;
import java.util.Stack;

public class PerfectString {

	/*
	 * method to check whether the given string is perfect or not.
	 */
	public static boolean perfectString(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if (c == ')' || c == '}' || c == ']') {
				if (!stack.isEmpty() && isMatches(stack.peek(), c))
					stack.pop();
				else
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		else
			return true;
	}

	/*
	 * method to check the matching characters
	 */
	public static boolean isMatches(char c1, char c2) {
		if (c1 == '(' && c2 == ')')
			return true;
		else if (c1 == '{' && c2 == '}')
			return true;
		else if (c1 == '[' && c2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter some string : ");
		String s = in.nextLine();
		if (perfectString(s))
			System.out.println("It is a perfect string");
		else
			System.out.println("It is not a perfect string");
	}

}
