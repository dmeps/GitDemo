package Arrays;

public class MinRowMaxCol {

	public static void main(String[] args) {

		int a[][] = { { -22, 1, 5 }, { 8, 57, 48 }, { 12, 4, 0 } };

		int min = a[0][0];
		int max = 0;
		int min_col = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				if (a[x][y] < min) {
					min = a[x][y];
					min_col = y;
				}
			}
		}
//		int s = 0;
		for (int s = 0; s < a[min_col].length; s++) {
//		while (s < a[min_col].length) {
			if (a[s][min_col] > max) {
				max = a[s][min_col];
			}
//			s++;
		}
		System.out.println("max = " + max);
	}
}
