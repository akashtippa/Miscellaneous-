package StringBuilder;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stringbuilder {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);	
		
		sb.insert(0, "akash");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		System.out.println(strings);
		System.out.println(filtered);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		System.out.println(numbers);
		
		List<String>string1 = Arrays.asList("Akash");
		List<StringBuilder> S = string1.stream().map(word->new StringBuilder(word).reverse()).collect(Collectors.toList());
		System.out.println(S);
		
		List<String>name = Arrays.asList("Akash");
		name.stream().map(i->i.charAt(i.length()-1)).collect(Collectors.toList());
		System.out.println(name);
		
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream"); 
  
    // demonstration of filter method 
    List<String> result = names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList()); 
    System.out.println(result); 
    
    List<Integer> rev = Arrays.asList(123456); 
    Stream<Object> reverse =rev.stream().map(i->Integer.reverse(i));
    System.out.println(reverse);
    
	}
}
