package Collections;

import java.util.ArrayList;
//List interface accepts duplicate values

public class arrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Dmitry");
		a.add("Epstein");
		a.add(1, "M.");
		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Dmitry"));
		System.out.println(a.contains("M."));
		System.out.println(a.size());
		
		a.remove(2);
		System.out.println(a);
		a.remove("Dmitry");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
