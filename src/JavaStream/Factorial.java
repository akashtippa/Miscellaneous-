package JavaStream;

import java.util.stream.IntStream;


public class Factorial {

	public static void main(String[] args) 
		
	{
		int number = 3;
		int fact =IntStream.rangeClosed(2, number).reduce(1,(x, y) -> x*y);
		System.out.println(fact);
	}
}
