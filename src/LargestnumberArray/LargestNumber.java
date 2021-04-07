package LargestnumberArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class LargestNumber {

	@Test(priority = 1)
	public void Largest()
	{
		int arr[]= {80,40,30,70,21,45};
		int max =Arrays.stream(arr).max().getAsInt();
		System.out.println("max number:" +max);
	}
	//@Test
//	public void largest()
//	{
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter number of elements in the array");
//		int n=s.nextInt();
//		
//		int a[] = new int[n];
//		System.out.println("Enter the elements array");
//		for (int i = 0; i < n; i++) 
//		{
//			a[i]=s.nextInt();
//		}
//		int max=a[0];
//		for (int i = 0; i < n; i++) 
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//			}
//			
//		}
//		System.out.println("Max value in the array is: "+max);
//	}
	
	
	 
	@Test(priority = 2)
	public void minmaxvalue()
	{
		//find Max value
		Integer maxValue= Stream.of(1,0,3,5,9,1,5,2,10).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maxnNum is :"+maxValue);
		// find Min value
		Integer minValue= Stream.of(1,0,3,5,9,1,5,2,10).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minNum is :"+minValue);
	}
	@Test(priority = 3)
	public void minmaxChar()
	{
		String maxChrar=Stream.of("H","T","A","R","W").max(Comparator.comparing(String::valueOf)).get();
		System.out.println("maxChar :"+maxChrar);
		
		String minChrar=Stream.of("H","T","A","R","W").min(Comparator.comparing(String::valueOf)).get();
		System.out.println("minChar :"+minChrar);
	}
	//Find Min or Max Object by key
	@Test(priority = 4)
	public void minmaxObjects()
	{
	
		List<Employee> employees= new ArrayList<Employee>();
		employees.add(new Employee(1,"Lokesh",36));
		employees.add(new Employee(1,"Alex",46));
		employees.add(new Employee(1,"Brian",52));
		
		Comparator<Employee> comparator= Comparator.comparing(Employee::getAge);
		
		//get min and max objects
		Employee minObject= employees.stream().min(comparator).get();
		Employee maxObject= employees.stream().max(comparator).get();
		
		System.out.println("minObject" +minObject);
		System.out.println("maxObject" +maxObject);
	}
		
		
	
}
