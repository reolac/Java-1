import java.util.Scanner;

  /** @author Michael Smith
      @since 26/11/2013
      @version Version 3
  */ 

public class GradeClassification
{ 

  /** Calls for methods to classify a grade
      @param mark the mark which the user inputs
  */
  
  public static void main (String[] args)
  {
   System.out.println(title());
   System.out.print(getmark());
   int mark = usemark();
   System.out.println(acheived(mark));   
  }
   
  /** Displays the program title     
  */
  
  public static String title()
  {  
    String welcome = "";
    System.out.println("Grade Classifier");
    System.out.println("****************");
    return welcome;
  } 
  
  /** Prompts the user to enter the exam mark
  */
  
  public static String getmark()
  {
    String get = "";
    System.out.print("Enter exam mark: > ");
    return get;
  }
   
  /** Determines the grade
      @param input the mark entered by the user
      @return input to determine grade
  */
  
  public static int usemark()    
  {
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();     
    System.out.println("");
    return input;    
  }
  
  /** Displays the grade
      @param result the grade from the user
  */ 
    
  public static String acheived (int number)
  {
    int result = number;
    String classification = "";
               
    if (result >= 70)
    {
    System.out.print("Congratulations, you are awarded a Grade A Pass.");
    result = -1;
    }
    
    if (result >= 60)
    {
    System.out.print("Congratulations, you are awarded a Grade B Pass.");
    result = -1;
    }
    
    if (result >=50)
    {
    System.out.print("Congratulations, you are awarded a Grade C Pass.");
    result = -1;
    }
    
    if (result >=40)
    {
    System.out.print("Congratulations, you are awarded a Grade D Pass.");
    result = -1;
    }
    
    if (result >= 0)
    {
    System.out.print("You received a Grade F Fail.");
    result = -1;
    }    
  
    return classification;    
  }
}