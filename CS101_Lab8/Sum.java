 public class Sum 
 {
     /**
      * Constructor.
      * Prints the sum of the numbers 1--10.
      */
     public Sum()
     {
	 int total = 0; // current total  
 
	 // loop through integers 1 to 10 
	 for ( int i = 1; i <= 10; i++ )
	     {
		 // add current integer to running total
		 total = total + i;
	     }
 
	 // print resulting total
	 // note that we use a function to convert the int
	 // total to a String
	 System.out.println( "The sum of the integers 1 - 10 is " 
			     + Integer.toString( total ) ); 
     } // end Sum
 
 
     /**
      * Special main method is run when the program
      * is executed.
      **/
     public static void main( String[] args )
     {
	 new Sum();
 
     } // end main
 } //end Sum