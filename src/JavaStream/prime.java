package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prime {

	public static void main(String[] args) 
	{
		
		
		List<Integer> primes= Arrays.asList(2,3,5,6,7,25,30);
		primes.stream().filter(prime->prime%2==1).forEach(s->System.out.println(s));
	}
}
