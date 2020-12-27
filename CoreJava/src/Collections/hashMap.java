package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Zero");
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, null);
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		Set sm = hm.entrySet();
		System.out.println(sm);
		Iterator it = sm.iterator();
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
