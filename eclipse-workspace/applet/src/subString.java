
import java.util.ArrayList;
import java.util.Scanner;

public class subString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Str");
		String s = sc.next();
		String n = "";
		int x = s.length();
		ArrayList<String> li = new ArrayList<>();

		for (int i = 0; i < x; i++) {
			char d = s.charAt(i);
			n = d + "";
			for (int j = (i + 1); j < x; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					li.add(n);
					n = n + s.charAt(j);

				} else {
					n = n + s.charAt(j);
				}
			}

		}
		int index = 0;
		System.out.println(li);
		int longlen = li.get(0).length();
		for (int i = 1; i < li.size(); i++) {
			if (li.get(i).length() > longlen) {
				longlen = li.get(i).length();
				index = i;

			}
		}

		System.out.println(li.get(index));
		System.out.println("Highest size of substring is " + li.get(index).length());

	}

}
