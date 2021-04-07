package JavaStream;

public class Primenumber {

	public static void main(String[] args) 
	{
		int number=5;
		boolean flag = false;
		for(int i=2; i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(number+ " is a prime number");
		}
		else
		{
			System.out.println(number+ " is not prime number");
		}
		
		
	}
}
