package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStream2 {

	
		@Test
		public void Strtswith()
		{

			List<String> empList = Arrays.asList("Jeff","Bezos","test","QA");
			//find the number(count) of letters starts with "J"
			Long d=empList.stream().filter(s->s.startsWith("J")).count();
			System.out.println(d);
			//print the name is starts with letter "J"
			Stream.of("Jeff","Bezos","test","QA").filter(s->s.startsWith("J")).forEach(s->System.out.println(s));
		 }
		@Test
		public void sort()
		{
			List<String> empList = Arrays.asList("Jeff","Bezos","test","QA");
			List<Integer> numList = Arrays.asList(1,4,2,6,7,8,10,12,35,67);
			
			List<Integer> list = numList.stream().sorted().collect(Collectors.toList());
			System.out.println(list);
			System.out.println(list.get(3));
		}
		@Test
		public void ReverseString()
		{
			String name = "Akash Tippa";
			Stream.of(name).map(s->new StringBuilder(name).reverse()).forEach(s->System.out.println(s));
		}

}
