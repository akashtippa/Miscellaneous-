package JavaStream;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Prime2 
{
	@Test
	public void prime()
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=scan.nextInt();
		
		
		
		for (int i = 2; i <= n/2; i++) 
		{
			if(n%i==0)
			{
				
				System.out.println(n+ " is prime number");
				break;
			}
			else if(n<=1)
			{
				System.out.println(n+ "is not a prime number");
			}
		}
	}
}
