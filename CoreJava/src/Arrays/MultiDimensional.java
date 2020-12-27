package Arrays;

public class MultiDimensional {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		a[0][0] = 22;
		a[0][1] = 64;
		a[1][0] = 8;
		a[1][1] = 48;
		a[2][0] = 12;
		a[2][1] = 54;

		// alt
//		int a[][] = {{1, 3}, {5, 7}, {9, 11}};

		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				System.out.println(a[x][y]);
			}
		}
	}

}
