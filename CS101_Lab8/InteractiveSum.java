import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
// for integer parsing
import java.lang.NumberFormatException;
 
/**
 * InteractiveSum is a simple program that allows a user
 * to interactively sum integers from 1 - n..
 *
 * @author Audrey St. John, Filip Jagodzinski
 **/
 public class InteractiveSum
 {
     /**
      * Constructor.
      **/
     public InteractiveSum() 
     {     
	 // wrap input stream read input from user
	 // you do not need to understand what is going on here
	 // for now, just take it as is
     BufferedReader in = 
	 new BufferedReader( new InputStreamReader( System.in ) );
 
     // prompt the user for input
     System.out.println( "Please enter an integer." ); 
 
     // I/O almost always requires a try/catch
     // block as exceptions may be thrown 
     try 
	 {
	     // try to read a line
	     // this function potentially throws an IOException
	     String userInput = in.readLine(); 
 
	     // attempt to parse the integer entered by the user
       try 
	   {
	       int n = Integer.parseInt( userInput ); 
 
	       // call the sum function with user argument       
	       // and store the result in total
	       int total = sum( n ); 
 
	       // print resulting total
	       System.out.println( "The sum of the integers 1 - " 
				   + Integer.toString( n ) + " is " 
				   + Integer.toString( total ) ); 
	   }
       // catch parsing error, thrown when user did not enter
       // an integer
       catch ( NumberFormatException nfe )
	   {
	       // inform user of error
	       System.out.println( "Error: input must be integer." );
	   }
	 }
     // catch I/O exception
     catch ( IOException ioe )
	 {
	     // tell exception to print its error log
	     ioe.printStackTrace();
	 }
     } 
 
     /**
      * Sums the integers from 1 to n.
      * @return the resulting sum
      **/
     public int sum( int n )
     {
 
	 int total = 0; // current total
 
	 // loop through integers 1 to 10 
	 for ( int i = 1; i <= n; i++ )
	     {
		 // add current integer to running total
		 total = total + i;
	     }
 
	 // return resulting total to caller
	 return total;
     } // end sum
 
     /**
      * Special main method is run when the program
      * is executed.
      **/
     public static void main( String[] args )
     {
	 // create a new instance to start the code
	 new InteractiveSum();
     } // end main
 } //end InteractiveSum