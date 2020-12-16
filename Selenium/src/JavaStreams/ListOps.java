package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class ListOps {
	// count names that start with "A"
	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Boris");
		names.add("Alex");
		names.add("April");
		names.add("Victor");

		int counter = 0;
		
		for (int x = 0; x < names.size(); x++) {
			String act = names.get(x); //getting items from list
			if (act.startsWith("A")) {
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Boris");
		names.add("Alex");
		names.add("April");
		names.add("Victor");
		
		Long counter = names.stream().filter(s -> s.startsWith("A")).count(); 	//s is variable for storing list values
		System.out.println(counter);									//-> is Lambda expression for list converted into stream
																		//unlike above, list is scanned in parallel, not in sequence
		//stream-compatible collection - alt to the above - that need not be converted to stream
		Long counter1 = Stream.of("Adam", "Boris", "Alex", "April", "Victor").filter(s -> s.startsWith("A")).count();
		System.out.println(counter1);
		//if there are more lines in the action, it can be written like this:
		Long counter2 = Stream.of("Adam", "Boris", "Alex", "April", "Victor").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(counter2);
		
		//print names of certain length
		List<String> names1 = names.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println(names1);
		//or
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		//limit the results of above
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println("Ltd res: " + s));
	}

	@Test
	public void streamMap() {
		//print certain names in uppercase
		Stream.of("Tom", "Boris", "Alex", "April", "Adam").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()).
																						forEach(s -> System.out.println(s));
		//sort the above
		System.out.println("Sorted: ");
		List<String> names = Arrays.asList("Adam", "Boris", "Alex", "April", "Tom");
		names.stream().filter(s -> s.endsWith("m")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
		//merge two lists & sort
		List<String> names1 = Arrays.asList("John", "Paul", "George", "Ringo");
		Stream<String> mergedStream = Streams.concat(names.stream(), names1.stream());
		mergedStream.sorted().forEach(s -> System.out.println(s));
//		List<String> names2 = mergedStream.sorted().collect(Collectors.toList());
//		System.out.println(names2);
		//checking for matches in list
		Stream<String> mergedStream1 = Streams.concat(names.stream(), names1.stream());
		boolean flag = mergedStream1.anyMatch(s -> s.equalsIgnoreCase("john"));
		Assert.assertTrue(flag);
	}

	@Test
	public void streamCollect() {
		System.out.println("***");
		List<String> ls = Stream.of("Tom", "Boris", "Alex", "April", "Adam").filter(s -> s.endsWith("m")).map(s -> s.toUpperCase())
																						.collect(Collectors.toList());
		System.out.println(ls.get(1));
		System.out.println("***");
		//find unique values and sort the results
		List<Integer> digits = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);	
		List<Integer> values = digits.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values);
		//print the 4th element in the list
		System.out.println(values.get(3));
	}
}
