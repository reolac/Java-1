import java.util.*;

  /** @author Michael Smith
      @since 9/12/2013
      @version Version 2
  */ 

public class SimpleStatCalc
{

  /** Calls for methods to work out the different calculations of an array of random numbers
      @param numbers the array is stored via the generatenumber method
      @param sumtotal the sum of the numbers in the array is stored via the sum method
      @param meantotal the mean of the numbers in the array is stored via the mean method
      @param modetotal the mode(s) of the numbers in the array array are stored via the mode method
      @param mediantotal the median of the numbers in the array is stored via the median method
  */
  
  public static void main(String[] args)
  {
    System.out.println(title());
    int[] numbers = generatenumber(10);
    int sumtotal = sum(numbers);
    double meantotal = mean(sumtotal);    
    int modetotal = (mode(numbers));
    double mediantotal = median(numbers);
    System.out.println(end());    
  }
  
  /** Displays the program title     
  */
  
  public static String title()
  {  
    String welcome = "";
    System.out.println("****************");
    System.out.println("Stats Calculator");
    System.out.println("****************");
    return welcome;
  } 
  
  /** Generates 10 random numbers and stores them in array indexed 0 - 9, numbers are then sorted numerically in asecending order then printed on screen
      @param randomnumbers the randomnumbers generated are stored within this array which is called back at the end of the method
      @for using param i to count, in this case it counts through each index of the array and performs Math.random
      @return returns the sorted randomly generated numbers in an array back to the mainmethod and stores them in numbers
  */
  
  public static int[] generatenumber(int numberofinputs)
  {
    int[] randomnumbers = new int[numberofinputs];
    System.out.print("The ten random values are: ");
    for (int i = 0; i <= 9; i++)
    {
    randomnumbers[i] = (int)(Math.random()*9);
    }    
    Arrays.sort(randomnumbers);
    System.out.print(randomnumbers[0] + ", ");
    System.out.print(randomnumbers[1] + ", ");
    System.out.print(randomnumbers[2] + ", ");
    System.out.print(randomnumbers[3] + ", ");
    System.out.print(randomnumbers[4] + ", ");
    System.out.print(randomnumbers[5] + ", ");
    System.out.print(randomnumbers[6] + ", ");
    System.out.print(randomnumbers[7] + ", ");
    System.out.print(randomnumbers[8] + ", ");
    System.out.print(randomnumbers[9]);
    
           
    System.out.println("\n");
    return randomnumbers;
  }
  
  /** Calculates the sum of the numbers in the array
      @for counts through each index in the array and adds them to the total
      @param total the total sum of the numbers in the array
      @return returns the total sum to main method 
  */

  public static int sum(int[] values)
  {
    int total = 0;
    for (int i = 0; i < values.length; i++)
    {
      total += values[i];
    }
    System.out.println("Sum = " + total);
    return total;
  }
  
  /** Calculates the mean using the sum which is stored in mainmethod
      @param sum is the sum called from the main method converted from an int to a double
      @return returns the mean total to the main method
  */
  
  public static double mean(int values) 
  {
    double sum = values;
    double total = 0;
    System.out.println("Mean = " + sum/10);
    return total;
  } 
  
  /** Calculates the mode(s) using the array stored in mainmethod
      @param List new ArrayList used to store modes if there are more than one
      @param a new array
      @for copies the values of the original array into this new array
      @for this finds the maximum number of times a single number was recorded and stores the largest recorded number of how many times it was repeatedto max
      @for this loop adds any number which is repeated the same amount of times as max and adds them to the ArrayList
      @for the ArrayList is converted back into an array which holds the modes of the original array which is held on index 0, this loop only triggers once and prints out the first mode
      @break we only want the first mode to print so we break the loop, if there are additional modes are they dealt with using the other loop
      @for any additional modes will be on indexes 1 - 9, this loop prints any other modes which might be in the array and seperating them in "and"
      @return returns the maximum amount of modes back to mainmethod      
  */
  
  public static int mode(int[] values) 
  {
    ArrayList<Integer> List = new ArrayList<Integer> (); //new array list
    int [] myValues = new int [10]; // new array

    for (int i=0; i<values.length; i++)
    { 
      myValues [values[i]]++;   
    }

    int max = 0;

    for (int i=0; i<myValues.length; i++)
    {
      if (myValues[i]>max) 
      max = myValues[i];                  
    }

    for (int i=0; i<myValues.length;i++)
    {
      if (myValues[i]==max)
      List.add(i);
    }

    int [] Results = new int [List.size()];

    System.out.print("Mode = ");
    
    for (int i=0; i<List.size(); )
    {
      Results[i] = List.get(i);     
      System.out.print(Results[0]);
      break;        
    }
     
    for (int i=1; i<List.size(); i++)
    { 
      if (List.size() > 1)
      Results[i] = List.get(i);
      System.out.print(" and " + Results[i]);
    }
           
    return max;  
  }
  
  /** Calculates the median of the numbers stored in the array
      @param middle finds the middle value of the array which is array [4]
      @println prints the median by calculating the middle value of the array [4] and the array of the middle value -1[3] and divides it by 2
      @return returns the mean total to the main method since this array is even the number the total can be a decimal so it needs to be stored in double
  */  
  
  public static double median(int[] values) 
  {
    int middle = 10/2;
    double total = 0;
    System.out.println(" ");
    System.out.println("Median = " + ((values[middle-1]) + values[middle]) / 2.0);
    return total;
  }

  /** Displays that it is the end of the program     
  */
    
  public static String end()
  {  
    String terminating = "";
    System.out.println(" ");
    System.out.println("Terminating...");
    return terminating;
  }   
}
  