 //rite code to filter duplicate elements from an array and print as a list?

package JavaStream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import StringBuilder.Stringbuilder;

public class DuplicateElements {

	@Test
	public void duplicate()
	{
		List<Integer> duplicates = Arrays.asList(1,2,3,1,4,0,2,1,5,8,6,8,9);
		List<Integer> duplicate = duplicates.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(duplicate);
		  
	}
	@Test
	public void sortString()
	{
		List<String> strings = Arrays.asList("Akash","zpx","soni","Daniel","Alex","Oliver");
		strings.stream().sorted().forEach(s->System.out.println(s));
	}
	@Test
	public void ReverseString()
	{
		String myname="Akash Tippa";
		Stream.of(myname).map(s->new StringBuilder(myname).reverse()).forEach(s->System.out.println(s));
		
		Stream.of("Akash","Logan","Mixel").filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
	}
}
