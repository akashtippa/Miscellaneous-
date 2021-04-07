package PatternsPrograms;

public class RightTriangle 
{
	public static void main(String[] args) 
	{
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i);j>=0;j--)
			{
				System.out.println(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
