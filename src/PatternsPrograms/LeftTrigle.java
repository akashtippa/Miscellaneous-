package PatternsPrograms;

 
// Java code to demonstrate star patterns
public class LeftTrigle
{
	
    // Function to demonstrate printing pattern
    public static void main(String[] args) 
    {
        int i, j, n = 5;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop    
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
        }
   }
 
    // Driver Function
//    public static void main(String args[])
//    {
//        
//        printStars(n);
//    }
}
