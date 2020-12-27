package Basics;

public class Pyramids {

	public static void main(String[] args) {
		int a = 1;
		for (int x = 0; x < 4; x++) {
			for (int y = 1; y <= 4-x; y++) {
				System.out.print(a + "\t"); //tab
				a++;
			}
			System.out.println("");
		}
		
		System.out.println("__________________");
		
		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println("");
		}
		
		System.out.println("__________________");

		for (int x = 1; x < 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("__________________");
		
		int z = 1;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(z * 3 + "\t");
				z++;
			}
			System.out.println("");
		}
	}
}
