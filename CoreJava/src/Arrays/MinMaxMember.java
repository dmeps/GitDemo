package Arrays;

public class MinMaxMember {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		a[0][0] = 22;
		a[0][1] = 64;
		a[1][0] = 8;
		a[1][1] = 48;
		a[2][0] = 12;
		a[2][1] = 54;

		int min = a[0][0];
		int max = a[0][0];
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				if (a[x][y] < min) {
					min = a[x][y];
				}
				if (a[x][y] > max) {
					max = a[x][y];
				}
			}
		}
		System.out.println("min = " + min + "; max = " + max);
	}

}
