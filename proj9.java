import java.util.Scanner;
/**e
 * Working with strings and creating string classes. This project is us learning how to manipulate strings by using 
 * some of the methods defined in the String class.
 * 
 *
 * @author (Anthony Mikinka)
 * @version (se8, 4/4/19)
 */
public class proj9
{
    public static void main(String[] args)
    {
       String bFranklin = new String("A penny saved is a penny earned");
       String byFranklin;
       String lastEight;
       char first; 
       char middle;
       char last;
       int phraseLength;
       phraseLength = bFranklin.length();
       last = bFranklin.charAt(phraseLength-1);
       middle = bFranklin.charAt(phraseLength/2);
       first = bFranklin.charAt(phraseLength-31);
       System.out.println("The length of bFranklin is " + phraseLength + ".");
       System.out.println("The last letter of bFranklin is " + last + ".");
       System.out.println("The middle letter of bFrankin is " + middle + ".");
       System.out.println("The first letter of bFranklin is " + first + ".");
       bFranklin = bFranklin.replace(" ", "\\");
       System.out.println(bFranklin);
       byFranklin = bFranklin.concat(":by Benjamin Franklin");
       System.out.println(byFranklin);
       phraseLength = byFranklin.length();
       lastEight = byFranklin.substring(phraseLength-8, phraseLength);
       System.out.println(lastEight);
       System.out.println(lastEight.toUpperCase() + lastEight + lastEight.toLowerCase());
       
       
       
       
       
       
       
    }
    }

