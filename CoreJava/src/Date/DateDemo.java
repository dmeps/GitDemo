package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//full current date
		Date cd = new Date();
		System.out.println(cd); // as object
		System.out.println(cd.toString()); // as string
		
		//formatted date - codes: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y");
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/y h:mm:ss");
		System.out.println(sdf.format(cd));
		System.out.println(sdf1.format(cd));
	}

}
