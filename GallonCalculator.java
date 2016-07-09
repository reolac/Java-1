/*
	Program Title:	Gallon Calculator
	Author:			Michael Smith
	Created:		16/10/2013
	Version:		1.0
*/

import java.util.Scanner; // calls for scanners to be able to be created

	public class GallonCalculator
	{
		public static void main (String[]args)
			{
			Scanner in = new Scanner(System.in); // creates a new scanner which looks for system(keyboard) input
	
			System.out.print("Enter gallons in  tank :> ");	// prints a prompt for the user ":>" indicating that the user has to input something
			double gallons = in.nextDouble(); // assigns the result of the number inputted by the user to the double literal 'gallons'
	
			System.out.print("Enter miles per gallon :> ");	
			double miles = in.nextDouble(); // assigns the result of the number inputted by the user to the double literal 'miles'
	
			System.out.print("Enter price per gallon :> ");	
			double price = in.nextDouble(); // assigns the result of the number inputted by the user to the double literal 'price'
	
			System.out.println(" "); // new line
			System.out.print("The car can travel " );	
			System.out.print(gallons * miles); // multiplies the gallons (inputted by the user) * miles (inputted by the user) together, both of these literals being the result of what the users put
			System.out.print(" miles."); // the result of these set of lines creates a line consisting of "The car can travel" (gallons * miles) miles.
	
			System.out.println(" ");	
			double result = (100 / miles) * price;			
			System.out.printf("The cost per 100 miles is %.2f", result); // divides 100 by the amount of miles inputted by the user then times it by the price inputted by the user.
			System.out.print(".");
			
			}
	}