import java.util.*;
/**
 * A program that has the ability to encode messages. Then have it only contain the first five chararcters, have the rest discarded.
 *
 * @author (AM)
 * @version (9/23/19)
 */
public class apCSLab3
{
    public static void main(String []s)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentance.");// gets input from user
        String sent = scan.nextLine();
        int sen1Len = sent.length();
        char letter1 = sent.charAt(0);//extracts first five even numbered indexes
        char letter2 = sent.charAt(2);
        char letter3 = sent.charAt(4);
        char letter4 = sent.charAt(6);
        char letter5 = sent.charAt(8);
        
        
        String outputSent =letter1+""+letter2+letter3+""+letter4+""+letter5;//adds the indexes together
        
        
        System.out.println(outputSent);//prints the five characters
        
        
        
        
    }
}

