import java.util.*;
/**
 * Asterisk and letter pattern program.
 *
 * @author (AM)
 * @version (11/15/19)
 */
public class APCSLab11
{
    public static void main(String[] args){
      int row;
      Scanner scan = new Scanner(System.in);
      System.out.println("How many asterisks in the first line?");
      row = scan.nextInt();
      for(int count = row; count < 10; count++)

        {

            for(int index = 1; index < count+1; index++)

                System.out.print(" ");
            for(int star = 1; star > count; star--)

                System.out.print("*");

            System.out.println(); 
        }
            
        
    }


}
