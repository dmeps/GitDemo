package Basics;

public class strings {

	public static void main(String[] args) {
		String x1 = "Dmitry M. Epstein"; // String literal
		String y1 = "Dmitry M. Epstein"; // new object isn't created; y1 points to x1 because the string is present in pool
		String x2 = new String("Dmitry M. Epstein"); // String object of String class
		String y2 = new String("Dmitry M. Epstein"); // new object is created
		
		System.out.println(x1.charAt(13)); //char at index
		System.out.println(y1.indexOf(".")); //index of char
		System.out.println(x2.substring(10)); //from index to the end
		System.out.println(y2.substring(10, 13)); //from index to index (not including)
		System.out.println(x1.concat(" Esq."));
		System.out.println(x2.length());
		
		System.out.println(y2.trim()); //removes trailing spaces
		System.out.println(y1.strip()); //same as above but recommended because it uses the Unicode standard
		
		String arr[] = (x1.split(" ")); //splits according to delimiter
		System.out.println(arr[1]);
		
		System.out.println(y1.replace("t", "T"));
	}
}
