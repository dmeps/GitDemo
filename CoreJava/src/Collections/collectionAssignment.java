package Collections;

import java.util.ArrayList;

public class collectionAssignment {
//print distinct numbers from array or list and count them / print a unique number
	public static void main(String[] args) {

		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4, 6, 5, 7 };

		ArrayList<Integer> s = new ArrayList<Integer>();

		for (int x = 0; x < a.length; x++) {
			int counter = 0;
			if (!s.contains(a[x])) {
				s.add(a[x]);
				for (int w = x; w < a.length; w++) {
					if (a[w] == a[x]) {
						counter++;
					}
				}
				System.out.println(a[x] + " - " + counter);
				if (counter == 1) {
					System.out.println(a[x] + " is a unique number");
				}
			}
		}
	}
}
