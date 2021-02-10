package JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream {

	
		//count the number of starting with alphabet A in list
		@Test(enabled=false)
		public void regular() 
		{
			List<String> names =  new ArrayList<String>();
		
			names.add("Abijith");
			names.add("don");
			names.add("Alekya");
			names.add("Adam");
			names.add("Ram");
			int count=0;
		
			for(int i=0; i<names.size(); i++)
			{
				String Actual = names.get(i);
				if(Actual.startsWith("A"))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		
		
		@Test(enabled=false)
		public void StreamFilter()
		{
			List<String> names =  new ArrayList<String>();
			
			names.add("Abijith");
			names.add("don");
			names.add("Alekya");
			names.add("Adam");
			names.add("Ram");
			
			Long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			long d=Stream.of("Abhijith","Don","Alekya","Adam","Ram").filter(s->
			{
				s.startsWith("A");
				return true;
			
			}).count();
			System.out.println(d);
		
			//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				
							
		}
		@Test(enabled=false)
		public void StreaMmap()
		{
			
			List<String> names =  new ArrayList<String>();
			
			names.add("man");
			names.add("don");
			names.add("women");
			names.add("rolen");
			names.add("alen");
			//print names which have last letter as "a" with uppercase
			//Alekya->ALEKAYA
			Stream.of("Abhijith","Don","Alekya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			//print names which have first letter as a with uppercase and sorted
			List<String> name1=Arrays.asList("Azbhijith","Don","Alekya","Adam","Ram");
			name1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//merging two different lists
			Stream<String> newStream = Stream.concat(names.stream(), name1.stream());
			//newStream.sorted().forEach(s->System.out.println(s)); 
			
			boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
			
			
			
		}
		@Test(enabled=false)
		public void StreamCollect()
		{
			List<String> collect = Stream.of("Abhijith","Don","Alekya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(collect.get(0));	
		}
		@Test
		public void numbers()
		{
			List<Integer> values = Arrays.asList(8,2,1,4,5,1,6,9,2,1,5);
			//print unique values
			//sort the array
			//values.stream().distinct().forEach(s->System.out.println(s));
			List<Integer>li = values.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(li.get(2));
			
			
		}
		
		
}
