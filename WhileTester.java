public class WhileTester
{
	public static void main (String[] args)
	{
		System.out.println("WhileTester running ...");
		
		System.out.println(" ");
				
		int x = 1;
		System.out.println("Loop to print values 1 to 10 inclusive");
		while(x <= 10) // only executes until x is 10
		{
			System.out.print(x + ", "); // prints x, everytime this is run this value increases by 1
			x = x + 1; // increases x by 1 everytime, making the program only execute 10 times
		}
		
		System.out.println("\n");
		
		x = 0;		
		System.out.println("Loop to print values 0 to -9 inclusive");
		while (x >= -9) // 
		{
      System.out.print(x + ", "); // prints x, everytime this is run this value decreases by 1
      x = x - 1; 
		}
		
		System.out.println("\n");
		
		x = 2; // starting x on the first even value
		System.out.println("Loop to print even values between 1 and 100 inclusive");
		while (x <= 100) // loop stops executing after x reaches 100
		{
      System.out.print(x + ", "); // prints x, value increases by 2 each time
      x = x + 2; // adding an even value to x
		}
		
		System.out.println("\n");
		
		x = 1;
		int count = 0;	// introduce a count variable to handle more complex sequences	
		System.out.println("Loop to print the first 1,000 numbers in the sequence 1, 4, 7, 10, ...");
		while (count <= 1000) // when count reaches 1000 the loop will stop executing
		{
      System.out.print(x + ", "); // first value is 1 so we set x to 1 and print it before adding anything else to x
      x = x + 3; // sequence increases by 3 each time
      count = count + 1; // counts from 1 to 1000, x counts up in 3's, count in 1's so only every 3rd number is added to the sequence but it will only execute 1000 times, so it stores the first 1000 numbers +3 of 1
		}
		
		System.out.println("\n");
		
		x = 1;
		count = 0;
		System.out.println("Loop to print the first 16 numbers in the sequence 1, 2, 4, 8, ...");
		while (count < 16) // only executes 16 times to print 16 numbers
		{
      System.out.print(x + ", ");
      x = x * 2; // doubles the value of x
      count = count + 1;
		}		
		
		System.out.println("\n");
		
		x = 1;
		int y = 1; // new variable to handle this statement
		count = 0;
		System.out.println("Loop to print the first ten factorial numbers");
		System.out.print(x + ", "); // the first factorial is a special case so we print 1 before we start the loop
		while (count < 9) // first factorial already printed, need 9 instead of 10
		{
      y = y + 1; // increases y by 1 every time
      System.out.print(x + ", ");
      x = x * y; // multiplies x by y then the result of is used as x for the next time (1 * 1, then 1 * 2 then 2 * 3 then 6 * 4 then 24 * 5 etc ...)
      count = count + 1;
		}
		
		System.out.println("\n");

		x = 1;
		y = 1;
		int z = 0;
		count = 0;
		System.out.println("Loop to print the first twenty numbers in the Fibonacci sequence");
		while (count < 20)
		{ 
      System.out.print(x + ", "); // 1 is the first and second number in the sequence so we print before we execute the rest of the loop
      x = z + y; // adds up the last two numbers by storing them in different variables
      z = y; // updates z to be the last variable used in y to be used next time (2nd last number), z has to be updated first so we don't lose the last value from y
      y = x; // updates y to be the last variable used in x to be used next time (1st last number)            
      count = count + 1;
		}	
		
		System.out.println("\n");

		int a = 1;		
		x = 0;
		y = 0;
		z = 0;
		count = 0;
		System.out.println("Loop to print the first 10 numbers in the sequence 1, 2, 0, 3, -1, 4, -2 ...");
		while (count < 10)
		{      
      System.out.print(a + ", ");
      y = 1 - 2 * (count % 2); // -1 used so it multiplies from negative to positive using the ground as a way to increment the number
      z = z + 1; // increases the increment by 1 as the difference between each value increases by 1
      a = a + y * z; // uses the current number and add it's to what ever y * z is, since y is a minus it will always change the value from minus to positive and vice versa         
      count = count + 1;
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
