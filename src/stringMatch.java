import java.util.Scanner;

public class stringMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String one = "";
		String two = "";

		System.out.println("Please enter two strings to compare");
		one = sc.nextLine();
		two = sc.nextLine();
		System.out.println("Count of same two characters is = " + stringMatch(one, two));

	}

	public static int stringMatch(String a, String b) {

		StringBuilder result = new StringBuilder();
		StringBuilder result2 = new StringBuilder();
		int count = 0;
		int c = a.length();
		System.out.println("C=" + c);
		if (c < b.length())
			c = a.length();

		for (int i = 1; i < c; i++) {
			char ch1 = a.charAt(i - 1);
			char a1 = a.charAt(i);

			char ch2 = b.charAt(i - 1);
			char a2 = b.charAt(i);

			String a11 = "" + ch1 + a1;
			String b11 = "" + ch2 + a2;

			System.out.println("a11 and b11 = " + a11 + " " + b11);
			if (a11.equals(b11)) {
				count++;
				System.out.println("Count =" + count);
				a11 = "";
				b11 = "";
			}
		}

		return count;
	}
}
