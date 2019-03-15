//RandomNumber.java
import java.util.Scanner;
import java.security.SecureRandom;

public class RandomNumber
{
   public static void main(String[] args)
   {
      // randomNumbers object will produce secure random numbers
      SecureRandom randomNumbers = new SecureRandom();
	  Scanner input = new Scanner(System.in);

      int frequency1 = 0; // count of 1s rolled
      int frequency2 = 0; // count of 2s rolled
      int frequency3 = 0; // count of 3s rolled
      int frequency4 = 0; // count of 4s rolled
      int frequency5 = 0; // count of 5s rolled
      int frequency6 = 0; // count of 6s rolled
      int frequency7 = 0; // count of 6s rolled
      int frequency8 = 0; // count of 6s rolled
      int frequency9 = 0; // count of 6s rolled
				  
      int number;
	  
      System.out.print("Enter a number ");
      number = input.nextInt(); // obtain user input
     
   
      // tally counts for 6,000,000 rolls of a die
      for (number=1; number <= 6000000; number++) 
      {
         int face = 1+ randomNumbers.nextInt(9); // number from 1 to 6
   
         // use face value 1-6 to determine which counter to increment
         switch (face) 
         {   
            case 1:
               ++frequency1; // increment the 1s counter
		  break; 
       	   case 2:
               ++frequency2; // increment the 2s counter
               break;
            case 3:
               ++frequency3; // increment the 3s counter
               break;
            case 4:
               ++frequency4; // increment the 4s counter
               break;
            case 5:
               ++frequency5; // increment the 5s counter
               break;
            case 6:
               ++frequency6; // increment the 6s counter
               break;
	    case 7:
               ++frequency7; // increment the 7s counter
               break;
	    case 8:
               ++frequency8; // increment the 8s counter
               break;
	    case 9:
               ++frequency9; // increment the 9s counter
               break;
         } 
      } 

      System.out.print("Frequency "); // output headers
      System.out.printf("%d",frequency1, frequency2, frequency3, frequency4,
         frequency5, frequency6);
   }
} // end class 
