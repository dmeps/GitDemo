package Basics;

public class palindrome {

	public static void main(String[] args) {
		String m = "madam";
		String n = "";
		for (int x = m.length() - 1; x >= 0; x--) {
			n = n + m.charAt(x); // reverse the string
		}
		System.out.println(n);
		if (m.equals(n)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
