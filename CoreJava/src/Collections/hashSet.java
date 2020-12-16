package Collections;

import java.util.HashSet;
import java.util.Iterator;
//Set interface doesn't accept duplicate values
//No guarantee that the elements are stored in sequential order

public class hashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("America");
		hs.add("Europe");
		hs.add("Asia");
		hs.add("Europe");
		hs.add("Africa");
		hs.add("Asia");
		hs.add("Australia");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.remove("Asia");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		System.out.println("________________");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
