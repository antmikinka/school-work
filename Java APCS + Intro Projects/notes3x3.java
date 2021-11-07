import java.util.Scanner;
/**
 * Chapter 3 notes and how tos.
 *
 * @author (Anthony Mikinka)
 * @version (se8)
 */
public class notes3x3

{
   
    public static void main(String[] args)
    
    {
      
      Scanner scan = new Scanner(System.in);
      int x;
      System.out.println("Enter an integer");
      x = scan.nextInt(); //syntax for calling a method is dot notation
      scan.nextLine();
      System.out.println("Enter your message");
      String message = scan.nextLine();
      System.out.println("You enter " + x +  " " + message);
      int msgLen = message.length();
      System.out.println("Message has " + msgLen + " characters");
      
      String sentence = new String("Spring break.");
      int sentenceLen = sentence.length();
      System.out.println("Length of the sentance " + sentenceLen);
      char lastLetter = sentence.charAt(sentenceLen-1);
      System.out.println("Last letter " + lastLetter);
      System.out.println(sentence.toUpperCase());
      System.out.println(sentence.replace('.', '!'));
      sentence = sentence.replace('.', '!');
      String lastword = sentence.substring(7);
      System.out.println(lastword);
      int indx;
      indx = sentence.indexOf('w');
      System.out.println("w found at " + indx);
      indx = sentence.indexOf('b');
      String firstword = sentence.substring('o', indx);
      System.out.println(firstword);
      
      
      
    }

    
}
