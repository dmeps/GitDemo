package Arrays;

public class OneDimensional {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 2;
		a[1] = 4;
		a[2] = 8;
		
		for(int x = 0; x < a.length; x++) {
			System.out.println(a[x]);
		}
		
		int q[] = {3, 5, 7};
		
		for(int y = 0; y < q.length; y++) {
			System.out.println(q[y]);
		}
	}
}
