import java.util.*;
/**
 * A program that reads the full name of an individual and have the names printed as well as the lengths.
 *
 * @author (AM)
 * @version (9/24/19)
 */
public class apCSLab4
{
  public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name.");
        String fullName = scan.nextLine();
        
        int space = fullName.indexOf(' ');// find the space between first and last names
        
        String firName = fullName.substring(0, space); //extract first name
        
        
        String fiNameStart = firName.substring(0, 1);
        fiNameStart = fiNameStart.toUpperCase();
        String fiNameRemain = firName.substring(1);
        fiNameRemain = fiNameRemain.toLowerCase();
        firName = fiNameStart + fiNameRemain;
      
        int fNameLen = firName.length();
        
        String lasName = fullName.substring(space + 1);//extract last name
        
        
        String laNameStart = lasName.substring(0, 1);
        laNameStart = laNameStart.toUpperCase();
        String laNameRemain = lasName.substring(1);
        laNameRemain = laNameRemain.toLowerCase();
        lasName = laNameStart + laNameRemain;
        
        int lNameLen = lasName.length();
        
        System.out.println(fullName);// print fullname
        System.out.println(firName + " is " + space + " long");//print first name length with name
        
        System.out.println(lasName + " is " + space + " long");//print last name length with name
    }

   
}
